/**
 * mycollab-scheduler - Parent pom providing dependency and plugin management for applications
		built with Maven
 * Copyright © ${project.inceptionYear} MyCollab (support@mycollab.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.schedule.email.format

import com.hp.gagawa.java.elements.Span
import com.mycollab.core.utils.StringUtils
import com.mycollab.schedule.email.MailContext
import org.apache.commons.beanutils.PropertyUtils
import org.slf4j.LoggerFactory

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
class DefaultFieldFormat(fieldName: String, displayName: Enum<*>, isColSpan: Boolean) : FieldFormat(fieldName, displayName, isColSpan) {
    companion object {
        private val LOG = LoggerFactory.getLogger(DefaultFieldFormat::class.java)
    }

    constructor(fieldName: String, displayName: Enum<*>) : this(fieldName, displayName, false)

    override fun formatField(context: MailContext<*>): String {
        val wrappedBean = context.wrappedBean

        return try {
            val value = PropertyUtils.getProperty(wrappedBean, fieldName)
            when (value) {
                null -> Span().write()
                else -> Span().appendText(value.toString()).write()
            }
        } catch (e: Exception) {
            LOG.error("Can not generate email field: $fieldName", e)
            Span().write()
        }
    }

    override fun formatField(context: MailContext<*>, value: String): String =
            if (StringUtils.isBlank(value)) Span().write() else value
}
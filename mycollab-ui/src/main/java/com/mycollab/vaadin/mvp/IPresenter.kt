/**
 * mycollab-ui - Parent pom providing dependency and plugin management for applications
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
package com.mycollab.vaadin.mvp

import com.vaadin.ui.HasComponents

import java.io.Serializable

/**
 * @param <V>
 * @author MyCollab Ltd
 * @since 2.0
</V> */
interface IPresenter<out V : PageView> : Serializable {

    /**
     * @param container
     * @param pageActionChain
     */
    fun handleChain(container: HasComponents, pageActionChain: PageActionChain)

    /**
     * @param container
     * @param data
     */
    fun go(container: HasComponents, data: ScreenData<Any>?): Boolean

    /**
     * @return
     */
    fun getView(): V?
}

/**
 * mycollab-caching - Parent pom providing dependency and plugin management for applications
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
package com.mycollab.concurrent

import com.mycollab.spring.AppContextUtil
import org.apache.commons.collections.map.AbstractReferenceMap
import org.apache.commons.collections.map.ReferenceMap
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.util.Collections
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * @author MyCollab Ltd.
 * @since 4.5.2
 */
object DistributionLockUtil {
    private val LOG = LoggerFactory.getLogger(DistributionLockUtil::class.java)

    private val map = Collections.synchronizedMap(ReferenceMap(AbstractReferenceMap.WEAK, AbstractReferenceMap.WEAK))

    @JvmStatic fun getLock(lockName: String): Lock {
        return try {
            val lockService = AppContextUtil.getSpringBean(DistributionLockService::class.java)
            val lock = lockService.getLock(lockName)
            lock ?: getStaticDefaultLock(lockName)
        } catch (e: Exception) {
            LOG.warn("Can not get lock service", e)
            getStaticDefaultLock(lockName)
        }

    }

    @JvmStatic fun removeLock(lockName: String) {
        map.remove(lockName)
    }

    private fun getStaticDefaultLock(lockName: String): Lock {
        synchronized(map) {
            var lock: Lock? = map[lockName] as? Lock
            when (lock) {
                null -> {
                    lock = ReentrantLock()
                    map.put(lockName, lock)
                }
            }
            return lock!!
        }
    }
}

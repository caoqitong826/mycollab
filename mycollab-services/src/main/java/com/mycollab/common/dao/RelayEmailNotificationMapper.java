/**
 * mycollab-services - Parent pom providing dependency and plugin management for applications
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
package com.mycollab.common.dao;

import com.mycollab.common.domain.RelayEmailNotificationExample;
import com.mycollab.common.domain.RelayEmailNotificationWithBLOBs;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface RelayEmailNotificationMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    long countByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int deleteByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int insert(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int insertSelective(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    List<RelayEmailNotificationWithBLOBs> selectByExampleWithBLOBs(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    RelayEmailNotificationWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int updateByExampleSelective(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int updateByPrimaryKeySelective(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    int updateByPrimaryKeyWithBLOBs(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    Integer insertAndReturnKey(RelayEmailNotificationWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Tue Aug 01 11:17:32 ICT 2017
     */
    void massUpdateWithSession(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}
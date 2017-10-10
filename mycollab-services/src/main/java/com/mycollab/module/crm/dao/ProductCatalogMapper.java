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
package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.ProductCatalog;
import com.mycollab.module.crm.domain.ProductCatalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProductCatalogMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    long countByExample(ProductCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int deleteByExample(ProductCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Delete({
        "delete from m_crm_product_catalog",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Insert({
        "insert into m_crm_product_catalog (id, url, ",
        "taxclass, mft_partnumber, ",
        "vendor_partnumber, currencyid, ",
        "cost, listprice, discountprice, ",
        "pricing_formula, description, ",
        "date_available, availability, ",
        "quantity_in_stock, support_name, ",
        "support_contact, support_desc, ",
        "support_term, productname, ",
        "sAccountId, createdTime, ",
        "lastUpdatedTime)",
        "values (#{id,jdbcType=INTEGER}, #{url,jdbcType=VARCHAR}, ",
        "#{taxclass,jdbcType=VARCHAR}, #{mftPartnumber,jdbcType=VARCHAR}, ",
        "#{vendorPartnumber,jdbcType=VARCHAR}, #{currencyid,jdbcType=VARCHAR}, ",
        "#{cost,jdbcType=DOUBLE}, #{listprice,jdbcType=DOUBLE}, #{discountprice,jdbcType=DOUBLE}, ",
        "#{pricingFormula,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{dateAvailable,jdbcType=TIMESTAMP}, #{availability,jdbcType=VARCHAR}, ",
        "#{quantityInStock,jdbcType=VARCHAR}, #{supportName,jdbcType=VARCHAR}, ",
        "#{supportContact,jdbcType=VARCHAR}, #{supportDesc,jdbcType=VARCHAR}, ",
        "#{supportTerm,jdbcType=VARCHAR}, #{productname,jdbcType=VARCHAR}, ",
        "#{saccountid,jdbcType=INTEGER}, #{createdtime,jdbcType=TIMESTAMP}, ",
        "#{lastupdatedtime,jdbcType=TIMESTAMP})"
    })
    int insert(ProductCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int insertSelective(ProductCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    List<ProductCatalog> selectByExample(ProductCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Select({
        "select",
        "id, url, taxclass, mft_partnumber, vendor_partnumber, currencyid, cost, listprice, ",
        "discountprice, pricing_formula, description, date_available, availability, quantity_in_stock, ",
        "support_name, support_contact, support_desc, support_term, productname, sAccountId, ",
        "createdTime, lastUpdatedTime",
        "from m_crm_product_catalog",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.ProductCatalogMapper.BaseResultMap")
    ProductCatalog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByExampleSelective(@Param("record") ProductCatalog record, @Param("example") ProductCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByExample(@Param("record") ProductCatalog record, @Param("example") ProductCatalogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByPrimaryKeySelective(ProductCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Update({
        "update m_crm_product_catalog",
        "set url = #{url,jdbcType=VARCHAR},",
          "taxclass = #{taxclass,jdbcType=VARCHAR},",
          "mft_partnumber = #{mftPartnumber,jdbcType=VARCHAR},",
          "vendor_partnumber = #{vendorPartnumber,jdbcType=VARCHAR},",
          "currencyid = #{currencyid,jdbcType=VARCHAR},",
          "cost = #{cost,jdbcType=DOUBLE},",
          "listprice = #{listprice,jdbcType=DOUBLE},",
          "discountprice = #{discountprice,jdbcType=DOUBLE},",
          "pricing_formula = #{pricingFormula,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "date_available = #{dateAvailable,jdbcType=TIMESTAMP},",
          "availability = #{availability,jdbcType=VARCHAR},",
          "quantity_in_stock = #{quantityInStock,jdbcType=VARCHAR},",
          "support_name = #{supportName,jdbcType=VARCHAR},",
          "support_contact = #{supportContact,jdbcType=VARCHAR},",
          "support_desc = #{supportDesc,jdbcType=VARCHAR},",
          "support_term = #{supportTerm,jdbcType=VARCHAR},",
          "productname = #{productname,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProductCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    Integer insertAndReturnKey(ProductCatalog value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product_catalog
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    void massUpdateWithSession(@Param("record") ProductCatalog record, @Param("primaryKeys") List primaryKeys);
}
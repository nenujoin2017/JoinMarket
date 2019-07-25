package com.nenu.market.mapper.company;

import com.nenu.market.entity.company.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: kyy
 * @Description:
 * @Date: 14:52 2019/7/23
 */
@Mapper
@Repository
public interface CompanyMapper {

    /**
     * 添加单位
     * @return
     * @throws Exception
     */
    public boolean addCompany(@Param("company") Company company) throws Exception;

    /**
     * 关键字搜索
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Company> selectCompany(@Param("keyword") String keyword) throws Exception;

    /**
     * 列出所有单位
     * @return
     * @throws Exception
     */
    public List<Company> listAllCompany() throws Exception;

    public List<Company> listVisit() throws Exception;

    public List<Company> listReturn() throws Exception;

    public List<Company> listSign() throws Exception;

    public Company getCompanyById(@Param("id") int id) throws Exception;


}

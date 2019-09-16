package com.nenu.market.service.company;

import com.nenu.market.entity.company.Company;

import java.util.List;

/**
 * @Author: kyy
 * @Description:
 * @Date: 14:59 2019/7/23
 */
public interface CompanyService {

    /**
     * 添加单位
     * @return
     * @throws Exception
     */
    public boolean addCompany(Company company) throws Exception;

    /**
     * 关键字搜索
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Company> selectCompany(String keyword) throws Exception;

    /**
     * 列出所有单位
     * @return
     * @throws Exception
     */
    public List<Company> listAllCompany() throws Exception;

    public List<Company> listVisit() throws Exception;

    public List<Company> listReturn() throws Exception;

    public List<Company> listSign() throws Exception;

    public Company getIdByName(String company_name) throws Exception;
}

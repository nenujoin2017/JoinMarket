package com.nenu.market.service.company.impl;

import com.nenu.market.entity.company.Company;
import com.nenu.market.mapper.company.CompanyMapper;
import com.nenu.market.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author: kyy
 * @Description:
 * @Date: 14:59 2019/7/23
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    /**
     * 添加单位
     * @return
     * @throws Exception
     */
    public boolean addCompany(Company company) throws Exception{
        return companyMapper.addCompany(company);
    }

    /**
     * 关键字搜索
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Company> selectCompany(String keyword) throws Exception{
        keyword = "%" + keyword+ "%";
        List<Company> list = Collections.emptyList();
        list = companyMapper.selectCompany(keyword);
        return list;
    }

    /**
     * 列出所有单位
     * @return
     * @throws Exception
     */
    public List<Company> listAllCompany() throws Exception{
        List<Company> list = Collections.emptyList();
        list = companyMapper.listAllCompany();
        return list;
    }

    public List<Company> listVisit() throws Exception{
        List<Company> list = Collections.emptyList();
        list = companyMapper.listVisit();
        return list;
    }

    public List<Company> listReturn() throws Exception{
        List<Company> list = Collections.emptyList();
        list = companyMapper.listReturn();
        return list;
    }

    public List<Company> listSign() throws Exception{
        List<Company> list = Collections.emptyList();
        list = companyMapper.listSign();
        return list;
    }

    public Company getIdByName(String company_name) throws Exception{
        Company company = companyMapper.getIdByName(company_name);
        return company;
    }
}

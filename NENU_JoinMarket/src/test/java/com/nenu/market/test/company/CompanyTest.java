package com.nenu.market.test.company;

import com.nenu.market.entity.company.Company;
import com.nenu.market.service.company.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: kyy
 * @Description:
 * @Date: 9:53 2019/7/24
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyTest {

    @Autowired
    CompanyService companyService;

    @Test
    public void testAddCompany() throws Exception{
        Company company = new Company();
        company.setCompany_name("吉林大学");
        company.setCompany_nature("高等教育单位");
        company.setCompany_city("长春市");
        System.out.println(companyService.addCompany(company));
    }

    @Test
    public void listAllCompany() throws Exception{
        System.out.println(companyService.listAllCompany());
    }

    @Test
    public void testSelectCompany() throws Exception{
        String keyword="东北";
        System.out.println(companyService.selectCompany(keyword));
    }

    @Test
    public void testListVisit() throws Exception{
        System.out.println(companyService.listVisit());
    }

    @Test
    public void testListReturn() throws Exception{
        System.out.println(companyService.listReturn());
    }

    @Test
    public void testListSign() throws Exception{
        System.out.println(companyService.listSign());
    }

    @Test
    public void testGetIdByName() throws Exception{
        String company_name="东师";
        System.out.println(companyService.getIdByName(company_name));
    }
 }

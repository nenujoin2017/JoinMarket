package com.nenu.market.entity.company;

/**
 * @Author: kyy
 * @Description:
 * @Date: 14:48 2019/7/23
 */
public class Company {

    private Integer id;

    private String company_name;

    private String company_nature;

    private String company_city;

    private String province;

    //历年走访次数
    private Integer total_visit;

    //来校宣讲次数
    private Integer total_return;

    //历年签约人数
    private Integer total_sign;

    private String company;

    private String signCompany;

    private String unitName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_nature() {
        return company_nature;
    }

    public void setCompany_nature(String company_nature) {
        this.company_nature = company_nature;
    }

    public String getCompany_city() {
        return company_city;
    }

    public void setCompany_city(String company_city) {
        this.company_city = company_city;
    }

    public Integer getTotal_visit() {
        return total_visit;
    }

    public void setTotal_visit(Integer total_visit) {
        this.total_visit = total_visit;
    }

    public Integer getTotal_return() {
        return total_return;
    }

    public void setTotal_return(Integer total_return) {
        this.total_return = total_return;
    }

    public Integer getTotal_sign() {
        return total_sign;
    }

    public void setTotal_sign(Integer total_sign) {
        this.total_sign = total_sign;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSignCompany() {
        return signCompany;
    }

    public void setSignCompany(String signCompany) {
        this.signCompany = signCompany;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", company_nature='" + company_nature + '\'' +
                ", company_city='" + company_city + '\'' +
                ", province='" + province + '\'' +
                ", total_visit=" + total_visit +
                ", total_return=" + total_return +
                ", total_sign=" + total_sign +
                ", company='" + company + '\'' +
                ", signCompany='" + signCompany + '\'' +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}

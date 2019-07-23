package com.nenu.market.entity.visitor;

/**
 * @Author: CaiyuHan
 * @Description: Visitor实体类
 * @Date: 16:44 2019/5/16
 */

public class Visitor {
    //id
    int id;

    //走访人员
    private String visitor_name;

    //时间
    private String time;

    //单位名称
    private String company_name;

    //单位性质
    private String company_nature;

    //通讯地址
    private String company_place;

    //邮编
    private String postcode;

    //单位信息反馈
    private String feedback;

    //简要总结
    private String conclude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getCompany_place() {
        return company_place;
    }

    public void setCompany_place(String company_place) {
        this.company_place = company_place;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getConclude() {
        return conclude;
    }

    public void setConclude(String conclude) {
        this.conclude = conclude;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", visitor_name='" + visitor_name + '\'' +
                ", time='" + time + '\'' +
                ", company_name='" + company_name + '\'' +
                ", company_nature='" + company_nature + '\'' +
                ", company_place='" + company_place + '\'' +
                ", postcode='" + postcode + '\'' +
                ", feedback='" + feedback + '\'' +
                ", conclude='" + conclude + '\'' +
                '}';
    }
}

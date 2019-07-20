package com.nenu.market.entity.position_requirements;

/**
 * @Author: Liang Jiayue
 * @Description:岗位需求的实体类
 * @Date: 21:16 2019/5/16
 */
public class PositionRequirements {
    //id
    private int id;

    //单位名称
    private String company_name;

    //学科
    private String subject;

    //学历
    private String education;

    //数量
    private int number;

    //其他
    private String others;

    //走访人员
    private String visitor_name;

    //时间
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
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

    @Override
    public String toString() {
        return "PositionRequirements{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", subject='" + subject + '\'' +
                ", education='" + education + '\'' +
                ", number=" + number +
                ", others='" + others + '\'' +
                ", visitor_name='" + visitor_name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

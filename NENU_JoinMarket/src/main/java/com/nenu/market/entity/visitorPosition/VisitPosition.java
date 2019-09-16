package com.nenu.market.entity.visitorPosition;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 16:21 2019/5/20
 */
public class VisitPosition {

    private Integer id;
    private String company_name;
    private String contact;
    private String position;
    private String mobiephone;
    private String fixedphone;
    private String email;
    private String webchatqq;
    private String visitor_name;
    private String time;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobiephone() {
        return mobiephone;
    }

    public void setMobiephone(String mobiephone) {
        this.mobiephone = mobiephone;
    }

    public String getFixedphone() {
        return fixedphone;
    }

    public void setFixedphone(String fixedphone) {
        this.fixedphone = fixedphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebchatqq() {
        return webchatqq;
    }

    public void setWebchatqq(String webchatqq) {
        this.webchatqq = webchatqq;
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
        return "VisitPosition{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", contact='" + contact + '\'' +
                ", position='" + position + '\'' +
                ", mobiephone='" + mobiephone + '\'' +
                ", fixedphone='" + fixedphone + '\'' +
                ", email='" + email + '\'' +
                ", webchatqq='" + webchatqq + '\'' +
                ", visitor_name='" + visitor_name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

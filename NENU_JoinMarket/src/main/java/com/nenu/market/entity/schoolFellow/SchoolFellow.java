package com.nenu.market.entity.schoolFellow;

/**
 * @author : kongyy
 * @time : 2019/5/15 19:45
 */
public class SchoolFellow {

    private Integer id;

    private String company_name;

    private String name;

    private String major;

    private String education;

    private String time;

    private String contact;

    private String visitor_name;

    private String visitor_time;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getVisitor_time() {
        return visitor_time;
    }

    public void setVisitor_time(String visitor_time) {
        this.visitor_time = visitor_time;
    }

    @Override
    public String toString() {
        return "SchoolFellow{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", education='" + education + '\'' +
                ", time='" + time + '\'' +
                ", contact='" + contact + '\'' +
                ", visitor_name='" + visitor_name + '\'' +
                ", visitor_time='" + visitor_time + '\'' +
                '}';
    }
}

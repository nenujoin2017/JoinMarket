package com.nenu.market.entity.student;

/**
 * @Author: Liangll
 * @Description: 单位详细信息学生实体类
 * @Date: 19:02 2019/7/18
 */
public class Student {

    private Integer id;

    private String studentName;

    private String sex;

    private String nation;

    private String education;

    private String signType;

    private String college;

    private String major;

    private String studentFrom;

    private String position;

    private String student_year;

    private String signCompany;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentFrom() {
        return studentFrom;
    }

    public void setStudentFrom(String studentFrom) {
        this.studentFrom = studentFrom;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStudent_year() {
        return student_year;
    }

    public void setStudent_year(String student_year) {
        this.student_year = student_year;
    }

    public String getSignCompany() {
        return signCompany;
    }

    public void setSignCompany(String signCompany) {
        this.signCompany = signCompany;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", education='" + education + '\'' +
                ", signType='" + signType + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", studentFrom='" + studentFrom + '\'' +
                ", position='" + position + '\'' +
                ", student_year='" + student_year + '\'' +
                ", signCompany='" + signCompany + '\'' +
                ", companyId=" + companyId +
                '}';
    }
}

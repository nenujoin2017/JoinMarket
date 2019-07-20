package com.nenu.market.entity.city;

/**
 * @Author: Liang Jiayue
 * @Description:教育行业的实体类
 * @Date: 16:16 2019/5/17
 */

public class Education {

    private int id;

    private int city_year;

    private String province;

    private String city_name;

    private double city_exceptation;

    private int city_sign;

    private int city_studentFrom;

    private int city_visit;

    private int city_recency;

    private String city_grading;

    private double city_score;

    private int city_unit;

    private String education_yon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_year() {
        return city_year;
    }

    public void setCity_year(int city_year) {
        this.city_year = city_year;
    }

    public String getProvince(){
        return province;
    }

    public void setProvince(String province){
        this.province = province;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public double getCity_exceptation() {
        return city_exceptation;
    }

    public void setCity_exceptation(double city_exceptation) {
        this.city_exceptation = city_exceptation;
    }

    public int getCity_sign() {
        return city_sign;
    }

    public void setCity_sign(int city_sign) {
        this.city_sign = city_sign;
    }

    public int getCity_studentFrom() {
        return city_studentFrom;
    }

    public void setCity_studentFrom(int city_studentFrom) {
        this.city_studentFrom = city_studentFrom;
    }

    public int getCity_visit() {
        return city_visit;
    }

    public void setCity_visit(int city_visit) {
        this.city_visit = city_visit;
    }

    public int getCity_recency() {
        return city_recency;
    }

    public void setCity_recency(int city_recency) {
        this.city_recency = city_recency;
    }

    public String getCity_grading() {
        return city_grading;
    }

    public void setCity_grading(String city_grading) {
        this.city_grading = city_grading;
    }

    public double getCity_score() {
        return city_score;
    }

    public void setCity_score(double city_score) {
        this.city_score = city_score;
    }

    public int getCity_unit() {
        return city_unit;
    }

    public void setCity_unit(int city_unit) {
        this.city_unit = city_unit;
    }

    public String getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(String education_yon) {
        this.education_yon = education_yon;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", city_year=" + city_year +
                ", province='" + province + '\'' +
                ", city_name='" + city_name + '\'' +
                ", city_exceptation='" + city_exceptation + '\'' +
                ", city_sign='" + city_sign + '\'' +
                ", city_studentFrom='" + city_studentFrom + '\'' +
                ", city_visit='" + city_visit + '\'' +
                ", city_recency='" + city_recency + '\'' +
                ", city_grading='" + city_grading + '\'' +
                ", city_score=" + city_score +
                ", city_unit=" + city_unit +
                ", education_yon='" + education_yon + '\'' +
                '}';
    }
}

package com.nenu.market.entity.city;

public class Education {

    private int id;

    private int year;

    //感觉没什么用
    private int city_code;

    private String province;

    private String city_name;

    private String city_exception;

    private String city_sign;

    private String city_studentFrom;

    private String city_visit;

    private String city_recency;

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

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getProvince(){
        return province;
    }

    public void setProvince(String province){
        this.province = province;
    }

    public int getCity_code() {
        return city_code;
    }

    public void setCity_code(int city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_exception() {
        return city_exception;
    }

    public void setCity_exception(String city_exception) {
        this.city_exception = city_exception;
    }

    public String getCity_sign() {
        return city_sign;
    }

    public void setCity_sign(String city_sign) {
        this.city_sign = city_sign;
    }

    public String getCity_studentFrom() {
        return city_studentFrom;
    }

    public void setCity_studentFrom(String city_studentFrom) {
        this.city_studentFrom = city_studentFrom;
    }

    public String getCity_visit() {
        return city_visit;
    }

    public void setCity_visit(String city_visit) {
        this.city_visit = city_visit;
    }

    public String getCity_recency() {
        return city_recency;
    }

    public void setCity_recency(String city_recency) {
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
                ", year=" + year +
                ", city_code=" + city_code +
                ", city_name='" + city_name + '\'' +
                ", city_exception='" + city_exception + '\'' +
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

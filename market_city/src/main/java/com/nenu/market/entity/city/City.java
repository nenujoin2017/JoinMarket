package com.nenu.market.entity.city;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 23:51 2019/5/8
 */
public class City {

    private int id;

    private int city_code;

    private String city_name;

    private int year;

    private String city_exceptation;

    private String city_sign;

    private String city_studentFrom;

    private String city_visit;

    private String city_recency;

    private String city_grading;

    private String city_score;

    private int city_unit;

    private int city_people;

    private int education_yon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity_exceptation() {
        return city_exceptation;
    }

    public void setCity_exceptation(String city_exceptation) {
        this.city_exceptation = city_exceptation;
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

    public String getCity_score() {
        return city_score;
    }

    public void setCity_score(String city_score) {
        this.city_score = city_score;
    }

    public int getCity_unit() {
        return city_unit;
    }

    public void setCity_unit(int city_unit) {
        this.city_unit = city_unit;
    }

    public int getCity_people() {
        return city_people;
    }

    public void setCity_people(int city_people) {
        this.city_people = city_people;
    }

    public int getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(int education_yon) {
        this.education_yon = education_yon;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city_code=" + city_code +
                ", city_name='" + city_name + '\'' +
                ", year=" + year +
                ", city_exceptation='" + city_exceptation + '\'' +
                ", city_sign='" + city_sign + '\'' +
                ", city_studentFrom='" + city_studentFrom + '\'' +
                ", city_visit='" + city_visit + '\'' +
                ", city_recency='" + city_recency + '\'' +
                ", city_grading='" + city_grading + '\'' +
                ", city_score='" + city_score + '\'' +
                ", city_unit=" + city_unit +
                ", city_people=" + city_people +
                ", education_yon=" + education_yon +
                '}';
    }
}
package com.nenu.market.entity.totalvisit;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 23:56 2019/5/8
 */
public class TotalVisit {

    private int id;

    private String city_name;

    private int year;

    private int visitCount;

    private int returnCount;

    private int signNumber_b;

    private int signNumber_y;

    private int education_yon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public int getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(int returnCount) {
        this.returnCount = returnCount;
    }

    public int getSignNumber_b() {
        return signNumber_b;
    }

    public void setSignNumber_b(int signNumber_b) {
        this.signNumber_b = signNumber_b;
    }

    public int getSignNumber_y() {
        return signNumber_y;
    }

    public void setSignNumber_y(int signNumber_y) {
        this.signNumber_y = signNumber_y;
    }

    public int getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(int education_yon) {
        this.education_yon = education_yon;
    }

    @Override
    public String toString() {
        return "TotalVisit{" +
                "id=" + id +
                ", city_name='" + city_name + '\'' +
                ", year=" + year +
                ", visitCount=" + visitCount +
                ", returnCount=" + returnCount +
                ", signNumber_b=" + signNumber_b +
                ", signNumber_y=" + signNumber_y +
                ", education_yon=" + education_yon +
                '}';
    }
}

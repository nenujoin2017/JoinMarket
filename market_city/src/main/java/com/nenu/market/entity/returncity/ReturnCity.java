package com.nenu.market.entity.returncity;

public class ReturnCity {
    private String city_name;

    private String province;

    private Integer returnCount;

    private Integer visitCount;

    private Integer year;

    private Integer education_yon;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(Integer education_yon) {
        this.education_yon = education_yon;
    }

    @Override
    public String toString() {
        return "ReturnCityController{" +
                "city_name='" + city_name + '\'' +
                ", province='" + province + '\'' +
                ", returnCount=" + returnCount +
                ", visitCount=" + visitCount +
                ", year=" + year +
                ", education_yon=" + education_yon +
                '}';
    }
}

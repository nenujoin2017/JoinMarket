package com.nenu.market.entity.studentFrom;

/**
 * @author : kongyy
 * @time : 2019/5/9 8:48
 */
public class StudentFrom {
    private Integer year;

    private String province;

    private String city_name;

    private Integer city_studentFrom;

    private Integer education_yon;

    private Integer max;

    private Integer min;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getCity_studentFrom() {
        return city_studentFrom;
    }

    public void setCity_studentFrom(Integer city_studentFrom) {
        this.city_studentFrom = city_studentFrom;
    }

    public Integer getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(Integer education_yon) {
        this.education_yon = education_yon;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "StudentFrom{" +
                "year=" + year +
                ", province='" + province + '\'' +
                ", city_name='" + city_name + '\'' +
                ", city_studentFrom=" + city_studentFrom +
                ", education_yon=" + education_yon +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}

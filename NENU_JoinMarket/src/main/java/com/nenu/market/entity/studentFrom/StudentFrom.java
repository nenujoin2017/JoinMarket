package com.nenu.market.entity.studentFrom;

/**
 * @author : kongyy
 * @time : 2019/5/9 8:48
 */
public class StudentFrom {

    private Integer city_year;

    private String province;

    private String city_name;

    private Integer city_studentFrom;

    private Integer education_yon;

    private Integer max;

    private Integer min;

    private String student_rate;

    private String student_rank;

    public Integer getCity_year() {
        return city_year;
    }

    public void setCity_year(Integer city_year) {
        this.city_year = city_year;
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


    public String getStudent_rate() {
        return student_rate;
    }

    public void setStudent_rate(String student_rate) {
        this.student_rate = student_rate;
    }

    public String getStudent_rank() {
        return student_rank;
    }

    public void setStudent_rank(String student_rank) {
        this.student_rank = student_rank;
    }

    @Override
    public String toString() {
        return "StudentFrom{" +
                "city_year=" + city_year +
                ", province='" + province + '\'' +
                ", city_name='" + city_name + '\'' +
                ", city_studentFrom=" + city_studentFrom +
                ", education_yon=" + education_yon +
                ", max=" + max +
                ", min=" + min +
                ", student_rate='" + student_rate + '\'' +
                ", student_rank='" + student_rank + '\'' +
                '}';
    }
}

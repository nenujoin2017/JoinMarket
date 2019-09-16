package com.nenu.market.entity.returncity;

/**
 * @author : kongyy
 * @time : 2019/5/7 17:58
 */
public class ReturnCity {
    private String city_name;

    private String province;

    private Integer returnCount;

    private Integer visitCount;

    private Integer city_year;

    private Integer education_yon;

    private String return_rate;

    private String return_rank;


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
        return city_year;
    }

    public void setCity_year(Integer city_year) {
        this.city_year = city_year;
    }

    public Integer getEducation_yon() {
        return education_yon;
    }

    public void setEducation_yon(Integer education_yon) {
        this.education_yon = education_yon;
    }

    public Integer getCity_year() {
        return city_year;
    }

    public String getReturn_rate() {
        return return_rate;
    }

    public void setReturn_rate(String return_rate) {
        this.return_rate = return_rate;
    }

    public String getReturn_rank() {
        return return_rank;
    }

    public void setReturn_rank(String return_rank) {
        this.return_rank = return_rank;
    }

    @Override
    public String toString() {
        return "ReturnCity{" +
                "city_name='" + city_name + '\'' +
                ", province='" + province + '\'' +
                ", returnCount=" + returnCount +
                ", visitCount=" + visitCount +
                ", city_year=" + city_year +
                ", education_yon=" + education_yon +
                ", return_rate='" + return_rate + '\'' +
                ", return_rank='" + return_rank + '\'' +
                '}';
    }
}

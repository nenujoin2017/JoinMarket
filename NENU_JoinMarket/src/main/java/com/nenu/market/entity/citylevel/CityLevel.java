package com.nenu.market.entity.citylevel;

//@Table(name = "t_citylevel")
//@Entity
public class CityLevel {
    //id
//    @Id
    private Integer id;

    //城市名（外键）
//    @Column(name="city_name")
    private String cityName;

    //城市分级
//    @Column(name = "city_rank")
    private String cityRank;

    //权重分析
//    @Column(name = "city_grading")
    private String cityGrading;

    //一带一路政策
//    @Column(name = "road")
    private String road;

    //省份
//    @Column(name = "proince")
    private String province;

    public CityLevel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityRank() {
        return cityRank;
    }

    public void setCityRank(String cityRank) {
        this.cityRank = cityRank;
    }

    public String getCityGrading() {
        return cityGrading;
    }

    public void setCityGrading(String cityGrading) {
        this.cityGrading = cityGrading;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "CityLevel{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityRank='" + cityRank + '\'' +
                ", cityGrading='" + cityGrading + '\'' +
                ", road='" + road + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}

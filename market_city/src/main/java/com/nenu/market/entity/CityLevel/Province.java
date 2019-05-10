package com.nenu.market.entity.CityLevel;

//@Table(name = "t_province")
//@Entity
public class Province {
    //id
   // @Id
    private int id;

    //城市名
   // @Column(name = "city")
    private String city;

    //省名
   // @Column(name = "province")
    private String province;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}

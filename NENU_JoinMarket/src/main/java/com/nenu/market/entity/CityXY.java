package com.nenu.market.entity;

public class CityXY {
    //主键
    private Integer id;
    //城市编码
    private int code;
    //城市名
    private String name;
    //数据所属年份
    private String year;
    //当年该城市的期望
    private String expect;
    //当年该城市的签约人数
    private String sign;
    //当年该城市的生源数
    private String studentFrom;
    //走访
    private String visit;
    //回访率
    private String recency;
    private String grading;
    private String score;
    private String unit;
    private String people;

    //测试使用的临时属性
    private int cPid;
    private String cName;
    //省
    private String cProvince;
    private int totalSignDuringFiveYear;


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTotalSignDuringFiveYear() {
        return totalSignDuringFiveYear;
    }

    public void setTotalSignDuringFiveYear(int totalSignDuringFiveYear) {
        this.totalSignDuringFiveYear = totalSignDuringFiveYear;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcPid() {
        return cPid;
    }

    public void setcPid(int cPid) {
        this.cPid = cPid;
    }

    //测试结束

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExceptaion() {
        return expect;
    }

    public void setExceptaion(String exceptaion) {
        this.expect = exceptaion;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getStudentFrom() {
        return studentFrom;
    }

    public void setStudentFrom(String studentFrom) {
        this.studentFrom = studentFrom;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getRecency() {
        return recency;
    }

    public void setRecency(String recency) {
        this.recency = recency;
    }

    public String getGrading() {
        return grading;
    }

    public void setGrading(String grading) {
        this.grading = grading;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }


    @Override
    public String toString() {
        return "CityXY{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", expect='" + expect + '\'' +
                ", sign='" + sign + '\'' +
                ", studentFrom='" + studentFrom + '\'' +
                ", visit='" + visit + '\'' +
                ", recency='" + recency + '\'' +
                ", grading='" + grading + '\'' +
                ", score='" + score + '\'' +
                ", unit='" + unit + '\'' +
                ", people='" + people + '\'' +
                ", cPid=" + cPid +
                ", cName='" + cName + '\'' +
                ", cProvince='" + cProvince + '\'' +
                ", totalSignDuringFiveYear=" + totalSignDuringFiveYear +
                '}';
    }
}


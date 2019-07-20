package com.nenu.market.entity.participation_intention;

/**
 * @Author: Liang Jiayue
 * @Description:参会意向的实体类
 * @Date: 16:16 2019/5/17
 */
public class ParticipationIntention {

    //id
    private int id;

    //单位名称
    private String company_name;

    //秋季非师范毕业生专场
    private int autumn_notnomal;

    //秋季精品洽谈月专场
    private int autumn_goodquality;

    //全国高校毕业生教育人才招聘会
    private int national;

    //春季非师范毕业生专场
    private int spring_notnomal;

    //春季精品洽谈月专场
    private int spring_goodquality;

    //网上发布招聘信息
    private int internet;

    //暂不考虑参加招聘会
    private int nofair;

    //走访人员
    private String visitor_name;

    //时间
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getAutumn_notnomal() {
        return autumn_notnomal;
    }

    public void setAutumn_notnomal(int autumn_notnomal) {
        this.autumn_notnomal = autumn_notnomal;
    }

    public int getAutumn_goodquality() {
        return autumn_goodquality;
    }

    public void setAutumn_goodquality(int autumn_goodquality) {
        this.autumn_goodquality = autumn_goodquality;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
    }

    public int getSpring_notnomal() {
        return spring_notnomal;
    }

    public void setSpring_notnomal(int spring_notnomal) {
        this.spring_notnomal = spring_notnomal;
    }

    public int getSpring_goodquality() {
        return spring_goodquality;
    }

    public void setSpring_goodquality(int spring_goodquality) {
        this.spring_goodquality = spring_goodquality;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getNofair() {
        return nofair;
    }

    public void setNofair(int nofair) {
        this.nofair = nofair;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ParticipationIntention{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", autumn_notnomal=" + autumn_notnomal +
                ", autumn_goodquality=" + autumn_goodquality +
                ", national=" + national +
                ", spring_notnomal=" + spring_notnomal +
                ", spring_goodquality=" + spring_goodquality +
                ", internet=" + internet +
                ", nofair=" + nofair +
                ", visitor_name='" + visitor_name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

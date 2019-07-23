package com.nenu.market.entity;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 20:27 2019/7/18
 */


public class PreachInformation {
    int unitNumber;
    String unitName;
    String year;
    String presentationTime;
    String advocate;
    String recruitmentPosition;
    String signing;
    String place;

    public PreachInformation() {
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPresentationTime() {
        return presentationTime;
    }

    public void setPresentationTime(String presentationTime) {
        this.presentationTime = presentationTime;
    }

    public String getAdvocate() {
        return advocate;
    }

    public void setAdvocate(String advocate) {
        this.advocate = advocate;
    }

    public String getRecruitmentPosition() {
        return recruitmentPosition;
    }

    public void setRecruitmentPosition(String recruitmentPosition) {
        this.recruitmentPosition = recruitmentPosition;
    }

    public String getSigning() {
        return signing;
    }

    public void setSigning(String signing) {
        this.signing = signing;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "PreachInformation{" +
                "unitNumber=" + unitNumber +
                ", unitName='" + unitName + '\'' +
                ", year='" + year + '\'' +
                ", presentationTime='" + presentationTime + '\'' +
                ", advocate='" + advocate + '\'' +
                ", recruitmentPosition='" + recruitmentPosition + '\'' +
                ", signing='" + signing + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}

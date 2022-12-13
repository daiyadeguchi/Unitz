package com.daiyadeguchi.unitzapi.model;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private Boolean adminFlg;
    private String major;
    private int phoneNo;
    private int emergencyPhoneNo;
    private int totalUnits;
    private int remainingUnits;
    private long coursesId;

    public User(String firstName, String lastName, Boolean adminFlg, String major, int phoneNo, int emergencyPhoneNo, int totalUnits, int remainingUnits, long coursesId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adminFlg = adminFlg;
        this.major = major;
        this.phoneNo = phoneNo;
        this.emergencyPhoneNo = emergencyPhoneNo;
        this.totalUnits = totalUnits;
        this.remainingUnits = remainingUnits;
        this.coursesId = coursesId;
    }

    public User() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAdminFlg() {
        return adminFlg;
    }

    public void setAdminFlg(Boolean adminFlg) {
        this.adminFlg = adminFlg;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getEmergencyPhoneNo() {
        return emergencyPhoneNo;
    }

    public void setEmergencyPhoneNo(int emergencyPhoneNo) {
        this.emergencyPhoneNo = emergencyPhoneNo;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public int getRemainingUnits() {
        return remainingUnits;
    }

    public void setRemainingUnits(int remainingUnits) {
        this.remainingUnits = remainingUnits;
    }

    public long getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(long coursesId) {
        this.coursesId = coursesId;
    }
}

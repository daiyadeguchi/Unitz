package com.daiyadeguchi.unitzapi.model;

public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private Boolean adminFlg;
    private String major;
    private int phoneNo;
    private int emergencyPhoneNo;
    private int totalUnits;
    private int remainingUnits;
    private long courcesId;

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

    public long getCourcesId() {
        return courcesId;
    }

    public void setCourcesId(long courcesId) {
        this.courcesId = courcesId;
    }
}

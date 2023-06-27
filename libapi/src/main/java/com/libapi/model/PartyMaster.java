package com.libapi.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PartyMaster {

    private Integer id;
    private String partyName;
    private Integer partyType;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;

    private String contactperson;
    private String mobileno;
    private String pincode;
    private String email;
    private String docNo;
    private String createdBy;
    private String updatedBy;
    private Date createdDate;
    private Date updatedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Integer getPartyType() {
        return partyType;
    }

    public void setPartyType(Integer partyType) {
        this.partyType = partyType;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public PartyMaster(Integer id, String partyName, Integer partyType, String address1, String address2, String city, String state, String contactperson, String mobileno, String pincode, String email, String address3, String docNo, String createdBy, String updatedBy, Date createdDate, Date updatedDate) {
        this.id = id;
        this.partyName = partyName;
        this.partyType = partyType;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.contactperson = contactperson;
        this.mobileno = mobileno;
        this.pincode = pincode;
        this.email = email;
        this.address3 = address3;
        this.docNo = docNo;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public PartyMaster() {
    }

    @Override
    public String toString() {
        return "PartyMaster{" +
                "id=" + id +
                ", partyName='" + partyName + '\'' +
                ", partyType=" + partyType +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", contactperson='" + contactperson + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", pincode='" + pincode + '\'' +
                ", email='" + email + '\'' +
                ", address3='" + address3 + '\'' +
                ", docNo='" + docNo + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}

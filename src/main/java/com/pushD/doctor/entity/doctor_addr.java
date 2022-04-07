package com.pushD.doctor.entity;

import javax.persistence.Id;

public class doctor_addr {
    @Id
    private int doc_id;
    private String address_Line1;
    private String address_Line2;
    private String district;
    private String state;
    private String pincode;

    public doctor_addr(int doc_id, String address_Line1, String address_Line2, String district, String state, String pincode) {
        this.doc_id = doc_id;
        this.address_Line1 = address_Line1;
        this.address_Line2 = address_Line2;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getAddress_Line1() {
        return address_Line1;
    }

    public void setAddress_Line1(String address_Line1) {
        this.address_Line1 = address_Line1;
    }

    public String getAddress_Line2() {
        return address_Line2;
    }

    public void setAddress_Line2(String address_Line2) {
        this.address_Line2 = address_Line2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
package com.pushD.doctor.entity;
import javax.persistence.*;
@Entity
@Access(AccessType.PROPERTY)
@Table(name="Specialist")

public class Specialist
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String fname;
    private String lname;
    private String  gender;
    private String specialzation;
    private String highest_qual;
    private String email;
    private int  contact_no;

    public Specialist(int id, String fname, String lname, String gender, String specialzation, String highest_qual, String email, int contact_no) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.specialzation = specialzation;
        this.highest_qual = highest_qual;
        this.email = email;
        this.contact_no = contact_no;
    }

    public Specialist() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialzation() {
        return specialzation;
    }

    public void setSpecialzation(String specialzation) {
        this.specialzation = specialzation;
    }

    public String getHighest_qual() {
        return highest_qual;
    }

    public void setHighest_qual(String highest_qual) {
        this.highest_qual = highest_qual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public int getId() {
        return id;
    }
}

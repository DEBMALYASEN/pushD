package com.pushD.doctor.entity;
import javax.persistence.*;
@Entity
@Access(AccessType.PROPERTY)
@Table(name="Doctor")
public class Doctor
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private  int id;
    private  String fname;
    private  String lname;
    private  String gender;
    private  String dob;
    private  int   contact_no;
    private  String  email;
    private  String  highest_qual;
    private  String   password;


    public Doctor(int id, String fname, String lname, String gender, String dob, int contact_no, String email,String password)
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.dob = dob;
        this.contact_no = contact_no;
        this.email = email;
        this.password=password;
    }

    public Doctor() {

    }

    public int getId() {
        return id;
    }

    public String getHighest_qual() {
        return highest_qual;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHighest_qual(String highest_qual) {
        this.highest_qual = highest_qual;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

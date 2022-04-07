package com.pushD.doctor.entity;
import javax.persistence.*;
@Entity
@Access(AccessType.PROPERTY)
@Table(name="Patient")
public class Patient
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String fname;
    private String lname ;
    private String dob;
    private int contact_no;
    private String  email;
    private String password;

    public Patient(int id, String fname, String lname, String dob, int contact_no, String email,String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.contact_no = contact_no;
        this.email = email;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Patient(int id) {
        this.id = id;
    }

    public Patient() {

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

    public int getId() {
        return id;
    }
}

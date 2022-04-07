package com.pushD.doctor.entity;

import javax.persistence.Id;

public class assignment
{
    @Id
    private int pat_id;
    private int doc_id;
    private int specialist;
    private int permission;

    public assignment(int pat_id, int doc_id, int specialist, int permission)
    {
        this.pat_id = pat_id;
        this.doc_id = doc_id;
        this.specialist = specialist;
        this.permission = permission;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public int getSpecialist() {
        return specialist;
    }

    public void setSpecialist(int specialist) {
        this.specialist = specialist;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}

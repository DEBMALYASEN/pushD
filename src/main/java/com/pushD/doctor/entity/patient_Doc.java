package com.pushD.doctor.entity;

public class patient_Doc
{

    private int pat_id;
    private int doc_id;

    public patient_Doc(int pat_id, int doc_id) {
        this.pat_id = pat_id;
        this.doc_id = doc_id;
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
}

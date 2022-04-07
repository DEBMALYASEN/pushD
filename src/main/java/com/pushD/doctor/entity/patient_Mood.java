package com.pushD.doctor.entity;

import javax.persistence.Id;

public class patient_Mood
{
    @Id
    private int pat_id;
    private String timestamp;
    private  String  mood;

    public patient_Mood(int pat_id, String timestamp, String mood) {
        this.pat_id = pat_id;
        this.timestamp = timestamp;
        this.mood = mood;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}

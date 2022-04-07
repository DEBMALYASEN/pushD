package com.pushD.doctor.entity;

import javax.persistence.Id;

public class pat_progress
{
    @Id
    private int pat_id;
    private int score;

    public pat_progress(int pat_id, int score) {
        this.pat_id = pat_id;
        this.score = score;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id)
    {
        this.pat_id = pat_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

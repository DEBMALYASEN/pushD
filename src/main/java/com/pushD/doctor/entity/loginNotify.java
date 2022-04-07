package com.pushD.doctor.entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
@Entity
@Access(AccessType.PROPERTY)
@Table(name="loginNotify")
public class loginNotify
{
    @Id
    private int pat_id;

    @DateTimeFormat
    private DateTimeFormat next;

    public loginNotify(int pat_id, DateTimeFormat next) {
        this.pat_id = pat_id;
        this.next = next;
    }

    public loginNotify() {

    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public DateTimeFormat getNext() {
        return next;
    }

    public void setNext(DateTimeFormat next) {
        this.next = next;
    }
}

package com.pushD.doctor.controller;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.service.progressservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
@RequestMapping("/progress")
public class progresscontroller
{

    @Autowired
    private progressservice pg;


    @GetMapping("/progress")
    public int  progress(@PathVariable("Patient") Patient p)
    {
        return this.pg.getprogress(p);
    }
}


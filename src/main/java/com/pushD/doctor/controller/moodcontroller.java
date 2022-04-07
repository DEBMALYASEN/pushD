package com.pushD.doctor.controller;

import com.pushD.doctor.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/mood")
public class  moodcontroller
{
    @Autowired
    public com.pushD.doctor.service.moodservice moodservice;


    @GetMapping("/getmood")
    public String getmood(@PathVariable("Patient") Patient p)
    {
        return this.moodservice.getmood(p);
    }
}

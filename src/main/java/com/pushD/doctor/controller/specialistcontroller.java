package com.pushD.doctor.controller;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.entity.Specialist;
import com.pushD.doctor.service.Specialistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/specialist")
public class specialistcontroller
{
    @Autowired
    private Specialistservice specialistservice;


    @GetMapping("/active")
    public List<Specialist> getActiveSpecialist()
    {
        return this.specialistservice.getActiveSpecialist();
    }



    @PostMapping("/assign")
    void assign (@RequestBody Patient p,Specialist s) throws Exception
    {

           this.specialistservice.setspecialist(p,s);

    }


}

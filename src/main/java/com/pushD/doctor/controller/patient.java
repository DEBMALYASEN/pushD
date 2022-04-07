package com.pushD.doctor.controller;


import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.exceptionhelper.patientFoundException;
import com.pushD.doctor.service.doctorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class patient
{

    @Autowired
    private doctorservice docs;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //creating patient
    @PostMapping("/")
    public Patient createPatient(@RequestBody Patient patient) throws Exception
    {


        patient.setPassword(this.bCryptPasswordEncoder.encode(patient.getPassword()));

        return this.docs.createPatient(patient);

    }

    @GetMapping("/{fname}")
    public Patient getPaitent(@PathVariable("fname") String fname)
    {
        return this.docs.getPatient(fname);
    }

    //delete the user by id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer  id)
    {
        this.docs.deletePatient(id);
    }



    @ExceptionHandler(patientFoundException.class)
    public ResponseEntity<?> exceptionHandler(patientFoundException ex)
    {
        return ResponseEntity.ok(ex.getMessage());
    }


}

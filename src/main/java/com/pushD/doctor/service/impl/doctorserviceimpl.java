package com.pushD.doctor.service.impl;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.exceptionhelper.patientFoundException;
import com.pushD.doctor.repo.patientinfo;
import com.pushD.doctor.service.doctorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class doctorserviceimpl implements doctorservice

{


    @Autowired
    private patientinfo patientrepo;


    public Patient createPatient(Patient patient) throws Exception
    {


         Patient local = this.patientrepo.findByEmail(patient.getEmail());

        if (local != null)
        {

            System.out.println("Patient is already there !!");
            throw new patientFoundException();
        }
        else
            local = this.patientrepo.save(patient);



        return local;
    }

    //getting user by email
    @Override
    public Patient getPatient(String email)
    {
        return this.patientrepo.findByEmail(email);
    }

    @Override
    public void deletePatient(Integer userId)
    {
        this.patientrepo.deleteById(userId);
    }


}

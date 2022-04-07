package com.pushD.doctor.service.impl;
import com.pushD.doctor.entity.Doctor;
import com.pushD.doctor.exceptionhelper.doctornotFoundException;
import com.pushD.doctor.repo.doctors;
import com.pushD.doctor.service.doctordetailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//implementation of methods
@Service
public class doctordetailsimpl implements doctordetailservice
{

    @Autowired
    private doctors doctors;

    @Override
    public Doctor loadDoctorByEmail(String email) throws doctornotFoundException
    {

        Doctor doc = doctors.findByEmail(email);
        if (doc == null)
        {
            System.out.println("Doctor not found");
            throw new doctornotFoundException("No Doctor found !!");
        }

        return doc;
    }
}

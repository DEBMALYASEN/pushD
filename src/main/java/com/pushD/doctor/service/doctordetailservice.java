package com.pushD.doctor.service;

import com.pushD.doctor.entity.Doctor;
import com.pushD.doctor.exceptionhelper.doctornotFoundException;
//here we mwntion the methods that we will need
public interface doctordetailservice
{
     Doctor loadDoctorByEmail(String email) throws doctornotFoundException;

}

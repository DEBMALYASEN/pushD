package com.pushD.doctor.service;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.entity.Specialist;

import java.util.List;

public interface Specialistservice
{

    public List<Specialist> getActiveSpecialist();
    public void setspecialist( Patient p,Specialist s);

}

package com.pushD.doctor.service.impl;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.entity.Specialist;
import com.pushD.doctor.entity.pat_spec;
import com.pushD.doctor.repo.specialistrepo;
import com.pushD.doctor.service.Specialistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class Specialistserviceimpl implements Specialistservice
{
    @Autowired
    private specialistrepo srep;
    @Autowired
    private com.pushD.doctor.repo.srepo srepo;

    @Override
    public List<Specialist> getActiveSpecialist()
    {
        return this.srep.findByActive(true);
    }

    @Override
    public void setspecialist(Patient p, Specialist s)
    {

        pat_spec pd = null;

        pd.setPat_id(p.getId());
        pd.setSpec_id(s.getId());
        this.srepo.save(pd);
    }

}




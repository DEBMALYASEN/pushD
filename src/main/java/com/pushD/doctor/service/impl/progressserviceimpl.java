package com.pushD.doctor.service.impl;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.service.progressservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class progressserviceimpl  implements progressservice

{
    @Autowired
    private com.pushD.doctor.repo.progressrepo progressrepo;


    @Override
    public int getprogress(Patient p)


    {
        return this.progressrepo.findByPat_id(p).getScore();
    }
}

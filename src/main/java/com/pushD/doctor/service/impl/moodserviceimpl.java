package com.pushD.doctor.service.impl;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.service.moodservice;
import org.springframework.stereotype.Service;

@Service
public class moodserviceimpl  implements moodservice
{
    private com.pushD.doctor.repo.moodrepo moodrepo;

    @Override
    public String getmood(Patient p)
    {
        return this.moodrepo.findByPat_id(p).getMood();
    }
}

package com.pushD.doctor.repo;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.entity.pat_progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface progressrepo extends JpaRepository<pat_progress, Integer>
{
    pat_progress findByPat_id(Patient p) ;
}


package com.pushD.doctor.repo;

import com.pushD.doctor.entity.Patient;
import com.pushD.doctor.entity.patient_Mood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface moodrepo extends JpaRepository<patient_Mood, Integer>
{
    patient_Mood findByPat_id(Patient p) ;
}

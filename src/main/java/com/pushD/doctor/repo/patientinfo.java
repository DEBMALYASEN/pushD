package com.pushD.doctor.repo;

import com.pushD.doctor.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientinfo extends JpaRepository<Patient, Integer>
{

    Patient findByEmail(String email);
    void deletePatient(Integer userId);

}

package com.pushD.doctor.repo;

import com.pushD.doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
//interacts with Database
public interface doctors extends JpaRepository<Doctor, Integer>
{
        Doctor findByEmail(String email);//will get converted to the corresponding sql statement
}

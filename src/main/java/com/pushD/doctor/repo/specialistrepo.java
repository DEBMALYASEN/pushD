package com.pushD.doctor.repo;

import com.pushD.doctor.entity.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface specialistrepo extends JpaRepository<Specialist, Integer>
{
    public List<Specialist> findByActive(Boolean b);
}

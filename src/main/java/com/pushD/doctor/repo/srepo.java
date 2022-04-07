package com.pushD.doctor.repo;

import com.pushD.doctor.entity.pat_spec;
import org.springframework.data.jpa.repository.JpaRepository;

public interface srepo extends JpaRepository<pat_spec, Integer>
{
}

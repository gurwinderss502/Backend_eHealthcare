package com.eHealthcareSystem.EHealthcareSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eHealthcareSystem.EHealthcareSystem.entity.*;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	

}


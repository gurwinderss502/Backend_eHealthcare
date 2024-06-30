package com.eHealthcareSystem.EHealthcareSystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eHealthcareSystem.EHealthcareSystem.entity.Doctor;
import com.eHealthcareSystem.EHealthcareSystem.repository.DoctorRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class DoctorController {
	

    @Autowired
	private DoctorRepository doctorRepository;

	public DoctorController(DoctorRepository doctortRepository) {
		super();
		this.doctorRepository = doctorRepository;
		
	}
	
	@PostMapping("/doctors")
	public ResponseEntity<?> createDoctor(@RequestBody Doctor doctor) {
        doctorRepository.save(doctor);
        return ResponseEntity.ok().build();
    }
	
	@GetMapping("/doctors")
	public List<Doctor>getAllPatient()
	{
		return doctorRepository.findAll();	
	}
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable long id) throws AttributeNotFoundException
	{
		Doctor doctor=doctorRepository.findById(id).orElseThrow(()->new AttributeNotFoundException("Doctor not found with id "+id));
		return ResponseEntity.ok(doctor);
	}
	
}

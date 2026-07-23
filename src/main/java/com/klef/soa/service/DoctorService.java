package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Doctor;

public interface DoctorService {

	Doctor addDoctor(Doctor d);
	Doctor updateDotor(Doctor d);
	List<Doctor> DisplayAllDoctors();
	
	
	
	
	
	
}

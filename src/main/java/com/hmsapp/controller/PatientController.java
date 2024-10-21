package com.hmsapp.controller;

import java.util.List;
import java.util.Optional;

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

import com.hmsapp.entity.Patient;
import com.hmsapp.repository.PatientRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	// create add patient
	@PostMapping("/addPatient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);

	}
	@GetMapping("AllPatient")
	public List<Patient> getAllPatient(){
		return (List<Patient>) patientRepository.findAll();
	}
	@DeleteMapping("/deletePatient/{id}")
	public void deletePatient(@PathVariable long id) {
		 patientRepository.deleteById(id);
	}
	@PutMapping("/updatePatient/{id}")
	public ResponseEntity<Patient> updatePatientById(@PathVariable long id,@RequestBody Patient patientDetails) throws AttributeNotFoundException{
        Patient patient =patientRepository.findById(id).orElseThrow(()->new AttributeNotFoundException("Patient Not Found"));
        patient.setAge(patientDetails.getAge());
        patient.setBloodGroup(patientDetails.getBloodGroup());
        patient.setName(patientDetails.getName());
        patient.setDose(patientDetails.getDose());
        patient.setFees(patientDetails.getFees());
        patient.setPrescription(patientDetails.getPrescription());
        patient.setUrgency(patientDetails.getUrgency());
        Patient updatedPatient = patientRepository.save(patient);
        return ResponseEntity.ok(updatedPatient);
 
}
}

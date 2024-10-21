package com.hmsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmsapp.doclogin.entity.Appointment;
import com.hmsapp.doclogin.repo.AppointmentRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppointmentController {
	@Autowired
	private AppointmentRepository appointmentRepository;
	@PostMapping("/takeAppointment")
	public Appointment takeAppointment(@RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	@GetMapping("/getAllAppointment")
	public List<Appointment> getAll(){
		return (List<Appointment>) appointmentRepository.findAll();
	}
	@DeleteMapping("/deleteAppointment/{id}")
	public void deleteAppointment(@PathVariable long id) {
		appointmentRepository.deleteById(id);
		
	}

}

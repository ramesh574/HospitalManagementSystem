package com.hmsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmsapp.doclogin.entity.Medicine;
import com.hmsapp.doclogin.repo.MedicineRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MedicineController {
	@Autowired
	private MedicineRepository medicineRepository;
	@PostMapping("/createMedicine")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
		
	}
	@GetMapping("/getAllMedicine")
	public List<Medicine> getAll(){
		return (List<Medicine>) medicineRepository.findAll();
	}

}

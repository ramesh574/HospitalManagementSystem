package com.hmsapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hmsapp.entity.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Long>  {

}

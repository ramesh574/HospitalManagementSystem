package com.hmsapp.doclogin.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hmsapp.doclogin.entity.Appointment;
@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}

package com.hmsapp.doclogin.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hmsapp.doclogin.entity.Medicine;
@Repository
public interface MedicineRepository extends CrudRepository<Medicine, Long> {

}

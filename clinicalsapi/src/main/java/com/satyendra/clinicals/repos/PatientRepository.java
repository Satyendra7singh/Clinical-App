package com.satyendra.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyendra.clinicals.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}

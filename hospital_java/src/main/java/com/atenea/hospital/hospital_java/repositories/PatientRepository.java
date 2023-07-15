package com.atenea.hospital.hospital_java.repositories;

import com.atenea.hospital.hospital_java.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}

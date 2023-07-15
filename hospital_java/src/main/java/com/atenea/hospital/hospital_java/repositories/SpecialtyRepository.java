package com.atenea.hospital.hospital_java.repositories;

import com.atenea.hospital.hospital_java.entities.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

}

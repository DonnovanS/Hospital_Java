package com.atenea.hospital.hospital_java.repositories;

import com.atenea.hospital.hospital_java.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}

package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Doctor;

import java.util.List;

public interface IDoctorService {

    Doctor saveDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Doctor updateDoctor(Doctor doctor);

    Doctor getDoctor(Integer id);

    void removeDoctor(Integer id);
}

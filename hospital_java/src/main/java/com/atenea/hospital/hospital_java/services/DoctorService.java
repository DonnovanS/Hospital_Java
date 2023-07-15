package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Doctor;
import com.atenea.hospital.hospital_java.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService implements IDoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getDoctor(Integer id) {
        return doctorRepository.getById(id);
    }

    @Override
    public void removeDoctor(Integer id) {
        doctorRepository.delete(doctorRepository.getById(id));
    }
}

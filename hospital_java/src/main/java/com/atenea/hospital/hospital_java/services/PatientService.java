package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Patient;
import com.atenea.hospital.hospital_java.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatient(Integer id) {
        return patientRepository.getById(id);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void removePatient(Integer id) {
        patientRepository.delete(patientRepository.getById(id));
    }
}

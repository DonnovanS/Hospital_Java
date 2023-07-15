package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Patient;

import java.util.List;

public interface IPatientService {

    Patient savePatient(Patient patient);

    List<Patient> getPatients();

    Patient getPatient(Integer id);

    Patient updatePatient(Patient patient);

    void removePatient(Integer id);
}

package com.atenea.hospital.hospital_java.controllers;

import com.atenea.hospital.hospital_java.entities.Patient;
import com.atenea.hospital.hospital_java.services.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/patient")
public class PatientController {

    @Autowired
    IPatientService iPatientService;

    @PostMapping("/savePatient")
    public Patient savePatient(Patient patient) {
        return iPatientService.savePatient(patient);
    }

    @GetMapping("/getPatients")
    public List<Patient> getPatients() {
        return iPatientService.getPatients();
    }

    @GetMapping("/getPatient/{id}")
    Patient getPatient(@PathVariable("id") Integer idPatient) {
        return iPatientService.getPatient(idPatient);
    }

    @PutMapping("/updatePatient")
    Patient updatePatient(Patient patient) {
        return iPatientService.updatePatient(patient);
    }

    @DeleteMapping("/removePatient")
    public void removePatient(Integer idPatient) {
        iPatientService.removePatient(idPatient);
    }

}

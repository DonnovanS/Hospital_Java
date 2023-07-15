package com.atenea.hospital.hospital_java.controllers;

import com.atenea.hospital.hospital_java.entities.Doctor;
import com.atenea.hospital.hospital_java.services.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/doctors")
public class DoctorController {

    @Autowired
    IDoctorService doctorService;

    @PostMapping("/saveDoctor")
    public Doctor saveDoctor(Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/getDoctors")
    public List<Doctor> getDoctors() {
        return doctorService.getAllDoctors();
    }

    @PutMapping("/updateDoctors")
    public Doctor updateDoctor(Doctor doctor) {
        return doctorService.updateDoctor(doctor);
    }

    @GetMapping("/getDoctor/{id}")
    public Doctor getDoctor(@PathVariable("id") Integer idDoctor) {
        return doctorService.getDoctor(idDoctor);
    }

    @DeleteMapping("/removeDoctor/{id}")
    public void removeDoctor(@PathVariable("id") Integer idDoctor) {
        doctorService.removeDoctor(idDoctor);
    }
}

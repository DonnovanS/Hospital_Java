package com.atenea.hospital.hospital_java.controllers;

import com.atenea.hospital.hospital_java.entities.Appointment;
import com.atenea.hospital.hospital_java.services.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/appointments")
public class AppointmentController {

    @Autowired
    IAppointmentService iAppointmentService;

    @PostMapping("/saveAppointment")
    Appointment saveAppointment(Appointment appointment) {
        return iAppointmentService.saveAppointment(appointment);
    }

    @GetMapping("/getAppointments")
    List<Appointment> getAppointments() {
        return iAppointmentService.getAppointments();
    }

    @GetMapping("/getAppointment/{id}")
    Appointment getAppointment(@PathVariable("id") Integer idAppointment) {
        return iAppointmentService.getAppointment(idAppointment);
    }

    @PutMapping("/updateAppointment")
    Appointment updateAppointment(Appointment appointment) {
        return iAppointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/removeAppointment/{id}")
    void removeAppointment(@PathVariable("id") Integer idAppointment) {
        iAppointmentService.removeAppointment(idAppointment);
    }
}

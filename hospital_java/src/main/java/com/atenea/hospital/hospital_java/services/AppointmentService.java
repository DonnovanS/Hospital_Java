package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Appointment;
import com.atenea.hospital.hospital_java.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements IAppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointment(Integer id) {
        return appointmentRepository.getById(id);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void removeAppointment(Integer id) {
        appointmentRepository.delete(appointmentRepository.getById(id));
    }
}

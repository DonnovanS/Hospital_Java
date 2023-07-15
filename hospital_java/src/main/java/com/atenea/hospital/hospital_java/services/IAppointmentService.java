package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Appointment;

import java.util.List;

public interface IAppointmentService {

    Appointment saveAppointment(Appointment appointment);

    List<Appointment> getAppointments();

    Appointment getAppointment(Integer id);

    Appointment updateAppointment(Appointment appointment);

    void removeAppointment(Integer id);
}

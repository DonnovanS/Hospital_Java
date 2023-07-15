package com.atenea.hospital.hospital_java.services;

import com.atenea.hospital.hospital_java.entities.Specialty;

import java.util.List;

public interface ISpecialtyService {

    Specialty saveSpecialty(Specialty specialty);

    List<Specialty> getSpecialties();

    Specialty getSpecialty(Integer id);

    Specialty updateSpecialty(Specialty specialty);

    void removeSpecialty(Integer id);
}

package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Patient;
import com.funsoft.cabinet.entities.Speciality;

import java.util.List;
import java.util.Map;

public interface PatientService {
    public Patient save(Patient patient);
    public Patient update(long id, Patient patient);

    public Map<String, Boolean> deletePatient(long id);
    public  Patient getPatient(Long id);
    public List<Patient> getPatient();

    public  Patient findByPhone(String phone);

}

package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import com.funsoft.cabinet.exception.ResourceNotFound;


import javax.print.Doc;
import java.util.List;
import java.util.Map;

public interface DoctorService {
    public Doctor save(Doctor doctor);
    public  Doctor getDoctor(Long id) throws ResourceNotFound;
    public List<Doctor> getDoctor();
    public Map<String, Boolean> deleteDoctor(long id);
    public  List<Doctor> searchByFirstname(String firstname);
    public  List<Doctor> searchByFirstnameOrByLastname(String name);
    public  List<Doctor> searchBySpeciality(Speciality speciality);
    public List<Doctor> advancedSearch(Speciality speciality, String pseudo);
    public  Doctor updateDoctor(long id, Doctor doctor) throws ResourceNotFound;

}

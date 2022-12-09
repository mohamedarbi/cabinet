package com.funsoft.cabinet.controller;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Patient;
import com.funsoft.cabinet.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
      return   patientService.save(patient);

    }
    @GetMapping
    List<Patient> getPatients(){
        return patientService.getPatient();
    }

    @GetMapping(value = "/get")
    public Patient getPatientByParam(@RequestParam("patientId") long id){
        return patientService.getPatient(id);
    }

    @DeleteMapping
    public Map<String, Boolean> deletePatient(@RequestParam("id") long id){
        return patientService.deletePatient(id);

    }
    @PutMapping
    public Patient updatePatient(@RequestParam("id") long id, @RequestBody Patient patient){
        return patientService.update(id, patient);

    }
    @GetMapping(value = "/find")
    public Patient getByPhone(@RequestParam("phone") String phone){
        return patientService.findByPhone(phone);
    }
}

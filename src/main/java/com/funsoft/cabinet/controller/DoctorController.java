package com.funsoft.cabinet.controller;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import com.funsoft.cabinet.exception.ResourceNotFound;
import com.funsoft.cabinet.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/doctors")//bon pratique doctors en pluriels
public class DoctorController extends BasicController {
    @Autowired
    DoctorService doctorService;
    @GetMapping(value = "/welcome")
    public String welcome(){
        return "Welcome, I'm a robot. I will help you to manage doctors";
    }

    @PostMapping
    public Doctor createDoctor(@Valid @RequestBody Doctor doctor){
        return doctorService.save(doctor);


    }
    @GetMapping List<Doctor> getDoctors(){
        return doctorService.getDoctor();
    }

 /*  @GetMapping(value= "/{id}")
    public Doctor getDoctor(@PathVariable("id") long id){
        return  doctorService.getDoctor(id);
    }
*/
    @GetMapping(value = "/get")
    public  Doctor getDoctorByParam(@RequestParam("doctorId") long id) throws ResourceNotFound {
        return doctorService.getDoctor(id);
    }

    @DeleteMapping
    public Map<String, Boolean> deleteDoctor(@RequestParam("id") long id){
        return doctorService.deleteDoctor(id);
    }

    @PutMapping
    public Doctor updateDoctor( @RequestParam("id")long id, @Valid @RequestBody Doctor doctor) throws ResourceNotFound {
        return  doctorService.updateDoctor(id, doctor);
    }

    @GetMapping(value = "/find")
    public List<Doctor> getBySpeciality(@RequestParam("speciality")Speciality speciality){
        return doctorService.searchBySpeciality(speciality);
    }

    @GetMapping(value = "/search")
    public List<Doctor> search(@RequestParam("speciality")Speciality speciality, @RequestParam("pseudo") String pseudo){
       return doctorService.advancedSearch(speciality, pseudo+'%');
    }
}

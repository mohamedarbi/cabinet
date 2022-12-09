package com.funsoft.cabinet.repository;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository  extends CrudRepository<Doctor, Long> {
    // select d from Doctor d where d.speciality = :speciality; LPQL ---> SQL
    public List<Doctor> findBySpeciality(Speciality speciality);
    // select d from Doctor d where d.firstname = :firstname; JPQL ---> SQL
    public List<Doctor> findByfirstname(String firstname);
    // select d from Doctor d where d.firstname = :firstname or d.lastname = :lastname; JPQL ---> SQL
    public List<Doctor> findByFirstnameOrLastname(String firstname, String lastname);

    @Query(value= "SELECT d FROM Doctor d where d.speciality = :spec AND "+
                    "(d.firstname LIKE :pseudo OR d.lastname LIKE :pseudo)")
    public  List<Doctor> search(@Param("spec") Speciality speciality, @Param("pseudo") String pseudo );
    }



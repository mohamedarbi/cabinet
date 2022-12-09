package com.funsoft.cabinet.repository;

import com.funsoft.cabinet.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointementRepository extends JpaRepository<Appointment, Long> {


}

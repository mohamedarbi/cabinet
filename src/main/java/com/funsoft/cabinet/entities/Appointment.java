package com.funsoft.cabinet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date rdvTime;
}

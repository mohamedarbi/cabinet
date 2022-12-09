/*package com.funsoft.cabinet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity //donc Serializable not obligatoire
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    List<Etudient> participants;
}*/

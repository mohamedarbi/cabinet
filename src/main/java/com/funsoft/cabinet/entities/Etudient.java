/*package com.funsoft.cabinet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Etudient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String firstname;
    @ManyToMany(mappedBy = "participant", fetch = FetchType.LAZY)
    private List<Evenement> evenementList;
}
*/
package tn.esprit.esprittn.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numcours;

    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float price;
    private Integer timeslot;


}

package tn.esprit.esprittn.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")
    private Long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Integer slope;
    private Integer length;
    @Enumerated(EnumType.STRING)
    private
    Surface s;
}

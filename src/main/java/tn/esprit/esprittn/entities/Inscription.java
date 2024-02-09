package tn.esprit.esprittn.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numinscription")
    private Long numinscription;
    @Column(name = "numsemaine")
    private Integer numsemaine;

}

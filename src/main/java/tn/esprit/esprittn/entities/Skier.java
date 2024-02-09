package tn.esprit.esprittn.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Skier")
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numskier;

    private String firstname;

    private String lastname;

    private Date datenaissance;

    }

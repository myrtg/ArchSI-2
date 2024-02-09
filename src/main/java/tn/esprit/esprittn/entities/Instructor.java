package tn.esprit.esprittn.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Instructor")

public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numinstructor;
    private String firstname;
    private String lastname;
    private Date dateofhire;

}

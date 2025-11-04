package org.example.registroEstudiantil.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Facultad {
    @Id
    private Integer id;
    private String nombre;
    private String descripcion;

}

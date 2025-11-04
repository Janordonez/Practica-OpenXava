package org.example.registroEstudiantil.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Empleados {
    @Id
    private Long id;
}

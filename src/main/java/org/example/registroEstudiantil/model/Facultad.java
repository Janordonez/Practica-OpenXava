package org.example.registroEstudiantil.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Facultad {
    @Id
    private Integer id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "facultad", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Carrera> carreras;

}

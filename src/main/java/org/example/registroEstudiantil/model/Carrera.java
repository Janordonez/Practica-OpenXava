package org.example.registroEstudiantil.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.ReadOnly;


import javax.persistence.*;

@Entity
@Table(name="carrera")
@Getter
@Setter
public class Carrera {
    @SequenceGenerator(name="carreraseq",sequenceName ="carreraseq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carreraseq")
    @Id
    @Column(name="id_carrera")
    @ReadOnly
    private Integer idCarrera;
    private String descripcion;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idFacultad", referencedColumnName = "id")
    private Facultad facultad;

}


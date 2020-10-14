package com.ejercicio.javamysqldocker.model;


import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {

    private static final long serialVersionUID = 7639415200582386221L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    private Long id;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}

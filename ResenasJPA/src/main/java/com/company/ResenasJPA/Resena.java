package com.company.ResenasJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resena {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idUsuario;
    private Long idProducto;
    private String resena;

    protected Resena() {}

    public Resena(Long idUsuario, Long idProducto, String resena) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.resena = resena;
    }

    @Override
    public String toString() {
        return String.format(
            "Resena[id=%d, idUsuario=%d, idProducto=%d, resena='%s'",
            id, idUsuario, idProducto, resena
        );
    }

    public Long getId() {
        return id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public String getResena() {
        return resena;
    }
}

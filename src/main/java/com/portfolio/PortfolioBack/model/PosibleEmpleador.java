package com.portfolio.PortfolioBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PosibleEmpleador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String asunto;
    private String email;
    private int telefono;

    public PosibleEmpleador() {
    }

    public PosibleEmpleador(Long id, String nombre, String asunto, int telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.asunto = asunto;
        this.telefono = telefono;
        this.email = email;
    }
    
    
    
}

package com.eduardo.prjRevisão.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depcodigo;

    private String depnome;
    public Cliente() {

    }

    public Cliente(Long depcodigo, String depnome) {
        super();
        this.depcodigo = depcodigo;
        this.depnome = depnome;
    }

    public Long getdepcodigo() {
        return depcodigo;
    }

    public void setdepcodigo(Long depcodigo) {
        this.depcodigo = depcodigo;
    }

    public String getdepnome() {
        return depnome;
    }

    public void setdepnome(String depnome) {
        this.depnome = depnome;
    }


}

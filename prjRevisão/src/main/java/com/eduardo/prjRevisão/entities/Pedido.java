package com.eduardo.prjRevisão.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcodigo;

	
    private String funnome;
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
		private LocalDate funnascimento;
	
	private double funsalario;
	
	@ManyToOne
	private Cliente cliente;

//inserir os metodos get e o set
public Cliente getCliente() {
		return cliente;
	}

	public void setDepartamento(Cliente cliente) {
		this.cliente = cliente;
	}
	
    public Pedido() {

    }

    public Pedido(Long funcodigo, String funnome, LocalDate funnascimento, double funsalario) {
        super();
        this.funcodigo = funcodigo;
        this.funnome = funnome;
        this.funnascimento = funnascimento;
        this.funsalario = funsalario;
    }

    public Long getfuncodigo() {
        return funcodigo;
    }

    public void setfuncodigo(Long funcodigo) {
        this.funcodigo = funcodigo;
    }

    public String getfunnome() {
        return funnome;
    }

    public void setfunnome(String funnome) {
        this.funnome = funnome;
    }
    
    public LocalDate getFunnascimento() {
    	return funnascimento;
    }
    
    public void setFunnascimento(LocalDate funnascimento) {
    	this.funnascimento = funnascimento;
    }
    
    public double getFunsalario() {
    	return funsalario;
    }
    
    public void setFunsalario(double funsalario) {
    	this.funsalario = funsalario;
    }
}

package com.eduardo.prjRevisão.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.prjRevisão.entities.Cliente;
import com.eduardo.prjRevisão.services.ClienteService;


@RestController
@RequestMapping("/Cliente")
public class ClienteControler {
	private final ClienteService clienteService;

    public ClienteControler(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long depcodigo) {
        Cliente cliente = clienteService.getClienteById(depcodigo);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/home")
    public String paginaInicial() {
        return "index"; // Nome do seu arquivo HTML (sem a extensão)
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }
    
  //Utilizando o ResponseEntity e RequestEntity
  	@GetMapping
  	public ResponseEntity<List<Cliente>> getAllClientes(RequestEntity<Void> requestEntity) {
  		String method = requestEntity.getMethod().name();
  		String contentType = requestEntity.getHeaders().getContentType().toString();
  		List<Cliente> clientes = clienteService.getAllCliente();
  		return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
  				.body(clientes);
  	}
 
}



package com.eduardo.prjRevisão.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eduardo.prjRevisão.entities.Cliente;
import com.eduardo.prjRevisão.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	 
	 public ClienteService(ClienteRepository clienteRepository) {
	    this.clienteRepository = clienteRepository;
	 }
	 
	 public Cliente getClienteById(Long depcodigo) {
	        return clienteRepository.findById(depcodigo).orElse(null);
	    }
	 
	 public Cliente saveCliente(Cliente cliente){
	    return clienteRepository.save(cliente);
	 } 
	 
	 public List<Cliente> getAllCliente(){
	    return clienteRepository.findAll();
	 }	    
}

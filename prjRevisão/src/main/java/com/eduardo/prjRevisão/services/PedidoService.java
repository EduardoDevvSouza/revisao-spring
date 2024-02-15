package com.eduardo.prjRevisão.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.prjRevisão.entities.Pedido;
import com.eduardo.prjRevisão.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> getAllPedidos(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidosById(long funcodigo) {
		return pedidoRepository.findById(funcodigo).orElse(null);
	}
	
	public Pedido savePedido(Pedido Pedido) {
		return pedidoRepository.save(Pedido);
	}
	
}

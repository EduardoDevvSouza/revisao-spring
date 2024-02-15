package com.eduardo.prjRevisão.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.eduardo.prjRevisão.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

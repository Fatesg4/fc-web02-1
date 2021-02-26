package com.francisco.edivan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.edivan.entidade.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Long>{

}

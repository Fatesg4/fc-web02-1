package com.francisco.edivan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.edivan.dao.PedidoDao;
import com.francisco.edivan.entidade.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoRest {

	@Autowired
	private PedidoDao pedidoDao;
	
	@GetMapping
	public List<Pedido> get(){
		return pedidoDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Pedido pedido) {
		pedidoDao.save(pedido);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pedidoDao.deleteById(id);
	}
}


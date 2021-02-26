package com.francisco.edivan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.edivan.entidade.Produto;

@Repository // faz a classe se comportar como DAO
public interface ProdutoDao extends JpaRepository<Produto, Long>{

}


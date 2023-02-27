package com.trabalho.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trabalho.trabalho.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}



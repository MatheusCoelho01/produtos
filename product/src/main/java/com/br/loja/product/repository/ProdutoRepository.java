package com.br.loja.product.repository;


import com.br.loja.product.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto>  findByNome(String nome);

}

package com.br.loja.product.controller;

import com.br.loja.product.model.Produto;
import com.br.loja.product.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        repository.save(produto);
        return produto;
    }

}

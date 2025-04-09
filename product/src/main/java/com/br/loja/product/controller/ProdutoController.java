package com.br.loja.product.controller;

import com.br.loja.product.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        return produto;
    }

}

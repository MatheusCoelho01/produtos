package com.br.loja.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosApiApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     */
    public static void main(String[] args) {
        SpringApplication.run(ProdutosApiApplication.class, args);
    }

}

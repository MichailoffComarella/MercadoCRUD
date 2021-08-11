package com.crud.mercadoK.controller

import com.crud.mercadoK.model.Produto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("produtos")
class ProdutoController {

    @GetMapping
    @ResponseBody
    fun list(): List<Produto> {
        return listOf(Produto(1, "Livro", 62.2),
                Produto(2, "Chocolate", 8.55),
                Produto(3, "Bola de Basquete", 156.79))
    }
}
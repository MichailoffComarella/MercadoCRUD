package com.crud.mercadoK.controller

import com.crud.mercadoK.model.Produto
import com.crud.mercadoK.repository.ProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("produtos")
class ProdutoController {

    @Autowired
    lateinit var produtoRepository: ProdutoRepository

    @GetMapping
    fun list(): List<Produto> {
        return produtoRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody produto: Produto): Produto{
        return produtoRepository.save(produto)
    }

}
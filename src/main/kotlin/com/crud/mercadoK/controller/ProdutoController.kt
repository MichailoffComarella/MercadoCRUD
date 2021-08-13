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

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody produto: Produto): Produto{
        if (produtoRepository.existsById(id)) {
            val safeProduto = produto.copy(id)
            return produtoRepository.save(safeProduto)
        }
        return Produto()
    }

}
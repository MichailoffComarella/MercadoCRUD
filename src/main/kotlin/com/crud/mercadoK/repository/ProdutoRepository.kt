package com.crud.mercadoK.repository

import com.crud.mercadoK.model.Produto
import org.springframework.data.repository.CrudRepository

interface ProdutoRepository : CrudRepository<Produto, Long>
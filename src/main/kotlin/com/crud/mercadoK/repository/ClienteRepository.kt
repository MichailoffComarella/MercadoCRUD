package com.crud.mercadoK.repository

import com.crud.mercadoK.model.Cliente
import org.springframework.data.repository.CrudRepository

interface ClienteRepository : CrudRepository<Cliente, Long>
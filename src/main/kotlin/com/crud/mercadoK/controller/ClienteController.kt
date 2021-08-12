package com.crud.mercadoK.controller

import com.crud.mercadoK.model.Cliente
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("clientes")
class ClienteController {

    @GetMapping
    fun list(): List<Cliente> {
        return listOf(Cliente(1, "Milena", "12345678910", 20),
                Cliente(2, "Lucas", "98765432100", 19),
                Cliente(5, "Amanda", "11223344556", 21))
    }

    @PostMapping
    fun add(@RequestBody cliente: Cliente): Cliente{
        return cliente
    }
}
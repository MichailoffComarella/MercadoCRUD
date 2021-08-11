package com.crud.mercadoK.controller

import com.crud.mercadoK.model.Cliente
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("clientes")
class ClienteController {

    @GetMapping
    @ResponseBody
    fun list(): List<Cliente> {
        return listOf(Cliente(1, "Milena", "12345678910", 20),
                Cliente(2, "Lucas", "98765432100", 19),
                Cliente(5, "Amanda", "11223344556", 21))
    }
}
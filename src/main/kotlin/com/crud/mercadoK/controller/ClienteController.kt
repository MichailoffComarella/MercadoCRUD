package com.crud.mercadoK.controller

import com.crud.mercadoK.model.Cliente
import com.crud.mercadoK.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("clientes")
class ClienteController {

    // oi

    @Autowired
    lateinit var clienteRepository: ClienteRepository

    @GetMapping
    fun list(): List<Cliente> {
        return clienteRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody cliente: Cliente): Cliente{
        return clienteRepository.save(cliente)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody cliente: Cliente): Cliente{
        if(clienteRepository.existsById(id)) {
            val safeCliente = cliente.copy(id)
            return clienteRepository.save(safeCliente)
        }
        return Cliente()
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if (clienteRepository.existsById(id)){
            clienteRepository.deleteById(id)
        }
    }


}
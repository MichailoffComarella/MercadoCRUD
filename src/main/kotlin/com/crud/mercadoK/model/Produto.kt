package com.crud.mercadoK.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Produto(@Id
              @GeneratedValue
              val id: Int,
              val nome: String,
              val preco: Double)
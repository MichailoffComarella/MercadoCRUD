package com.crud.mercadoK.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cliente(@Id
              @GeneratedValue
              val id: Long,
              val nome: String,
              val cpf: String,
              val idade: Int)
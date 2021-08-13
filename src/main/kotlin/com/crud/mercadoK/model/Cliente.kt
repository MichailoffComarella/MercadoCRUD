package com.crud.mercadoK.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Cliente(@Id
                   @GeneratedValue
                   @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
                   val id: Long = 0L,
                   val nome: String = "",
                   val cpf: String = "",
                   val idade: Int = 0)
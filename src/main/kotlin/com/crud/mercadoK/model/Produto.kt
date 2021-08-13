package com.crud.mercadoK.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Produto(@Id
                   @GeneratedValue
                   @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
                   val id: Long = 0L,
                   val nome: String = "",
                   val preco: Double = 0.0)
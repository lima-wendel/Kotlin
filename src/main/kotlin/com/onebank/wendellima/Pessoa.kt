package com.onebank.wendellima

class Pessoa {
    var nome: String = "Wendel"
    var cpf: String = "333.444.555.666-77"
}

fun main()  {
    val wendel = Pessoa() //variável que recebe a instância de uma pessoa... Pessoa() é um objeto

    println(wendel.nome)
    println(wendel.cpf)
}
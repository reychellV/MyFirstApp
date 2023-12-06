package com.reychellV.proyectokotlin.poo_ejercicio

fun main() {
    println("¿Cuantos clientes desea ingresar en el banco?")
    val numClientes: Int = readln().toInt()
    var clientesLista: MutableList<Cliente> = mutableListOf()
    for (i in 0 until numClientes) {
        println("Ingrese el id para el cliente ${i + 1}")
        val codCliente: Int = readln().toInt()
        println("Ingrese el nombre para el cliente ${i + 1}")
        val nombre: String = readln().toString()
        println("Ingrese el saldo inicial para el cliente ${i + 1}")
        val saldo:Float = readln().toFloat()
        val nuevoCliente:Cliente = Cliente(codCliente,nombre,saldo)
        clientesLista.add(nuevoCliente)
    }


    val bancoDavivienda = Banco(clientesLista)
    bancoDavivienda.movimientos()
    bancoDavivienda.estadoCuenta()
}
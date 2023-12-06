package com.reychellV.proyectokotlin.poocoloaboracion

class Banco {
    val cliente: Cliente = Cliente("Juan", 0f)
    val cliente2: Cliente = Cliente("Daniel", 0f)
    val cliente3: Cliente = Cliente("Anna", 0f)

    fun movimientos() {
        cliente.consignar(100000f)
        cliente2.consignar(250000f)
        cliente3.consignar(300000f)
        cliente3.retirar(180000f)
    }

    fun estadoCuenta() {
        val total = cliente.saldoCuenta + cliente2.saldoCuenta + cliente3.saldoCuenta
        println("El saldo total en el banco es: $total")
        cliente.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}
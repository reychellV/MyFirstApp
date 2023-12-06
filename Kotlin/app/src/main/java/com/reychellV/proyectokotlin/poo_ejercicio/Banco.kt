package com.reychellV.proyectokotlin.poo_ejercicio

class Banco(private var listaCliente: MutableList<Cliente>) {

    fun movimientos() {
        var rta: Boolean = true
        while (rta) {
            println("Las opciones del cajero son: \n 1.Consignar \n 2.Retirar \n 3.Ver saldo \n 4.Salir \n Selecciones 1,2,3 segun corresponda")
            when (readln().toInt()) {
                1 -> {
                    println("Indique el id del usuario con el que quiere hacer la consignacion: ")
                    val cod: Int = readln().toInt()
                    var posible: Boolean = false
                    listaCliente.forEach { cliente ->
                        if (cod == cliente.idCliente) {
                            posible = true
                        }
                    }
                    if (posible) {
                        listaCliente.forEach { cliente ->
                            if (cod == cliente.idCliente) {
                                println("Ingrese el valor a consignar: ")
                                val valorConsignacion: Float = readln().toFloat()
                                cliente.consignar(valorConsignacion)
                            }
                        }
                    } else {
                        println("El cliente con id $cod no existe")
                    }
                }

                2 -> {
                    println("Indique el id del usuario con el que quiere hacer el retiro de dinero: ")
                    val cod: Int = readln().toInt()
                    var posible: Boolean = false
                    listaCliente.forEach { cliente ->
                        if (cod == cliente.idCliente) {
                            posible = true
                        }
                    }
                    if (posible) {
                        listaCliente.forEach { cliente ->
                            if (cod == cliente.idCliente) {
                                println("Ingrese el valor a retirar: ")
                                val valorRetiro: Float = readln().toFloat()
                                if (valorRetiro <= cliente.saldoCuenta){
                                    cliente.retirar(valorRetiro)
                                }else{
                                    println("No es posible el retiro")
                                }
                            }
                        }
                    } else {
                        println("El cliente con id $cod no existe")
                    }
                }

                3 -> {
                    println("Indique el id del usuario con el que desea consultar el saldo: ")
                    val cod: Int = readln().toInt()
                    var posible: Boolean = false
                    listaCliente.forEach { cliente ->
                        if (cod == cliente.idCliente) {
                            posible = true
                        }
                    }
                    if (posible) {
                        listaCliente.forEach { cliente ->
                            if (cod == cliente.idCliente) {
                                cliente.imprimir()
                            }
                        }
                    } else {
                        println("El cliente con id $cod no existe")
                    }
                }

                4 -> {
                    rta = false
                }

                else -> {
                    println("opcion incorrecta, intente de nuevo")
                }
            }
        }
    }

    fun estadoCuenta() {
        var total: Float = 0f
        listaCliente.forEach { cliente -> total += cliente.saldoCuenta }
        println("El saldo total en el banco es: $total")
        listaCliente.forEach { cliente -> println("El saldo del cliente ${cliente.idCliente} es: ${cliente.saldoCuenta}") }
    }
}
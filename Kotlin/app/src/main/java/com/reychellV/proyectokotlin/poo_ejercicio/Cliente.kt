package com.reychellV.proyectokotlin.poo_ejercicio

class Cliente(var idCliente: Int, var nombre: String, var saldoCuenta: Float) {
    //metodos
    fun consignar(valor: Float) {
        this.saldoCuenta += valor
    }

    fun retirar(valor: Float) {
        this.saldoCuenta -= valor
    }

    fun imprimir(){
        println("$nombre, usted tiene un saldo de $saldoCuenta en su cuenta bancaria")
    }
}
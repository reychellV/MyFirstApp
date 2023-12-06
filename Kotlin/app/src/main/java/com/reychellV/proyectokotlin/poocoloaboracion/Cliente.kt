package com.reychellV.proyectokotlin.poocoloaboracion

class Cliente(var nombreCliente: String, var saldoCuenta: Float) {
    //metodos
    fun consignar(valor: Float) {
        this.saldoCuenta += valor
    }

    fun retirar(valor: Float) {
        this.saldoCuenta -= valor
    }

    fun imprimir(){
        println("$nombreCliente, usted tiene un saldo de $saldoCuenta en su cuenta bancaria")
    }
}



package com.reychellV.proyectokotlin.pooabstraccion

fun main() {
    val suma = Sumar(1,3)
    suma.operar()
    suma.imprimir()

    val restar = Restar(50,30)
    restar.operar()
    restar.imprimir()
}
package com.reychellV.proyectokotlin.sintaxis

fun main() {
    datos()
}

fun datos(){
    println("Ingrese el valor del lado del cuadrado: ")
    val lado = readln().toInt()
    val calculoSuperficie = lado*lado
    println("La superficie del cuadrado es: $calculoSuperficie")
}
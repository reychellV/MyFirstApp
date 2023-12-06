package com.reychellV.proyectokotlin.sintaxis

//se utilizan funciones de unica expresion cuando se pretende hacer acciones puntuales, simples y precisos
fun mayor(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun main() {
//    println("Ingrese el numero 1: ")
//    val num1 = readln().toInt()
//    println("Ingrese el numero 2: ")
//    val num2 = readln().toInt()
//    println("El numero mayor entre $num1 y $num2 es: ${mayor(num1, num2)}")
    for (i in 1..6){//va desde 1 hasta 6
        println(convertirCadena(i))
    }
}

//funcion de unica expresion con un when
fun convertirCadena(numero: Int) = when (numero) {
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "cinco"
    else -> "Error"
}
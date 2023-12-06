package com.reychellV.proyectokotlin.funordensuperior

fun operar(
    num1: Double,
    num2: Double,
    fr: (Double, Double) -> Double
): Double {//el 3 srg = fr indica que sera una funcion recibida como parametro
    return fr(num1, num2)
}

fun sumar(num1: Double, num2: Double) = num1 + num2
fun restar(num1: Double, num2: Double) = num1 - num2

fun main() {
    val resultadoSuma = operar(2.0, 3.0, ::sumar)
    val resultadoResta = operar(100.0, 25.0, ::restar)
    println(resultadoSuma)
    println(resultadoResta)
}
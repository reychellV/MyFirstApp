package com.reychellV.proyectokotlin.funcioneslambda

fun operar(
    num1: Double,
    num2: Double,
    fr: (Double, Double) -> Double//recibe 2 doubles y retorna un doble
): Double {//el 3 srg = fr indica que sera una funcion anonima, que su logica se plantea cuando se llama la funcion
    return fr(num1, num2)
}

fun main() {
    val resultadoSuma = operar(5.0, 4.0) { num1, num2 -> num1 + num2 }
    val resultadoResta = operar(5.0, 4.0) { num1, num2 -> num1 - num2 }
    println(resultadoSuma)
    println(resultadoResta)
}
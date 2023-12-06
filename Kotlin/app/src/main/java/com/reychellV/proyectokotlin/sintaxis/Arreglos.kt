package com.reychellV.proyectokotlin.sintaxis

fun main() {
    val salarios: DoubleArray = DoubleArray(5)
    for (i in 0..4) {
        println("Ingrese el salario del empleado: ")
        salarios[i] = readln().toDouble()
    }
    //salario()
    orders(salarios)
}

fun salario() {
//    val salarios: DoubleArray
//    salarios = DoubleArray(5)
    val salarios: DoubleArray = DoubleArray(5)
    for (i in 0..4) {
        println("Ingrese el salario del empleado: ")
        salarios[i] = readln().toDouble()
    }

    fun ordenar(salarios: DoubleArray) = salarios.sort()
//    ordenar(salarios)
    for (i in 0..4) {
        ordenar(salarios)
        println(salarios[i])
    }
}

fun order(salarios: DoubleArray) {
    //1 9 3 7 5
    val salarioOrder: DoubleArray = DoubleArray(salarios.size)
    for (i in salarios.indices){
        for (j in salarios.indices){
            if (salarios[j] > salarioOrder[i]){
                salarioOrder[i] = salarios[j]
            }
        }
    }
    salarioOrder.forEach { println(it) }
}

fun orders(salarios: DoubleArray) {
    val salarioOrder: DoubleArray = salarios.clone()

    for (i in 0 until salarioOrder.size - 1) {
        var maxIndex = i
        for (j in i + 1 until salarioOrder.size) {
            if (salarioOrder[j] > salarioOrder[maxIndex]) {
                maxIndex = j
            }
        }
        val temp = salarioOrder[i]
        salarioOrder[i] = salarioOrder[maxIndex]
        salarioOrder[maxIndex] = temp
    }

    salarioOrder.forEach { println(it) }
}


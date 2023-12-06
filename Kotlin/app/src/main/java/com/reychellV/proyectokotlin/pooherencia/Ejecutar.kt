package com.reychellV.proyectokotlin.pooherencia

fun main() {
    val persona = Persona("David",18)
    persona.imprimir()

    val empleado = Empleado("Pepe",35,6000000.0)
    empleado.imprimir()
    empleado.impuesto()
    val empleado2 = Empleado("Maria",20,4000000.0)
    empleado2.imprimir()
    empleado2.impuesto()
}
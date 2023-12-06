package com.reychellV.proyectokotlin.pooherencia

class Empleado(nombre: String, edad: Int, val sueldo: Double) : Persona(nombre, edad) {

    override fun imprimir() {
        super.imprimir()
        println("Suelto de $sueldo")
    }

    fun impuesto() {
        if (sueldo > 5000000) {
            println("Debe pagar impuestos")
        } else {
            println("No debe pagar impuestos")
        }
    }
}
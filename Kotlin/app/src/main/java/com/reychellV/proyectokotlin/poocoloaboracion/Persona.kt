package com.reychellV.proyectokotlin.poocoloaboracion

class Persona {
    var nombre: String = ""
        set(value) {
            field = value.uppercase()
        }
        get() {
            return field
        }

    var edad: Int = 0
        set(valor) {
            if (valor >= 0) {
                field = valor
            } else {
                field = 0
            }
        }
}


fun main() {
    val persona1 = Persona()
    persona1.nombre = "Karla"
    persona1.edad = -21
    println(persona1.nombre)
    println(persona1.edad)
}
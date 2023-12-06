package com.reychellV.proyectokotlin.poo

class PersonaParametros(var nombre: String, var edad: Int) {//los parametros de la clase funcionan como los atributos de clase
    //metodos
    fun imprimir() {
        println("Nombre $nombre y edad $edad")
    }

    fun mayoriaEdad() {
        if (edad >= 18) {
            println("$nombre, usted es mayor de edad, puede ingresar")
        } else {
            println("$nombre, usted no es mayor de edad, no puede ingresar")
        }
    }
}
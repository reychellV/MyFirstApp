package com.reychellV.proyectokotlin.poo

class PersonaConstructor constructor(nombre: String, edad: Int) {//en la definicion de la clase se define el constructor con sus parametros --> palabra clave 'constructor'
    //atributos de clase
    var nombre: String = nombre
    var edad: Int = edad

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
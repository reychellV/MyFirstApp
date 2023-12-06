package com.reychellV.proyectokotlin.poo

class Persona {
    //atributos de clase
    var nombre: String = ""
    var edad: Int = 0

    //constructor
    fun inicializarAtributos(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre $nombre y edad $edad")
    }

    fun mayoriaEdad(){
        if (edad >= 18){
            println("$nombre, usted es mayor de edad, puede ingresar")
        }else{
            println("$nombre, usted no es mayor de edad, no puede ingresar")
        }
    }
}

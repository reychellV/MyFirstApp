package com.reychellV.proyectokotlin.pooherencia

/*con la palabra reservda open se libera la clase/metodos para que pueda ser heredable*/
open class Persona(val nombre: String, val edad: Int) {

    open fun imprimir(){
        println("El nombre $nombre y edad $edad")
    }

}
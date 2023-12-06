package com.reychellV.proyectokotlin.pooabstraccion

/*la palabra reservada abstract indica que la clase sera abstracta (plantilla)*/
abstract class Operacion(val numero1: Int, val numero2: Int) {
    protected var resultado: Int = 0;//protected acceden con herencia o con abstraccion

    abstract fun operar()//es un metodo plantilla para hacer un calculo

    fun imprimir(){
        println("Resultado de la operacion $resultado")
    }
}
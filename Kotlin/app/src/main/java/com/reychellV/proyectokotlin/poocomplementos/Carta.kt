package com.reychellV.proyectokotlin.poocomplementos

class Carta(val tipoCarta: DatosCartas, val numeroCarta: Int) {
    fun imprimir() {
        println("Carta: $tipoCarta y valor: $numeroCarta")
    }
}

fun main() {
    /*DIAMANTE,
    TREBOL,
    CORAZON,
    PICAS*/
//    val carta1 = Carta(DatosCartas.DIAMANTE,1)
//    carta1.imprimir()
    val numero = (Math.random() * (10 - 2 + 1)).toInt() + 2
    val carta = Carta(DatosCartas.values().random(), numero)
    println(carta.imprimir())
    /*    when (tipo) {
            1 -> { carta = Carta(DatosCartas.valueOf("DIAMANTE"), numero)
            println(carta.imprimir())
            }
            2 -> { carta = Carta(DatosCartas.valueOf("TREBOL"), numero)
                println(carta.imprimir())
            }
            3 -> { carta = Carta(DatosCartas.valueOf("CORAZON"), numero)
                println(carta.imprimir())
            }
            4 -> { carta = Carta(DatosCartas.valueOf("PICAS"), numero)
                println(carta.imprimir())
            }
            else -> {
                println("valor incorrecto")
            }
        }
    */
}
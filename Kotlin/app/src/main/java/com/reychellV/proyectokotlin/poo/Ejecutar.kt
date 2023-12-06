package com.reychellV.proyectokotlin.poo

fun main() {
    /*  //crear una instancia a la clase persona
        val persona1:Persona
        //crear un objecto
        persona1 = Persona()*/
    //crear un objecto de la clase persona
    val persona1: Persona = Persona()
    //persona1.inicializarAtributos("David",18)//inicializar constructor (default)
    persona1.inicializarAtributos(
        edad = 18,
        nombre = "David"
    )//inicializar constructor con atributos nombrados
    persona1.imprimir()//llamar el metodo imprimir de la clase persona
    persona1.mayoriaEdad()//llamar el metodo mayor de edad de la clase persona1


    val personaConstructor: PersonaConstructor = PersonaConstructor("Santiago", 12)
    personaConstructor.imprimir()
    personaConstructor.mayoriaEdad()

    val personaParametros = PersonaParametros("Mario", 50)
    personaParametros.imprimir()
    personaParametros.mayoriaEdad()
    println(personaParametros.edad)
}

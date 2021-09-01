package com.example.herenciakotlin


class Futbolista() : Personal(id=0,nombre="",apellido="",edad=0){
    var dorsal:Int = 0
    var demarcacion:String =""

    constructor(id:Int,nombre:String,apellido:String,edad:Int,dorsald:Int,demarcacion:String):this(){
        this.id=id
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dorsal=dorsal
        this.demarcacion=demarcacion
    }


    override fun Concentrarse(){

    }
    override fun Viajar(){

    }


    fun JugarPartido(){

    }

    fun Entrenar(){

    }

}
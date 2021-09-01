package com.example.herenciakotlin

class Entrenador() : Personal(id=0,nombre="",apellido="",edad=0) {


    var idFederacion:String =""


    constructor(id:Int,nombre:String,apellido:String,edad:Int,idFederacion:String):this(){
        this.id=id
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.idFederacion=idFederacion

    }


    override fun Concentrarse(){

    }
    override fun Viajar(){

    }


    fun dirigirPartido(){

    }

    fun dirigirEntrenamiento(){

    }


}
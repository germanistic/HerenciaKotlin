package com.example.herenciakotlin

open class Personal {
    var id:Int = 0
    var nombre:String = ""
    var apellido:String = ""
    var edad:Int = 0

    constructor(id:Int,nombre:String,apellido:String,edad:Int){
        this.id=id
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
    }

    open fun Concentrarse(){

    }
    open fun Viajar(){

    }

}
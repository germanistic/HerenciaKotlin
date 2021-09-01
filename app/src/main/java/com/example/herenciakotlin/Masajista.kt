package com.example.herenciakotlin

class Masajista () : Personal(id=0,nombre="",apellido="",edad=0) {

    var titulacion:String =""
    var aniosExperiencia:Int=0


    constructor(id:Int,nombre:String,apellido:String,edad:Int,titulacion:String,aniosExperiencia:Int):this(){
        this.id=id
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.titulacion=titulacion
        this.aniosExperiencia=aniosExperiencia

    }


    override fun Concentrarse(){

    }
    override fun Viajar(){

    }

    fun darMasaje(){

    }



}
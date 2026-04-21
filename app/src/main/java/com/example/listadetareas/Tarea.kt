package com.example.listadetareas

data class Tarea (
    val id : Int,
    val titulo : String,
    var completado : Boolean =false,
)
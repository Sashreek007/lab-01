package com.example.petshop

abstract class Mood (
    val mood: String,
    val date: String){
    abstract fun state():String
}
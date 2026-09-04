package com.example.petshop

class Sad(mood:String,date:String): Mood(mood,date){
    override fun state(): String {
        return mood
    }
}
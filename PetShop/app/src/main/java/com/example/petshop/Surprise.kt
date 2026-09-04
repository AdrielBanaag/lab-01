package com.example.petshop

class Surprise(name: String, date: String): Mood(name, date) {
    override fun emote(): String {
        return "Woah!"
    }
}
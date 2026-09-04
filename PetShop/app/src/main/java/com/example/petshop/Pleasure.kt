package com.example.petshop

class Pleasure(name: String, date: String): Mood(name, date) {
    override fun emote(): String {
        return "I'm feeling good"
    }
}
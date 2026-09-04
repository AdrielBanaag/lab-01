package com.example.petshop

// participation exercise part 1

abstract class Mood(val name: String, var date: String) {
    abstract fun emote(): String // to show your mood
}
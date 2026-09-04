package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // cats and dogs

        val cat = Cat("Coco", 6)    // cat instantiated
        val dog = Dog("Mochi",6)    // dog instantiated
        val pets = mutableListOf<Pet>()           // list created
        pets.add(cat)                             // add cat to list
        pets.add(dog)                             // add dog to list

        // scorpion

        val scorpion = Scorpion("Stinger", 32)
        pets.add(scorpion)                        // add scorpion to list
        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
        // pettablePets.add(scorpion)                // should raise an error

        // emotion testing (optional)

        val wow = Surprise("much amaze","tomorrow")
        val emotions = mutableListOf<Mood>()
        emotions.add(wow)
    }
}


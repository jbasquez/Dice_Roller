package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        calls on roll button by it and adds event listener to do the function of roll dice
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }


    private fun rollDice() {
        //sets # of sides of dice to 6
        val dice = Dice(6)
        //uses 6 to do a rll function
        val diceRoll = dice.roll()
        //selects dice image by its id "imageview"
        val diceImage: ImageView = findViewById(R.id.imageView)
        //when/if statement to change the pictures as different numbers appear
        when(diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val numSides: Int) {
    //gets random # 1-6
    fun roll(): Int {
        return (1..numSides).random()
    }
}
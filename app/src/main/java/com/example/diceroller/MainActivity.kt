package com.example.diceroller

import android.os.Bundle
import android.widget.Button
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
        //finds the text box and turns the result of a number into a string and updates text
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    //gets random # 1-6
    fun roll(): Int {
        return (1..numSides).random()
    }
}
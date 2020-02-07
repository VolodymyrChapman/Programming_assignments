package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** calling the function 'rollDice' in order to roll the die
         *  when the button is pressed */

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Roll me!"
        rollButton.setOnClickListener {
            rollDice()
        }
    }
    /** defining the rollDice function - when roll button is pushed, random number is generated.
     * The number generated corresponds to the relevant dice cartoon in the drawable folder.
     * The variable 'drawableResource' is set to the name of the relevant cartoon file*/

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        /** image shown in layout is dynamically changed to whichever cartoon was randomly chosen*/

        val diceImage: ImageView = findViewById(R.id.result_dice)
        diceImage.setImageResource(drawableResource)

    }
}

package com.example.diceroller
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var rollDicesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1=findViewById(R.id.imageView1)
        imageView2=findViewById(R.id.imageView2)
        rollDicesButton=findViewById(R.id.rollDices)

        rollDicesButton.setOnClickListener {
            rollDices()
        }
    }
    private fun rollDices() {
        val diceImages = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )
        val randomImage1 = diceImages.random()
        val randomImage2 = diceImages.random()
        imageView1.setImageResource(randomImage1)
        imageView2.setImageResource(randomImage2)
        val isDouble = randomImage1 == randomImage2
        when {
            isDouble -> {
                Toast.makeText(this, "Selamat anda dapat dadu double!", Toast.LENGTH_SHORT).show()
            }

            else -> {
                Toast.makeText(this, "Anda Belum Beruntung!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
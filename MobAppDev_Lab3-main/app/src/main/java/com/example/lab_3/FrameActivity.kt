package com.example.lab_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import kotlin.random.Random

class FrameActivity : AppCompatActivity() {
    val imageArray: IntArray = intArrayOf(
        R.drawable.i1,
        R.drawable.i2,
        R.drawable.i3,
    )
    val random: Random = Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame)
        val layout: FrameLayout = findViewById(R.id.framelayout)
        val imageView: ImageView = findViewById(R.id.imageView)
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        imageView.setImageResource(imageArray[0])
        imageButton.setOnClickListener {
            val randomNumber = random.nextInt(imageArray.size)
            imageView.setImageResource(imageArray[randomNumber])
        }
    }
}
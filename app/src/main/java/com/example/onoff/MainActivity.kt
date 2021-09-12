package com.example.onoff


import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    lateinit var switchButton: SwitchCompat
    lateinit var imageViewLight: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchButton = findViewById(R.id.switchButton)
        imageViewLight = findViewById(R.id.imageView)

        switchButton.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
                if (buttonView.isChecked) {
                    imageViewLight.setImageResource(R.drawable.light_on)
                } else {
                    imageViewLight.setImageResource(R.drawable.light_off)
                }

            }
        })
    }
    }

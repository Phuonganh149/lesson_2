package com.example.lesson_2

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Gọi trực tiếp giao diện XML
        setContentView(R.layout.activity_main)
    }
}
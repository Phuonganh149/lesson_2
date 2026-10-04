package com.example.lesson_2 // Giữ tên package gốc của bạn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUserName = findViewById<EditText>(R.id.etUserName)
        val etMssv = findViewById<EditText>(R.id.etMssv)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            val userName = etUserName.text.toString().trim()
            val mssv = etMssv.text.toString().trim()

            // Validate dữ liệu không được để trống
            if (userName.isEmpty()) {
                etUserName.error = "Vui lòng nhập UserName!"
                etUserName.requestFocus()
                return@setOnClickListener
            }

            if (mssv.isEmpty()) {
                etMssv.error = "Vui lòng nhập MSSV!"
                etMssv.requestFocus()
                return@setOnClickListener
            }

            // Chuyển sang Screen 2 và truyền dữ liệu qua Intent
            val intent = Intent(this, Screen2Activity::class.java).apply {
                putExtra("EXTRA_USER_NAME", userName)
                putExtra("EXTRA_MSSV", mssv)
            }
            startActivity(intent)
        }
    }
}
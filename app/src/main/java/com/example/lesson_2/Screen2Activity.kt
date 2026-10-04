package com.example.lesson_2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity

class Screen2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val tvUserName = findViewById<TextView>(R.id.tvUserName)
        val tvMssv = findViewById<TextView>(R.id.tvMssv)

        // Lấy dữ liệu từ Intent truyền sang
        val userName = intent.getStringExtra("EXTRA_USER_NAME") ?: ""
        val mssv = intent.getStringExtra("EXTRA_MSSV") ?: ""

        // Hiển thị dữ liệu lên giao diện
        tvUserName.text = "Name: $userName"
        tvMssv.text = "Student ID: $mssv"

        // Nút Back top-left chuyển về Screen 1
        btnBack.setOnClickListener {
            finish() // Đóng Screen2 để quay lại Screen1
        }
    }
}
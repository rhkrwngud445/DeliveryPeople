package com.example.deliverypeople

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registerBt : LinearLayout = findViewById(R.id.register_user)
        registerBt.setOnClickListener {
            val registerIntent = Intent(this,UserRegisterActivity::class.java)
            startActivity(registerIntent)
        }
    }
}
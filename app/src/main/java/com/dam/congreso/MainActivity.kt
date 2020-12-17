package com.dam.congreso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: ImageButton = findViewById(R.id.bnt1)
        btn1.setOnClickListener{
            val intent : Intent = Intent(this,Inscripcion::class.java)
            startActivity(intent)
        }

        val btn2: ImageButton = findViewById(R.id.bt2)
        btn2.setOnClickListener{
            val intent : Intent = Intent(this,Talleres::class.java)
            startActivity(intent)
        }
        val btn3: ImageButton = findViewById(R.id.btn3)
        btn3.setOnClickListener{
            val intent : Intent = Intent(this,Reglamento::class.java)
            startActivity(intent)
        }
    }
}

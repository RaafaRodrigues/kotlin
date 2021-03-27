package com.example.appvisibilidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun invisivel1(view:View){
    val tvMeio:TextView = findViewById(R.id.tv_meio);
        tvMeio.visibility=View.INVISIBLE
    }

    fun invisivel2(view: View){
        val tvMeio:TextView = findViewById(R.id.tv_meio);
        tvMeio.visibility=View.GONE
    }
    
}

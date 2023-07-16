package com.himanshu.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
   var btnNext: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnNext=findViewById(R.id.btnNext)
        btnNext?.setOnClickListener {
            var intent= Intent(this,RelativeLayout::class.java)
            startActivity(intent)
            //finish()
        }
    }
}
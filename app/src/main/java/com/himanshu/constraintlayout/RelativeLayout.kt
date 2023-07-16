package com.himanshu.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RelativeLayout : AppCompatActivity() {
    var btnTask : Button?=null
    var btnBack : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        btnTask=findViewById(R.id.btnTask)
        btnBack=findViewById(R.id.btnBack)
        btnTask?.setOnClickListener {
            var intent= Intent(this,ConstraintLayoutTask::class.java)
            startActivity(intent)
            //finish()
        }
        btnBack?.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            //finish()
        }
    }
}
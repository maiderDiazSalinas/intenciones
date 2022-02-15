package com.example.intenciones

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val extras=intent.extras
        if(extras!=null){
            findViewById<TextView>(R.id.textView).text="Hola ${extras.getString("nombre")}"
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val miIntent= Intent()
            setResult(Activity.RESULT_OK,miIntent)
            finish()
        }
    }
}
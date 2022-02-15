package com.example.intenciones

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val SALUDO:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            val nombre:EditText=findViewById(R.id.etNombre)
            if(nombre.text.isNotEmpty()) {
                val miIntent = Intent(this, MainActivity2::class.java)
                miIntent.putExtra("nombre",nombre.text.toString())
                startActivityForResult(miIntent,SALUDO)
            }
            else{
                Toast.makeText(this,"No has insertado un nombre",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==SALUDO){
            if(resultCode== Activity.RESULT_OK){
                Toast.makeText(this,"Adios",Toast.LENGTH_LONG).show()
            }
        }
    }
}
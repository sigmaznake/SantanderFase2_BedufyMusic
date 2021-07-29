package org.bedu.bedufymusic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
const val USER_NAME = "org.bedu.bedufymusic1.USER_NAME"

class MainActivity : AppCompatActivity() {
    private lateinit var btnEntrar: Button
    private lateinit var btnRegistro: Button

    lateinit var addUser1: EditText
    lateinit var addPws1: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar = findViewById(R.id.btnEntrar)
        addUser1 = findViewById(R.id.addUser)
        addPws1 = findViewById((R.id.addPws))
        btnRegistro = findViewById(R.id.btnRegistro)

        btnEntrar.setOnClickListener{
        val bundle = Bundle()
            bundle.putString(USER_NAME, addUser1.text.toString())

            val intent = Intent(this, login::class.java).apply{
                putExtras(bundle)
            }
            startActivity(intent)
        }
        btnRegistro.setOnClickListener{
            val box = Bundle()

            val intencion=Intent(this,Registro::class.java).apply{
                putExtras(box)
            }
            startActivity(intencion)

        }
    }
}
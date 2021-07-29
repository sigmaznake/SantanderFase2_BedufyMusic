package org.bedu.bedufymusic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        text = findViewById(R.id.Bienvenide)

        val bundle = intent.extras

        val name = bundle?.getString(USER_NAME)
        text.text = "¡Bienvenido ${name}!"

    }
}
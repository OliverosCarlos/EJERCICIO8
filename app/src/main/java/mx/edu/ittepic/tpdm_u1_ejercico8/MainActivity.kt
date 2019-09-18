package mx.edu.ittepic.tpdm_u1_ejercico8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var txt : EditText ?= null
    var btn : Button ?= null

    var cadena = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.txt1)
        btn = findViewById(R.id.boton)

        btn?.setOnClickListener {

            cadena = txt?.text.toString()

            var otraACtivity = Intent(this, Main2Activity::class.java)

            otraACtivity.putExtra("cadena",cadena)

            startActivity(otraACtivity)

        }
    }
}

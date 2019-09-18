package mx.edu.ittepic.tpdm_u1_ejercico8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    var txtIn : EditText ?= null
    var txtOut : EditText ?= null
    var btnM : Button ?= null

    var indice = 0

    var cadena = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtIn = findViewById(R.id.textIn)
        txtOut = findViewById(R.id.textOut)
        btnM = findViewById(R.id.botonMostrar)

        cadena = intent.extras?.getString("cadena").toString()

        var arrayCadena = cadena.split(",")

        btnM?.setOnClickListener {

            indice  = txtIn?.text.toString().toInt()

            if(indice > arrayCadena.size)
                Toast.makeText(this,"El indice insertado sobrepasa el tamaño del arreglo", Toast.LENGTH_LONG).show()
            else
            txtOut?.setText("posición : " +indice+" -> "+arrayCadena[indice].toString())
        }
    }



}

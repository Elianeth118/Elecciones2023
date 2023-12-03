package com.example.elecciones2023

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnMorena: ImageButton
    lateinit var btnMC: ImageButton
    lateinit var btnPan: ImageButton
    lateinit var btnNA: ImageButton
    lateinit var btnPRD: ImageButton
    lateinit var btnVerde: ImageButton
    lateinit var btnPRI: ImageButton
    lateinit var btnPT: ImageButton
lateinit var btnResultados:Button
   /* val btnMorena:ImageButton?=null
    val btnMovCiudadano:ImageButton?=null
    val btnPan:ImageButton?=null
    val btnPRD:ImageButton?=null
    val btnNuevaAlianza:ImageButton?=null
    val btnPT:ImageButton?=null
    val btnVerde:ImageButton?=null
    val btnPRI:ImageButton?=null*/
    var total=0
    var sumaVotoMCiudadano: Int = 0
    var sumaVotoMorena: Int= 0
    var sumaVotoAlianza: Int = 0
    var sumaVotoPAN: Int = 0
    var sumaVotoVerde: Int = 0
    var sumaVotoPRI: Int = 0
    var sumaVotoPRD: Int = 0
    var sumaVotoPT: Int = 0


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMorena=findViewById(R.id.btnMorena)
        btnMC=findViewById(R.id.btnMovCiudadano)
       btnPan=findViewById(R.id.btnPan)
         btnPRD=findViewById(R.id.btnPRD)
        btnPRI=findViewById(R.id.btnPRI)
       btnNA=findViewById(R.id.btnnuevaal)
        btnPT=findViewById(R.id.btnPT)
       btnVerde=findViewById(R.id.btnVerde)
        btnResultados=findViewById(R.id.btnResultados)


        btnMC.setOnClickListener(){

            cuentavoto(1);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnMorena.setOnClickListener(){
            cuentavoto(2);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnNA.setOnClickListener(){
            cuentavoto(3);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnPan.setOnClickListener(){
            cuentavoto(4);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnVerde.setOnClickListener(){
            cuentavoto(5);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnPRI.setOnClickListener(){
            cuentavoto(6);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnPRD.setOnClickListener(){
            cuentavoto(7);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }
        btnPT.setOnClickListener(){
            cuentavoto(8);
            Toast.makeText(this,"Boto registrado", Toast.LENGTH_SHORT).show()
        }

        btnResultados.setOnClickListener(){
            val intent :Intent= Intent(this,Resultados::class.java)
            intent.putExtra("Votos morena",sumaVotoMorena)
            intent.putExtra("Votos movimiento ciudadano",sumaVotoMCiudadano)
            intent.putExtra("Votos pan",sumaVotoPAN)
            intent.putExtra("Votos nueva alianza",sumaVotoAlianza)
            intent.putExtra("Votos verde",sumaVotoVerde)
            intent.putExtra("Votos PRD",sumaVotoPRD)
            intent.putExtra("Votos PRI",sumaVotoPRI)
            intent.putExtra("Votos PT",sumaVotoPT)
            intent.putExtra("totalVotos",total)

            startActivity(intent)

        }


    }

    fun total(){
        total=sumaVotoMCiudadano+ sumaVotoMorena+sumaVotoAlianza+sumaVotoPAN+sumaVotoVerde+sumaVotoPRI+sumaVotoPT
    }
    fun cuentavoto(numPartido : Int){

        when(numPartido){
            1-> sumaVotoMCiudadano++
            2-> sumaVotoMorena++
            3-> sumaVotoAlianza++
            4-> sumaVotoPAN++
            5-> sumaVotoVerde++
            6-> sumaVotoPRI++
            7-> sumaVotoPRD++
            8-> sumaVotoPT++

        }
        total()

    }


}
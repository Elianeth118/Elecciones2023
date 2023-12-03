package com.example.elecciones2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Resultados : AppCompatActivity() {
    lateinit var totMC: TextView
    lateinit var totMorena: TextView
    lateinit var totPan: TextView
    lateinit var totNA: TextView
    lateinit var totPRD: TextView
    lateinit var totVerde: TextView
    lateinit var totPRI: TextView
    lateinit var totPT: TextView
    lateinit var porMC: TextView
    lateinit var porMorena: TextView
    lateinit var porPan: TextView
    lateinit var porNA: TextView
    lateinit var porPRD: TextView
    lateinit var porVerde: TextView
    lateinit var porPRI: TextView
    lateinit var porPT: TextView
    lateinit var resultadosTotales:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
        totMC = findViewById(R.id.totMC)
        totMorena = findViewById(R.id.totMorena)
        totPan=findViewById(R.id.totPan)
        totNA=findViewById(R.id.totNuevaAlianza)
        totPRD=findViewById(R.id.totPRD)
        totVerde=findViewById(R.id.totVerde)
        totPRI=findViewById(R.id.totPRI)
        totPT=findViewById(R.id.totPT)
        porMC = findViewById(R.id.PorMC)
        porMorena = findViewById(R.id.porMorena)
        porPan=findViewById(R.id.porPan)
        porNA=findViewById(R.id.porNuevaAlianza)
        porPRD=findViewById(R.id.porPRD)
        porVerde=findViewById(R.id.porVerde)
        porPRI=findViewById(R.id.porPRI)
        porPT=findViewById(R.id.porPT)
        resultadosTotales=findViewById(R.id.ResultadosTexto)

        obtenerVotos()


    }

    fun obtenerVotos() {
        val bundle: Bundle? = intent.extras
        val totalVotos = bundle?.getInt("totalVotos", 0) ?: 0

        val votosMC = bundle?.getInt("Votos movimiento ciudadano", 0)?: 0
        val votosMorena = bundle?.getInt("Votos morena", 0)?: 0
        val votosPan = bundle?.getInt("Votos pan", 0)?: 0
        val votosNA = bundle?.getInt("Votos nueva alianza", 0)?: 0
        val votosPRD = bundle?.getInt("Votos PRD", 0)?: 0
        val votosVerde = bundle?.getInt("Votos verde", 0)?: 0
        val votosPRI = bundle?.getInt("Votos PRI", 0)?: 0
        val votosPT = bundle?.getInt("Votos PT", 0)?: 0



        totMC.text = votosMC.toString()
        totMorena.text = votosMorena.toString()
        totPan.text = votosPan.toString()
        totNA.text = votosNA.toString()
        totPRD.text = votosPRD.toString()
        totVerde.text = votosVerde.toString()
        totPRI.text = votosPRI.toString()
        totPT.text = votosPT.toString()
        resultadosTotales.text=totalVotos.toString()

        porMC.text = calcularPorcentjes(votosMC, totalVotos)
        porMorena.text = calcularPorcentjes(votosMorena, totalVotos)
        porPan.text = calcularPorcentjes(votosPan, totalVotos)
        porNA.text = calcularPorcentjes(votosNA, totalVotos)
        porPRD.text = calcularPorcentjes(votosPRD, totalVotos)
        porVerde.text = calcularPorcentjes(votosVerde, totalVotos)
        porPRI.text = calcularPorcentjes(votosPRI, totalVotos)
        porPT.text = calcularPorcentjes(votosPT, totalVotos)

        porPT.text = calcularPorcentjes(votosPT, totalVotos)





    }
    fun calcularPorcentjes(votos: Int, total: Int): String{
        val porcentaje =if (total != 0) (votos.toDouble() * 100) / total.toDouble() else 0.0
        return String.format("%.3f%%", porcentaje)

    }


}



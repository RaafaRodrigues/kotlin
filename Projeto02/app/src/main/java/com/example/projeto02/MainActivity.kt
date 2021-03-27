package com.example.projeto02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var nome: EditText;
    lateinit var nota1: EditText;
    lateinit var nota2: EditText;
    var notaPrincipal1: Double = 0.0;
    var notaPrincipal2: Double = 0.0;

    var valido: Boolean = true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nome = findViewById(R.id.ed_nome);
        nota1 = findViewById(R.id.ed_nota1);
        nota2 = findViewById(R.id.ed_nota2);
    }

    fun atualizarNotas() {
        notaPrincipal1 = nota1.toString().toDouble();
        notaPrincipal2 = nota2.toString().toDouble();
    }


    fun validar(view: View) {
        atualizarNotas();
        valido = true;
        if (nome.text.toString().length < 3) {
            nome.error = "O Nome deve ter pelo menos 3 letras";
            valido = false;
        }

        if (notaPrincipal1 < 0 || notaPrincipal1 > 10) {
            nota1.error = "A 1 nota deve estar entre 0 e 10";
            valido = false;
        }
        if (notaPrincipal2 > 10 || notaPrincipal2 < 0) {
            nota2.error = "A 2 nota deve estar entre 0 e 10";
            valido = false;
        }

    }


    fun avaliar(view: View) {
        validar(view);

        if (valido) {

            val media: Double = (notaPrincipal1 + notaPrincipal2) / 2;

            Toast.makeText(this, media.toString(), Toast.LENGTH_SHORT).show();
            val resultado :String = "Sua media é ${media} - Resultado ${if (media>=6) "aprovado" else "Reprovado"}";
            val tvResultado:TextView = findViewById(R.id.tv_resultado);
            tvResultado.text= resultado;
            val color= when(media){
                in 0.0..5.99 -> Color.RED;
                in 6.0..8.99 -> Color.GREEN;
                else -> Color.BLUE
            }
            tvResultado.setTextColor(color);
        }
    }
}
package com.example.exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etAluno: EditText;
    lateinit var etMedia: EditText;
    lateinit var ivImagem: ImageView;
    var aluno: String = "";
    var mediaFinal: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivImagem = findViewById(R.id.iv_img);
        etAluno = findViewById(R.id.et_aluno);
        etMedia = findViewById(R.id.et_media)
    }

    fun atualizar() {
        aluno = etAluno.text.toString();
        mediaFinal = if (etMedia.text.isBlank())  -1.0 else etMedia.text.toString().toDouble();
    }

    fun verificar(view: View) {
        var error:Boolean = false;
        atualizar();
        if (aluno.length < 3) {
            etAluno.error = "O Nome deve ter pelo menos 3 letras";
            error = true;
        }
        if (mediaFinal < 0 || mediaFinal > 10) {
            etMedia.error = "A media deve está entre 0 e 10"
            error = true;
        }

        if (!error) {
            ivImagem.setImageResource( when (mediaFinal) {
                in 0.0..4.9 ->
                    R.drawable.triste;
                in 5.0..7.0 ->
                    R.drawable.normal;
                in 7.1..8.5 ->
                    R.drawable.feliz;
                else ->
                    R.drawable.muitofeliz;
            });
            
        } else {
            ivImagem.setImageResource(0);
        }
    }


}
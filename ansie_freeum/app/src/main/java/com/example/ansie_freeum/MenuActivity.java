package com.example.ansie_freeum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button  btnVideos, btnExercicios,  btnPerguntas,btnInformacoes, btnFrases ,btnPrecisoMeAcalmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Instanciando os elementos

        btnVideos = findViewById(R.id.btnVideos);
        btnExercicios = findViewById(R.id.btnExercicios);
        btnPerguntas = findViewById(R.id.btnPerguntas);
        btnInformacoes = findViewById(R.id.btnInformacoes);
        btnFrases = findViewById(R.id.btnFrases);
        btnPrecisoMeAcalmar = findViewById(R.id.btnPrecisoMeAcalmar);

        // Linkando as telas

        // Evento click para vídeos
        btnVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarVideo = new Intent(getApplicationContext(), VideosActivity.class);
                startActivity(acessarVideo);
            }
        });
        // Evento click para Exercícios
        btnExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarExercicios = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(acessarExercicios);
            }
        });

        btnPerguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarPerguntas = new Intent(getApplicationContext(), PerguntasActivity.class);
                startActivity(acessarPerguntas);
            }
        });

        btnInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarInformacoes = new Intent(getApplicationContext(),InformacoesActivity.class);
                startActivity(acessarInformacoes);
            }
        });
        btnFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarFrases = new Intent(getApplicationContext(), FrasesActivity.class);
                startActivity(acessarFrases);
            }
        });
        btnPrecisoMeAcalmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarPrecisoMeAcalmar = new Intent(getApplicationContext(), PrecisoMeAcalmarActivity.class);
                startActivity(acessarPrecisoMeAcalmar);
            }
        });
    }
}

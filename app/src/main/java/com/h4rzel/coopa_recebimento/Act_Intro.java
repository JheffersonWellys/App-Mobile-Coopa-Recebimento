package com.h4rzel.coopa_recebimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Act_Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_intro);

        // Chama o redirecionamento automático com temporizador para tela de logon
        RedirecionamentoDeTela();

    }

    private void RedirecionamentoDeTela(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Act_Intro.this, Act_Logon.class);
                startActivity(intent);
                finish();

            }
        },2000);

    }

}
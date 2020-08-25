package com.example.gestaodeendereco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout llEndereco;
    TextView tvEnderecos;

    List<Endereco> listaEnderecos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llEndereco = findViewById(R.id.llEndereco);
        //tvEnderecos = findViewById(R.id.tvEnderecos);

        criarListaEndereco();
        mostrarEnderecos();

    }

    private void criarListaEndereco() {

        Endereco end1 = new Endereco("A Outra", "Av. Campeche, ", "001");
        Endereco end2 = new Endereco("Trabalho", "Rua. Cantão, ", "002");
        Endereco end3 = new Endereco("Sítio", "Av. das Ilusões, ", "003");

        listaEnderecos.add(end1);
        listaEnderecos.add(end2);
        listaEnderecos.add(end3);
    }



    private void mostrarEnderecos() {
//        String identificacao = "";
//        for(Endereco endereco: listaEnderecos){
//            identificacao += endereco.getIdentificacao() +"\n";
//            tvEnderecos.setText(identificacao);
//
//        }

        tvEnderecos = new TextView(this);
        llEndereco.addView(tvEnderecos);
        String identificacao = "";

        for(Endereco endereco: listaEnderecos) {
            identificacao += endereco.getIdentificacao() + "\n";
            tvEnderecos.setText(identificacao);
        }

    }


}
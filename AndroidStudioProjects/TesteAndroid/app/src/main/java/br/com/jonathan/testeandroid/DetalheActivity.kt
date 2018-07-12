package br.com.jonathan.testeandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)


        matriculaLabel.text = intent.getStringExtra("matricula")
        senhaLabel.text = intent.getStringExtra("senha")



    }



}
package br.com.jonathan.testeandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    var cont = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configuraLogin()

    }

    /*private fun configuraLogin(){
        botaoLogin.setOnClickListener{

            if(cont) {
            layout.visibility = View.GONE

            botaoLogin.text = getString((R.string.label_sair))

            cont = false

            }else{
                layout.visibility = View.VISIBLE

                botaoLogin.text = getString(R.string.text3)

                cont = true
            }


        }

    }

*/



    private fun configuraLogin(){

        botaoLogin.setOnClickListener{


            val extraBundle = Bundle()



            extraBundle.putString("matricula", campoMatricula.text.toString())
            extraBundle.putString("senha", campoSenha.text.toString())



            //CHAMAR UMA NOVA ACTIVITY
           val intentDetalheActivity = Intent(this, DetalheActivity::class.java )
            intentDetalheActivity.putExtras(extraBundle)


            startActivity(intentDetalheActivity)


        }

    }






}

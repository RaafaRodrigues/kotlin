package com.example.appcomponenteorigem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     lateinit var tvTotal:TextView;
    lateinit var swFinalizada:Switch;
     var total:Double=0.0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTotal=findViewById(R.id.tv_total);
        swFinalizada=findViewById(R.id.sw_finalizada);
    }

    fun comprar(componente: View){

       if(swFinalizada.isChecked){
           return;
       }

        val valorItem:Double= when(componente.id){
            R.id.bt_fritas -> 7.00;
            R.id.bt_coca -> 5.00;
            R.id.bt_casquinha -> 2.50;
            else -> 0.0
        }

        total+=valorItem;
        tvTotal.text= "Total da compra: R$ ${"%.2f".format(total)}";
    }
}
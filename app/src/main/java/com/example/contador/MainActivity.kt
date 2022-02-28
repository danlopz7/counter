package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = 0

        val increase = findViewById<Button>(R.id.btn_increase)
        increase.setOnClickListener {
            increaseCounter(it)
        }
        val decrease = findViewById<Button>(R.id.btn_decrease)
        decrease.setOnClickListener {
            decreaseCounter(it)
        }
        val reset = findViewById<Button>(R.id.btn_reset)
        reset.setOnClickListener {
            resetCounter(it)
        }
    }

    fun increaseCounter(view: View){
        counter++
        showResult()
    }


    fun decreaseCounter(view: View){
        counter--
        showResult()
    }

    fun resetCounter(view: View){
        counter = 0
        showResult()
    }

    fun showResult(){
        val txtView = findViewById<TextView>(R.id.txt_counter)
        txtView.text = "Counter: $counter"
    }
}
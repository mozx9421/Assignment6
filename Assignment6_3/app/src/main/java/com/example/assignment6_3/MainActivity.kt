package com.example.assignment6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variable
        var one = 0
        var two = 0
        var three = 0
        var balance = 0
        var totalinterest = 0
        var totalbalance = 0
        var toasterr = Toast.makeText(applicationContext,"Please enter your principle.",Toast.LENGTH_LONG)

        //button
        ok_btn.setOnClickListener(){
            if (firstbalance.text.toString() == ""){
                toasterr.show()
            }
            else if(firstbalance.text.toString().toInt() == 0){
                toasterr.show()
            }
            else{
            //cal method
            balance = firstbalance.text.toString().toInt()
            one  = balance * 3/100
            one = one *3
            firstinterest.setText(one.toString())

            two= balance * 5/100
            two = two *3
            secondinterest.setText(two.toString())


            three= balance * 7/100
            three = three *3
            thridinterest.setText(three.toString())

            totalinterest = one + two + three
            totalinteresttext.setText(totalinterest.toString())

            totalbalance = firstbalance.text.toString().toInt() + totalinterest
            totalbalancetext.setText(totalbalance.toString())
            }
        }

        clear_btn.setOnClickListener(){
            firstinterest.setText("0")
            secondinterest.setText("0")
            thridinterest.setText("0")
            firstbalance.setText("")
            totalinteresttext.setText("0")
            totalbalancetext.setText("0")
        }
    }
}
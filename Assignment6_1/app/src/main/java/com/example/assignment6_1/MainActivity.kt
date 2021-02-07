package com.example.assignment6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variable
        var a:Double = 0.00
        var b:Double = 0.00
        var sum:Double = 0.00
        var sumde = 0.00
        var toastErr = Toast.makeText(applicationContext,"Please enter num1 and num2.",Toast.LENGTH_LONG)
        var toastErr2 = Toast.makeText(applicationContext,"0 cannot be calculated.",Toast.LENGTH_LONG)

        //Button
        plus_btn.setOnClickListener(){

            if (editNumber1.text.toString() == ""  && editNumber2.text.toString() == "" ) {
                symbo.setText("")
                toastErr.show()
            }
            else if (editNumber2.text.toString() == "" ){
                symbo.setText("")
                toastErr.show()
            }
            else if(editNumber1.text.toString() == ""){
                symbo.setText("")
                toastErr.show()
            }
            else {
                symbo.setText("+")
                a = editNumber1.text.toString().toDouble()
                b = editNumber2.text.toString().toDouble()
                sum = a + b
                sumde = sum
                sumde = String.format("%.2f", sum).toDouble()
                totaltext.setText(sumde.toString())
            }
        }

        minus_btn.setOnClickListener(){
            if (editNumber1.text.toString() == ""  && editNumber2.text.toString() == "" ) {
                symbo.setText("")
                toastErr.show()
            }
            else if (editNumber2.text.toString() == "" ){
                symbo.setText("")
                toastErr.show()
            }
            else if(editNumber1.text.toString() == ""){
                symbo.setText("")
                toastErr.show()
            }
            else{
                symbo.setText("-")
                a = editNumber1.text.toString().toDouble()
                b = editNumber2.text.toString().toDouble()
                sum = a - b
                sumde = sum
                sumde = String.format("%.2f", sum).toDouble()
                totaltext.setText(sumde.toString())
            }
        }

        multiply_btn.setOnClickListener(){
            if (editNumber1.text.toString() == ""  && editNumber2.text.toString() == "" ) {
                symbo.setText("")
                toastErr.show()
            }
            else if (editNumber2.text.toString() == "" ){
                symbo.setText("")
                toastErr.show()
            }
            else if(editNumber1.text.toString() == ""){
                symbo.setText("")
                toastErr.show()
            }
            else{
                symbo.setText("x")
                a = editNumber1.text.toString().toDouble()
                b = editNumber2.text.toString().toDouble()
                sum = a * b
                sumde = sum
                sumde = String.format("%.2f", sum).toDouble()
                totaltext.setText(sumde.toString())
            }
        }

        divider_btn.setOnClickListener(){
            if (editNumber1.text.toString() == ""  && editNumber2.text.toString() == "" ) {
                symbo.setText("")
                toastErr.show()
            }
            else if (editNumber2.text.toString() == "" ){
                symbo.setText("")
                toastErr.show()
            }
            else if(editNumber1.text.toString() == ""){
                symbo.setText("")
                toastErr.show()
            }
            else{
                symbo.setText("÷")
                a = editNumber1.text.toString().toDouble()
                b = editNumber2.text.toString().toDouble()
                sum = a / b
                sumde = sum
                sumde = String.format("%.2f", sum).toDouble()
                totaltext.setText(sumde.toString())
            }
        }

                modulo_btn.setOnClickListener(){
                    if (editNumber1.text.toString() == ""  && editNumber2.text.toString() == "" ) {
                        symbo.setText("")
                        toastErr.show()
                    }
                    else if (editNumber2.text.toString() == "" ){
                        symbo.setText("")
                        toastErr.show()
                    }
                    else if(editNumber1.text.toString() == ""){
                        symbo.setText("")
                        toastErr.show()
                    }
                    else if(editNumber2.text.toString().toInt() == 0){
                        symbo.setText("")
                        toastErr2.show()
                    }
                    else{
                        symbo.setText("%")
                        a = editNumber1.text.toString().toDouble()
                        b = editNumber2.text.toString().toDouble()
                        sum = a % b
                        sumde = sum
                        sumde = String.format("%.2f", sum).toDouble()
                        totaltext.setText(sumde.toString())
                    }
                }

        clear_btn.setOnClickListener(){
            editNumber1.setText(null)
            editNumber2.setText(null)
            symbo.setText("")
            totaltext.setText("")
        }

    }
}
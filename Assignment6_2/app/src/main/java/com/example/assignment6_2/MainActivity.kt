package com.example.assignment6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variable
        var toasterr = Toast.makeText(applicationContext,"กรุณาใส่ข้อมูลให้ครบ",Toast.LENGTH_LONG)
        var toasterr1 = Toast.makeText(applicationContext,"กรุณาใส่หน่วยกิจระหว่าง 1 - 3",Toast.LENGTH_LONG)
        var toasterr2 = Toast.makeText(applicationContext,"กรุณาใส่เกรดระหว่าง 0.00 - 4.00",Toast.LENGTH_LONG)


        var gpatotal:Double = 0.00
        var gpade = 0.00

        //Button
        ok_btn.setOnClickListener(){
            //Check method
            if (Subjectname1.text.toString() == "" ){
                toasterr.show()
            }
            else if (Credit1.text.toString() == "" ){
                toasterr.show()
            }
            else if (Grade1.text.toString() == ""){
                toasterr.show()
            }
            else{
                if (Subjectname2.text.toString() == "" ){
                    toasterr.show()
                }
                else if (Credit2.text.toString() == ""){
                    toasterr.show()
                }
                else if (Grade2.text.toString() == ""){
                    toasterr.show()
                }
                else{
                    if (Subjectname3.text.toString() == "" ){
                        toasterr.show()
                    }
                    else if (Credit3.text.toString() == ""){
                        toasterr.show()
                    }
                    else if (Grade3.text.toString() == ""){
                        toasterr.show()
                    }
                    else{
                        if (Subjectname4.text.toString() == "" ){
                            toasterr.show()
                        }
                        else if (Credit4.text.toString() == ""){
                            toasterr.show()
                        }
                        else if (Grade4.text.toString() == ""){
                            toasterr.show()
                        }
                        else{
                            if (Subjectname5.text.toString() == "" ){
                                toasterr.show()
                            }
                            else if (Credit5.text.toString() == ""){
                                toasterr.show()
                            }
                            else if (Grade5.text.toString() == ""){
                                toasterr.show()
                            }
                            else{

                                //check credit value between 1-3
                                if (Credit1.text.toString().toInt() <=3 && Credit1.text.toString().toInt() >= 1){

                                    if (Credit2.text.toString().toInt() <=3 && Credit2.text.toString().toInt() >= 1){

                                        if (Credit3.text.toString().toInt() <=3 && Credit3.text.toString().toInt() >= 1){

                                            if (Credit4.text.toString().toInt() <=3 && Credit4.text.toString().toInt() >= 1){

                                                if (Credit5.text.toString().toInt() <=3 && Credit5.text.toString().toInt() >= 1){

                                                    //check grade
                                                   if (Grade1.text.toString().toDouble() <= 4.00 && Grade1.text.toString().toDouble() >= 0.00) {

                                                       if (Grade2.text.toString().toDouble() <= 4.00 && Grade2.text.toString().toDouble() >= 0.00) {

                                                           if (Grade3.text.toString().toDouble() <= 4.00 && Grade3.text.toString().toDouble() >= 0.00) {

                                                               if (Grade4.text.toString().toDouble() <= 4.00 && Grade4.text.toString().toDouble() >= 0.00) {

                                                                   if (Grade5.text.toString().toDouble() <= 4.00 && Grade5.text.toString().toDouble() >= 0.00) {

                                                                       //cal method

                                                                       var a = Grade1.text.toString().toDouble()
                                                                       var a1 = Credit1.text.toString().toInt()
                                                                       var totala:Double = 0.00
                                                                       var b = Grade2.text.toString().toDouble()
                                                                       var b1 = Credit2.text.toString().toInt()
                                                                       var totalb:Double = 0.00
                                                                       var c = Grade3.text.toString().toDouble()
                                                                       var c1 = Credit3.text.toString().toInt()
                                                                       var totalc:Double = 0.00
                                                                       var d = Grade4.text.toString().toDouble()
                                                                       var d1 = Credit4.text.toString().toInt()
                                                                       var totald:Double = 0.00
                                                                       var e = Grade5.text.toString().toDouble()
                                                                       var e1 = Credit5.text.toString().toInt()
                                                                       var totale:Double = 0.00
                                                                       var totalcredit = 0

                                                                       totalcredit = a1 + b1 +c1 +d1 +e1
                                                                       totaltext.setText(totalcredit.toString())

                                                                       totala = a * a1
                                                                       totalb = b * b1
                                                                       totalc = c * c1
                                                                       totald = d * d1
                                                                       totale = e * e1

                                                                        gpatotal = totala + totalb + totalc + totald + totale
                                                                       gpade = gpatotal / totalcredit
                                                                       gpade = String.format("%.2f", gpade).toDouble()
                                                                        gpatext.setText(gpade.toString())
                                                                   }

                                                                   else{
                                                                       toasterr2.show()
                                                                   }
                                                               }
                                                               else{
                                                                   toasterr2.show()
                                                               }
                                                           }
                                                           else{
                                                               toasterr2.show()
                                                           }
                                                       }
                                                       else{
                                                           toasterr2.show()
                                                       }
                                                    }
                                                    else{
                                                        toasterr2.show()
                                                    }
                                        }
                                        else{
                                            toasterr1.show()
                                        }
                                    }
                                    else{
                                        toasterr1.show()
                                    }
                                }
                                else{
                                    toasterr1.show()
                                }
                            }
                         else{
                              toasterr1.show()
                          }
                        }
                     else{
                         toasterr1.show()
                     }
                                //Close check value
                    }
                }
            }
        }
    }
} // close ok_btn

        clear_btn.setOnClickListener(){
            Subjectname1.setText(null)
            Subjectname2.setText(null)
            Subjectname3.setText(null)
            Subjectname4.setText(null)
            Subjectname5.setText(null)
            Credit1.setText(null)
            Credit2.setText(null)
            Credit3.setText(null)
            Credit4.setText(null)
            Credit5.setText(null)
            Grade1.setText(null)
            Grade2.setText(null)
            Grade3.setText(null)
            Grade4.setText(null)
            Grade5.setText(null)
            totaltext.setText(null)
            gpatext.setText(null)

        }
      }
}
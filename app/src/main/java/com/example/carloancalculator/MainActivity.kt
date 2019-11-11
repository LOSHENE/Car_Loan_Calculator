package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java .util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener(){
            calculateLoan();
        }
        buttonreset.setOnClickListener(){
            reset();
        }
    }
          



    private fun calculateLoan(){ //calculate car loan //user inpput and output



        if(editTextcarPrice.text.isEmpty())
        {
            editTextcarPrice.setError(getString(R.string.input_error))
            return
        }
        if(editTextDownPayment.text.isEmpty()){
            editTextDownPayment.setError(getString(R.string.input_error))
            return
        }
        if(editTextInterestRate.text.isEmpty()){
            editTextInterestRate.setError(getString(R.string.input_error))
            return
        }
        if(editTextloanPeriod.text.isEmpty()){
            editTextloanPeriod.setError(getString(R.string.input_error))
        }
        val carPrice: Int =editTextcarPrice.text.toString().toInt();
        val downPayment :Int =editTextDownPayment.text.toString().toInt()
        val interestRate :Float = editTextInterestRate.text.toString().toFloat()
        val loanPeriod : Int=editTextloanPeriod.text.toString().toInt();

        val CarLoan:Int = carPrice - downPayment;
        val Interest : Float = CarLoan * interestRate *loanPeriod;
        val monthlyPayment= (CarLoan + Interest )/loanPeriod / 12 ;

        val currency : Currency = Currency.getInstance(Locale.getDefault());

        CarLoan.text= String.format("%s %s %d" ,"loan : ",currency,CarLoan )
        Interest.text= String.format("%s %s %2f","interest : " ,currency,Interest)
        monthlypayment.text= String.format("%s %s %2f","Monthly Payment : " ,currency,monthlyPayment)




    }
    private fun reset(){
        editTextloanPeriod.text.clear();
        editTextInterestRate.text.clear();
        editTextDownPayment.text.clear();
        editTextcarPrice.text.clear();


        CarLoan.text ="";



    }




}

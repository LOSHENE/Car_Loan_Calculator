package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    buttonCalculate.setOnClickListener{
        calculateLoan()
    }

    private fun calculateLoan(){ //calculate car loan

        if(editTextcarPrice.text.isEmpty())
        {
            editTextcarPrice.setError(getString(R.string.input_error))
        }
        val carPrice:Float=editTextcarPrice.text.toString().toFloat()
        val down_payment :Int =editTextDownPayment.text.toString().toInt()
        val interest_rate :Float = editTextInterestRate.text.toString().toFloat()
        val monthly_payment : Int =monthlypayment.text.toString().toInt()

        val interest = carLoan * interest_rate * editTextloanPeriod

    }
    fun reset(view: View){


    }

    v


}

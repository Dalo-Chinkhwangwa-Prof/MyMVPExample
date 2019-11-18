package com.example.mymvpapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymvpapplication.R
import com.example.mymvpapplication.presenter.CalculationPresenter
import com.example.mymvpapplication.presenter.PresenterContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PresenterContract.View {

    private lateinit var calculationPresenter: CalculationPresenter

    override fun displayAnswer(answer: Int) {
        answer_textview.text = answer.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculationPresenter = CalculationPresenter()
        calculationPresenter.setView(this)


        button_square.setOnClickListener {
            val squareNumber = Integer.parseInt(first_edittext.text.toString())
            first_edittext.text.clear()
            calculationPresenter.calculateSqr(squareNumber)
        }

        button_division.setOnClickListener {
            val numerator = Integer.parseInt(first_edittext.text.toString())
            first_edittext.text.clear()
            val denominator = Integer.parseInt(second_edittext.text.toString())
            second_edittext.text.clear()

            calculationPresenter.divideNumbers(numerator, denominator)
        }
    }
}

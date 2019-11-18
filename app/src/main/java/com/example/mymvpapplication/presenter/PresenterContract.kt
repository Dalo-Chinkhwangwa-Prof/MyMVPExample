package com.example.mymvpapplication.presenter

interface PresenterContract {

    interface Presenter {
        fun calculateSqr(number: Int)
        fun divideNumbers(numerator:Int, denominator: Int)
        fun setView(myView: PresenterContract.View)
    }

    interface View {
        fun displayAnswer(answer: Int)
    }
}
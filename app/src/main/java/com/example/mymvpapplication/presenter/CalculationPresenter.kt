package com.example.mymvpapplication.presenter

class CalculationPresenter : PresenterContract.Presenter {

    private lateinit var myView: PresenterContract.View


    override fun calculateSqr(number: Int) {

        myView.displayAnswer((number * number))
    }

    override fun divideNumbers(numerator: Int, denominator: Int) {
        myView.displayAnswer((numerator/denominator))
    }

    override fun setView(myView: PresenterContract.View) {
        this.myView = myView
    }
}
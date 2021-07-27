package com.example.daggerhilt_study

import android.util.Log

class Salad(private val tomato: Tomato, private val sauce: Sauce) {

    private val saladText = "샐러드"

    fun setSalad(){
        Log.d("Logd", "${saladText}와")
    }

    fun setSaladMat(){
        Log.d("Logd", "${saladText}의 재료는")
    }

    fun getTomato(){
        tomato.setTomato()
    }

    fun getSauce(){
        sauce.setSauce()
    }
}
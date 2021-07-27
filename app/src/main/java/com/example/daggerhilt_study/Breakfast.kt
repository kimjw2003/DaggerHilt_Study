package com.example.daggerhilt_study

import android.util.Log

class Breakfast(private val salad : Salad, private val milk : Milk) {

    private val breakfastText = "아침식사"

    fun setBreakfast(){
        Log.d("Logd", "${breakfastText}는")
    }

    fun getSalad(){
        salad.setSalad()
    }

    fun getMilk(){
        milk.setMilk()
    }
}
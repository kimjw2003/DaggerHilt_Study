package com.example.daggerhilt_study

import android.util.Log

class Milk {

    private val milkText = "우유"

    fun setMilk(){
        Log.d("Logd", "${milkText}입니다.")
    }
}
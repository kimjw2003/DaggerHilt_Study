package com.example.daggerhilt_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject lateinit var breakfast: Breakfast
    @Inject lateinit var salad: Salad

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        breakfast.setBreakfast()
        breakfast.getSalad()
        breakfast.getMilk()
        salad.setSaladMat()
        salad.getTomato()
        salad.getSauce()

    }
}
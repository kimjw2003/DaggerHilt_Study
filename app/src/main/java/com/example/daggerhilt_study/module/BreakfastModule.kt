package com.example.daggerhilt_study.module

import com.example.daggerhilt_study.Breakfast
import com.example.daggerhilt_study.Salad
import com.example.daggerhilt_study.Milk
import com.example.daggerhilt_study.Sauce
import com.example.daggerhilt_study.Tomato
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class BreakfastModule {

    @Provides
    fun provideBreakfast() : Breakfast{
        return Breakfast(provideSalad(), provideMilk())
    }

    @Provides
    fun provideSalad() : Salad {
        return Salad(provideTomato(), provideSauce())
    }

    @Provides
    fun provideMilk() : Milk {
        return Milk()
    }

    @Provides
    fun provideTomato() : Tomato{
        return Tomato()
    }

    @Provides
    fun provideSauce() : Sauce {
        return Sauce()
    }
}
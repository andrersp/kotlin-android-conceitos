package com.example.mvvm_conceito

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var textWellcome = MutableLiveData<String>()

    init {
        textWellcome.value = "Olá"
    }

    fun wellcome(): LiveData<String>{
        return textWellcome
    }

}
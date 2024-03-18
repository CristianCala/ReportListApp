package com.example.reportlistsystem.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hola mundo, aqui va una tabla to do list"
    }
    val text: LiveData<String> = _text
}
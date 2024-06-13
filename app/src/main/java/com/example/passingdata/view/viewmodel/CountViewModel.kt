package com.example.passingdata.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val mutableLiveData = MutableLiveData<Int>()

    fun getmutableLiveData() : LiveData<Int>{
        return mutableLiveData
    }

    init {
        mutableLiveData.value = 0
    }

    fun increment(){
        mutableLiveData.value = mutableLiveData.value!! + 1;
    }

    fun decrement(){
        mutableLiveData.value = mutableLiveData.value!! - 1;
    }
}
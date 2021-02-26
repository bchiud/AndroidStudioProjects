package com.bradychiu.easy

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val _clicks = MutableLiveData<Int>()
    val clicks: LiveData<Int>
        get() = _clicks

    init {
        Log.i("CountViewModel", "init")
        _clicks.value = 0
    }

    fun onClick() {
        _clicks.value = (clicks.value)?.plus(1)
        Log.i("CountViewModel", "Click count: ${clicks.value}")
    }

    fun onReset() {
        _clicks.value = 0
    }
}
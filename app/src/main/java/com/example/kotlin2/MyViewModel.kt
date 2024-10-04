package com.example.kotlin2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MyViewModel(private val getDataUseCase: GetDataUseCase) : ViewModel() {
    val data: LiveData<String> = getDataUseCase.execute()
}
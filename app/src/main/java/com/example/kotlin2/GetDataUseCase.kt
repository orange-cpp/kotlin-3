package com.example.kotlin2

import androidx.lifecycle.LiveData

class GetDataUseCase(private val dataRepository: DataRepository) {
    fun execute(): LiveData<String> {
        return dataRepository.getData()
    }
}
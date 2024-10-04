package com.example.kotlin2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataRepository(private val dataRemoteDataSource:
                     DataRemoteDataSource) {
    fun getData(): LiveData<String> {
        return dataRemoteDataSource.getDataFromNetwork()
    }
}
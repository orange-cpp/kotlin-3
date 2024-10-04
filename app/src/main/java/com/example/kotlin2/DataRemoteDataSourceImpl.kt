package com.example.kotlin2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataRemoteDataSourceImpl : DataRemoteDataSource {
    override fun getDataFromNetwork(): LiveData<String> {
        val liveData = MutableLiveData<String>()

        Thread {
            Thread.sleep(2000)
            liveData.postValue("Data from network")
        }.start()

        return liveData
    }
}
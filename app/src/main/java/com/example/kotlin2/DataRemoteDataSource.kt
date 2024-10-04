package com.example.kotlin2

import androidx.lifecycle.LiveData

interface DataRemoteDataSource {
    fun getDataFromNetwork(): LiveData<String>
}
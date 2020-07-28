package com.techandfin.gaslogger

import android.util.Log
import dagger.Module
import javax.inject.Inject

@Module
class GasLogger
    @Inject constructor() {

    fun insertRecord() {
        Log.d("TAG", "logged")
    }
}
package com.techandfin.gaslogger

import android.util.Log
import dagger.Module
import org.joda.time.DateTime
import javax.inject.Inject

@Module
class GasRecord(val pricePerLiter: Double,
                val gasAmount: Double,
                val totalPayed: Double,
                val date: DateTime) {

    @Inject constructor():this(0.0,0.0,0.0, DateTime.now())

    fun averagePerLiter(){
        Log.d("TAG", "4.00")
    }

}
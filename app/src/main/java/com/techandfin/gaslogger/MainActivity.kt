package com.techandfin.gaslogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var gasLoggerController: GasLogger
    @Inject lateinit var gasRecord: GasRecord

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerGasLoggerComponent.create().inject(this)

        gasLoggerController.insertRecord()
        gasRecord.averagePerLiter()
    }
}
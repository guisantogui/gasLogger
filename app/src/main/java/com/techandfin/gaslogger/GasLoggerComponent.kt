package com.techandfin.gaslogger

import dagger.Component

@Component(modules = [GasLogger::class, GasRecord::class])
interface GasLoggerComponent {

    fun inject(main: MainActivity)
}
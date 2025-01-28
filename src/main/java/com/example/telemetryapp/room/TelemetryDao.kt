package com.example.telemetryapp.room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TelemetryDao {
    @Insert
    fun insert(telemetry: Telemetry)
}

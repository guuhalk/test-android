package com.example.telemetryapp.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Telemetry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun telemetryDao(): TelemetryDao
}

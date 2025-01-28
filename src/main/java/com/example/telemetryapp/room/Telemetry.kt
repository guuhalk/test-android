package com.example.telemetryapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "telemetry")
data class Telemetry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: String,
    val data: String,
    val timestamp: Long
)

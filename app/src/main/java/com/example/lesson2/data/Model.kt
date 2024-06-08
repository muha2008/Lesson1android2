package com.example.lesson2.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Model(
    val name: String,
    val password: String,
    val email: String
): Parcelable

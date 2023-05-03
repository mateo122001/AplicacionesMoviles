package com.mateodevs.evaluacion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Laptop (
    val intResourceId:Int,
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId: Int

)


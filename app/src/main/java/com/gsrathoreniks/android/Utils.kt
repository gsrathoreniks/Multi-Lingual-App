package com.gsrathoreniks.android

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

fun setAppLocale(context: Context, language: String) {
    val locale = Locale(language)
    Locale.setDefault(locale)
    val config = context.resources.configuration
    config.setLocale(locale)
    context.createConfigurationContext(config)
    context.resources.updateConfiguration(config, context.resources.displayMetrics)
}
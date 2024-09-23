package com.recipenews.rnds.atoms.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


/**
 * A class to model background color and tonal elevation values for Now in Android.
 */
@Immutable
data class RNTintTheme(
    val iconTint: Color = Color.Unspecified,
)

/**
 * A composition local for [RNTintTheme].
 */
val LocalRNTintTheme = staticCompositionLocalOf { RNTintTheme() }

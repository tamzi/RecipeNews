package com.recipenews.rnds

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.atoms.color.BackgroundTheme
import com.recipenews.rnds.atoms.color.DarkAndroidColorScheme
import com.recipenews.rnds.atoms.color.DarkDefaultColorScheme
import com.recipenews.rnds.atoms.color.DarkGreenGray95
import com.recipenews.rnds.atoms.color.RNGradientColors
import com.recipenews.rnds.atoms.color.LightAndroidColorScheme
import com.recipenews.rnds.atoms.color.LightDefaultColorScheme
import com.recipenews.rnds.atoms.color.LocalRNBackgroundTheme
import com.recipenews.rnds.atoms.color.LocalRNGradientColors
import com.recipenews.rnds.atoms.color.LocalRNTintTheme
import com.recipenews.rnds.atoms.color.RNTintTheme
import com.recipenews.rnds.atoms.type.RNTypography


/**
 * Light Android gradient colors
 */
val LightAndroidRNGradientColors = RNGradientColors(container = DarkGreenGray95)

/**
 * Dark Android gradient colors
 */
val DarkAndroidRNGradientColors = RNGradientColors(container = Color.Black)

/**
 * Light Android background theme
 */
val LightAndroidBackgroundTheme = BackgroundTheme(color = DarkGreenGray95)

/**
 * Dark Android background theme
 */
val DarkAndroidBackgroundTheme = BackgroundTheme(color = Color.Black)

/**
 * RecipeNews theme.
 *
 * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
 * @param androidTheme Whether the theme should use the Android theme color scheme instead of the
 *        default theme.
 * @param disableDynamicTheming If `true`, disables the use of dynamic theming, even when it is
 *        supported. This parameter has no effect if [androidTheme] is `true`.
 */
@Composable
fun RNTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    androidTheme: Boolean = false,
    disableDynamicTheming: Boolean = true,
    content: @Composable () -> Unit,
) {
    // Color scheme
    val colorScheme = when {
        androidTheme -> if (darkTheme) DarkAndroidColorScheme else LightAndroidColorScheme
        !disableDynamicTheming && supportsDynamicTheming() -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        else -> if (darkTheme) DarkDefaultColorScheme else LightDefaultColorScheme
    }
    // Gradient colors
    val emptyRNGradientColors = RNGradientColors(container = colorScheme.surfaceColorAtElevation(2.dp))
    val defaultRNGradientColors = RNGradientColors(
        top = colorScheme.inverseOnSurface,
        bottom = colorScheme.primaryContainer,
        container = colorScheme.surface,
    )
    val gradientColors = when {
        androidTheme -> if (darkTheme) DarkAndroidRNGradientColors else LightAndroidRNGradientColors
        !disableDynamicTheming && supportsDynamicTheming() -> emptyRNGradientColors
        else -> defaultRNGradientColors
    }
    // Background theme
    val defaultBackgroundTheme = BackgroundTheme(
        color = colorScheme.surface,
        tonalElevation = 2.dp,
    )
    val backgroundTheme = when {
        androidTheme -> if (darkTheme) DarkAndroidBackgroundTheme else LightAndroidBackgroundTheme
        else -> defaultBackgroundTheme
    }
    val RNTintTheme = when {
        androidTheme -> RNTintTheme()
        !disableDynamicTheming && supportsDynamicTheming() -> RNTintTheme(colorScheme.primary)
        else -> RNTintTheme()
    }
    // Composition locals
    CompositionLocalProvider(
        LocalRNGradientColors provides gradientColors,
        LocalRNBackgroundTheme provides backgroundTheme,
        LocalRNTintTheme provides RNTintTheme,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = RNTypography,
            content = content,
        )
    }
}

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
fun supportsDynamicTheming() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

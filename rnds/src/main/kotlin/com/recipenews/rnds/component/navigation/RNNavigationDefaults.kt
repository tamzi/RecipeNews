package com.recipenews.rnds.component.navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


/**
 * RecipeNews navigation default values.
 */
object RNNavigationDefaults {
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.onSurfaceVariant

    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.onPrimaryContainer

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer
}

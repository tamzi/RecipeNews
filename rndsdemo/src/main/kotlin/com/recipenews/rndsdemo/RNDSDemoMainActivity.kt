package com.recipenews.rndsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.recipenews.rndsdemo.screens.RNDSDemoEmptyScreen
import com.recipenews.rndsdemo.screens.RNDSNavigationDemoScreen
import com.recipenews.rndsdemo.screens.RNDSTabsScreen
import com.recipenews.rndsdemo.screens.RNDSTagsScreen
import com.recipenews.rndsdemo.screens.RNDSToggleButtonsDemoScreen
import com.recipenews.rndsdemo.screens.RNDSButtonsDemoScreen


class RNDSDemoMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent { RNDSNavigationDemoScreen() }
    }
}
package com.recipenews.rndsdemo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.RNTheme
import com.recipenews.rnds.atoms.type.RNTypography

/*
This is a demo empty screen you can use when adding new demo screens to the demo app
*/
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RNDSDemoEmptyScreen() {
    RNTheme{
        Surface {
            val contentPadding = WindowInsets
                .systemBars
                .add(WindowInsets(left = 16.dp, top = 16.dp, right = 16.dp, bottom = 16.dp))
                .asPaddingValues()
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = contentPadding,
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ){
                item {

                    Text(
                        text = "RNDS Demo Page title",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "This is an empty demo page in the Recipe News Design System." +
                                "Change this paragraph to explain what is being demo-d",
                        style = RNTypography.bodyMedium,
                    )
                }
                item {
                    Text(
                        text = "Title of item in rnds",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    //add something here
                }


            }
        }
    }
}
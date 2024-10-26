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
fun RNDSTextDemoScreen() {
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
                        text = "RNDS Text Demo Page title",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "These are the texts that we have in the Recipe News Design System",
                        style = RNTypography.bodyMedium,
                    )
                }
                // Start of display type
                item {
                    Text(
                        text = "display type in rnds",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    Text(
                        text = "Display large",
                        style = RNTypography.displayLarge,
                    )
                }
                item {
                    Text(
                        text = "Display medium",
                        style = RNTypography.displayMedium,
                    )
                }
                item {
                    Text(
                        text = "Display small",
                        style = RNTypography.displaySmall,
                    )
                }
                // Start of Headline type
                item {
                    Text(
                        text = "body type in rnds",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    Text(
                        text = "Body Large",
                        style = RNTypography.bodyLarge,
                    )
                }
                item {
                    Text(
                        text = "Body Medium",
                        style = RNTypography.bodyMedium,
                    )
                }
                item {
                    Text(
                        text = "Body Small",
                        style = RNTypography.bodySmall,
                    )
                }
                // Start of Headline type
                item {

                    Text(
                        text = "headline type in rnds",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    Text(
                        text = "Headline Large",
                        style = RNTypography.headlineLarge,
                    )
                }
                item {
                    Text(
                        text = "Headline Medium",
                        style = RNTypography.headlineMedium,
                    )
                }
                item {
                    Text(
                        text = "Headline Small",
                        style = RNTypography.headlineSmall,
                    )
                }
                // Start of Headline type
                item {

                    Text(
                        text = "title type in rnds",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    Text(
                        text = "Title Large",
                        style = RNTypography.titleLarge,
                    )
                }
                item {
                    Text(
                        text = "Title Medium",
                        style = RNTypography.titleMedium,
                    )
                }
                item {
                    Text(
                        text = "Title Small",
                        style = RNTypography.titleSmall,
                    )
                }


            }
        }
    }
}
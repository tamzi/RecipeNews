package com.recipenews.rndsdemo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import com.recipenews.rnds.component.RNTopicTag
/**
 * RecipeNews tags components Demo.
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RNDSTagsScreen() {
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
                        text = "RNDS Tags Catalog",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "These are the Tags available in the Recipe News Design System",
                        style = RNTypography.bodyMedium,
                    )
                }
                /**  Tags*/
                item {
                    Text(
                        text = "Tags",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        RNTopicTag(
                            followed = true,
                            onClick = {},
                            text = { Text(text = "Topic 1".uppercase()) },
                        )
                        RNTopicTag(
                            followed = false,
                            onClick = {},
                            text = { Text(text = "Topic 2".uppercase()) },
                        )
                        RNTopicTag(
                            followed = false,
                            onClick = {},
                            text = { Text(text = "Disabled".uppercase()) },
                            enabled = false,
                        )
                    }
                }


            }
        }
    }
}
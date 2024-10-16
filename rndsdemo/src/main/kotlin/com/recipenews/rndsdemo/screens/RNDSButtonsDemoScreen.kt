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
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.RNIcons
import com.recipenews.rnds.RNTheme
import com.recipenews.rnds.atoms.type.RNTypography
import com.recipenews.rnds.component.button.RNButton
import com.recipenews.rnds.component.button.RNOutlinedButton
import com.recipenews.rnds.component.button.RNTextButton

/**
 * RecipeNews Design System components Demo.
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RNDSButtonsDemoScreen() {
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
                        text = "RNDS Buttons Catalog",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "These are the buttons available in the Recipe News Design System",
                        style = RNTypography.bodyMedium,
                    )
                }
                /** Buttons start here*/
                item {
                    Text(
                        text = "Normal Buttons",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        RNButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                        RNOutlinedButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                        RNTextButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                    }
                }
                item {
                    Text(
                        text = "Disabled Buttons",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        RNButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                        RNOutlinedButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                        RNTextButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                    }
                }
                item {
                    Text(
                        text = "Buttons with Leading Icons",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        RNButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = RNIcons.Add, contentDescription = null)
                            },
                        )
                        RNOutlinedButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = RNIcons.Add, contentDescription = null)
                            },
                        )
                        RNTextButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = RNIcons.Add, contentDescription = null)
                            },
                        )
                    }
                }


            }
        }
    }
}
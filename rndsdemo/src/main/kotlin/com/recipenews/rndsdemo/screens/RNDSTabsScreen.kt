package com.recipenews.rndsdemo.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.recipenews.rnds.component.RNTab
import com.recipenews.rnds.component.RNTabRow
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
This showcases the tabs that are available in the Recipe News Design System
*/
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RNDSTabsScreen() {
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
                        text = "RNDS Tabs",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "This Shows tabs available in the Recipe News Design System.",
                        style = RNTypography.bodyMedium,
                    )
                }
                item {
                    Text(
                        text = "Tabs",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
                    val titles = listOf("Recipes", "Types", "Cuisines",  "Continent")
                    RNTabRow(selectedTabIndex = selectedTabIndex) {
                        titles.forEachIndexed { index, title ->
                            RNTab(
                                selected = selectedTabIndex == index,
                                onClick = { selectedTabIndex = index },
                                text = { Text(text = title) },
                            )
                        }
                    }
                }


            }
        }
    }
}
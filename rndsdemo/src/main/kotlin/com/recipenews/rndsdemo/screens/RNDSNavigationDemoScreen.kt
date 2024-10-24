package com.recipenews.rndsdemo.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.RNIcons
import com.recipenews.rnds.RNTheme
import com.recipenews.rnds.atoms.type.RNTypography
import com.recipenews.rnds.component.navigation.RNNavigationBar
import com.recipenews.rnds.component.navigation.RNNavigationBarItem

/*
This is a demo empty screen you can use when adding new demo screens to the demo app
*/
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RNDSNavigationDemoScreen() {
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
                        text = "RNDS Navigation Demo",
                        style = RNTypography.displaySmall,
                    )
                }
                item {
                    Text(
                        text = "This screens shows how the navigation works",
                        style = RNTypography.bodyMedium,
                    )
                }
                item {
                    Text(
                        text = "Navigation",
                        style = RNTypography.headlineSmall,
                    )
                }
                item {
                    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
                    val items = listOf("For you", "Saved", "Interests")
                    val icons = listOf(
                        RNIcons.UpcomingBorder,
                        RNIcons.BookmarksBorder,
                        RNIcons.Grid3x3,
                    )
                    val selectedIcons = listOf(
                        RNIcons.Upcoming,
                        RNIcons.Bookmarks,
                        RNIcons.Grid3x3,
                    )
                    RNNavigationBar {
                        items.forEachIndexed { index, item ->
                            RNNavigationBarItem(
                                icon = {
                                    Icon(
                                        imageVector = icons[index],
                                        contentDescription = item,
                                    )
                                },
                                selectedIcon = {
                                    Icon(
                                        imageVector = selectedIcons[index],
                                        contentDescription = item,
                                    )
                                },
                                label = { Text(item) },
                                selected = selectedItem == index,
                                onClick = { selectedItem = index },
                            )
                        }
                    }
                }


            }
        }
    }
}
package com.recipenews.rnds.component

import androidx.annotation.StringRes
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.recipenews.rnds.RNIcons
import com.recipenews.rnds.RNTheme


/**
 * RNTopAppBar is the topbar of the application.
 *  creates a top app bar with a centered title,
 *  a navigation icon on the left, and an action icon on the right.
 *
 *  @param titleRes The string resource ID for the title of the top app bar.
 *  @param navigationIcon The icon to be used as the navigation icon.
 *  @param navigationIconContentDescription The content description for the navigation icon.
 *  @param actionIcon The icon to be used as the action icon.
 *
 * To use this component:
 *
 * 1. Import the RNTopBar Component.
 * 2. Use the RNTopBar composable function to add a loading wheel to your UI. This function takes a contentDesc parameter for accessibility and an optional modifier parameter for styling.
 *
 * ```@Composable
 * fun MyScreen() {
 *       RNTopAppBar(
 *             titleRes = android.R.string.untitled,
 *             navigationIcon = RNIcons.Search,
 *             navigationIconContentDescription = "Navigation icon",
 *             actionIcon = RNIcons.MoreVert,
 *             actionIconContentDescription = "Action icon",
 *         )
 *  }
 *  ```
 *  You can replace the icons with any other icons from the RNIcons class.
 *  You can also replace the titleRes with any string resource ID.
 *
 *
 * @sample RNTopAppBarPreview
 * @see RNTopAppBar
 *

 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RNTopAppBar(
    @StringRes titleRes: Int,
    navigationIcon: ImageVector,
    navigationIconContentDescription: String,
    actionIcon: ImageVector,
    actionIconContentDescription: String,
    modifier: Modifier = Modifier,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    onNavigationClick: () -> Unit = {},
    onActionClick: () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = titleRes)) },
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    imageVector = navigationIcon,
                    contentDescription = navigationIconContentDescription,
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            }
        },
        actions = {
            IconButton(onClick = onActionClick) {
                Icon(
                    imageVector = actionIcon,
                    contentDescription = actionIconContentDescription,
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            }
        },
        colors = colors,
        modifier = modifier.testTag("RNTopAppBar"),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview("Top App Bar")
@Composable
private fun RNTopAppBarPreview() {
    RNTheme {
        RNTopAppBar(
            titleRes = android.R.string.untitled,
            navigationIcon = RNIcons.Search,
            navigationIconContentDescription = "Navigation icon",
            actionIcon = RNIcons.MoreVert,
            actionIconContentDescription = "Action icon",
        )
    }
}

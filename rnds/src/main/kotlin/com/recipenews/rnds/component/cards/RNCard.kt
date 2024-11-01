package com.recipenews.rnds.component.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.atoms.type.RNTypography

@Composable
fun DashboardCardItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    count: String,
    color: Color,
    onClick: () -> Unit
) {
    val gradientBrush = Brush.verticalGradient(listOf(color.copy(alpha = .8F), color), startY = 10F)

    Spacer(modifier = modifier.height(16.dp))

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp),
                spotColor = color,
                ambientColor = color.copy(alpha = 0.4f)
            )
            .clip(RoundedCornerShape(16.dp))
            .background(brush = gradientBrush)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            modifier = modifier
                .wrapContentWidth()
                .padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
                .align(Alignment.CenterVertically)
        ) {
            Text(text = title, style = RNTypography.titleMedium, color = Color.DarkGray)
            Spacer(modifier = modifier.height(16.dp))
            Text(text = description, style = RNTypography.labelMedium, color = Color.DarkGray)
        }
        Spacer(modifier = modifier.width(16.dp)) // Use Spacer with width for horizontal spacing
        Text(text = count, style = RNTypography.titleLarge, color = Color.DarkGray)
    }
}


@Preview(name = "Dashboard Eisenhower matrix cards ", group = "Card")
@Composable
fun DashboardPreview() {
    Column {
        RNInfoCard(title = "Urgency", value = "2", modifier = Modifier)

        DashboardCardItem(
            title = "Do it now",
            description = "Important & Urgent",
            count = "13",
            color = Color(0xFF6FCF97)
        ) {
            // click action goes here
        }
        Spacer(modifier = Modifier.height(12.dp))
        DashboardCardItem(
            title = "Decide when to do",
            description = "Important not Urgent",
            count = "17",
            color = Color(0xFF006AF6)
        ) {
            // click action goes here
        }

        Spacer(modifier = Modifier.height(12.dp))
        DashboardCardItem(
            title = "Delegate it",
            description = "Urgent not Important",
            count = "03",
            color = Color(0xFF006AF6)
        ) {
            // click action goes here
        }

        Spacer(modifier = Modifier.height(12.dp))
        DashboardCardItem(
            title = "Dump it",
            description = "Not Important & Not Urgent",
            count = "11",
            color = Color.Red
        ) {
            // click action goes here
        }
    }
}

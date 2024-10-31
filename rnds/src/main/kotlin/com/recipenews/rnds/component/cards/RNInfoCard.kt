package com.recipenews.rnds.component.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.recipenews.rnds.atoms.type.RNTypography

/**
 *
 * TO act on: get rid of "import androidx.compose.material3.Text" and drop it
 *
 */
@Composable
fun RNInfoCard(title: String, value: String, modifier: Modifier) {
    Box(
        modifier =
        Modifier
            .shadow(12.dp,RoundedCornerShape(15),true)
            .background(Color.White, RoundedCornerShape(15))
            .clip(RoundedCornerShape(30))
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .wrapContentWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = value,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                style = RNTypography.bodyMedium,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = title.uppercase(),
                modifier = Modifier.fillMaxWidth(),
                color = Color.DarkGray,
                style = RNTypography.bodyMedium,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(name = "Recipe News Info card", group = "Information Cards")
@Composable
fun RNInfoCardPreview() {
    Column {
        RNInfoCard(title = "Cook", value = "3", modifier = Modifier)
        Spacer(modifier = Modifier.height(8.dp))
        RNInfoCard(title = "Ready to serve", value = "2", modifier = Modifier)
    }
}

package com.recipenews.rnds.utility

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

enum class LineType {
    STRAIGHT,
    CHECKED,
    DASHED,
    DOTTED,
    CURVED,
    ZIGZAG
}

@Composable
fun RNLine(
    color: Color = Color.Black,
    lineType: LineType = LineType.STRAIGHT
) {
    val lineColor = if (lineType == LineType.CHECKED) Color.Green else color

    Canvas(modifier = Modifier.fillMaxSize()) {
        when (lineType) {
            LineType.STRAIGHT, LineType.CHECKED -> {
                drawLine(
                    color = lineColor,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, size.height),
                    strokeWidth = 4.dp.toPx(),
                )
            }
            LineType.DASHED -> {
                drawLine(
                    color = lineColor,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, size.height),
                    strokeWidth = 2.dp.toPx(),
                    pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f))
                )
            }
            LineType.DOTTED -> {
                drawLine(
                    color = lineColor,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, size.height),
                    strokeWidth = 4.dp.toPx(),
                    pathEffect = PathEffect.dashPathEffect(floatArrayOf(2f, 10f))
                )
            }
            LineType.CURVED -> {
                drawRoundRect(
                    color = lineColor,
                    topLeft = Offset(0f, 0f),
                    size = size,
                    cornerRadius = CornerRadius(50f, 50f),
                    style = Stroke(width = 4.dp.toPx())
                )
            }
            LineType.ZIGZAG -> {
                val path = androidx.compose.ui.graphics.Path().apply {
                    moveTo(0f, 0f)
                    var x = 0f
                    var y = 0f
                    val stepX = size.width / 10
                    val stepY = size.height / 10
                    for (i in 0..10) {
                        x += stepX
                        y = if (i % 2 == 0) stepY else -stepY
                        lineTo(x, y)
                    }
                }
                drawPath(
                    path = path,
                    color = lineColor,
                    style = Stroke(width = 4.dp.toPx())
                )
            }
        }
    }
}
package com.example.testjetpackcompose.components

import android.graphics.drawable.GradientDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testjetpackcompose.ui.theme.shapeButton

@Composable
fun GradientButton(
    onClick: () -> Unit,
    text: String,
    color1: Color,
    color2: Color,
    color3: Color
) {
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        color1,
                        color2,
                        color3
                    )
                ),
                shape = shapeButton.medium
            ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            hoveredElevation = 0.dp

        )

    ) {
        Text(text = text, fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)

    }
}
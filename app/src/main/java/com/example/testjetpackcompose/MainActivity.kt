package com.example.testjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.testjetpackcompose.components.GradientButton
import com.example.testjetpackcompose.ui.theme.TestJetpackComposeTheme
import com.example.testjetpackcompose.ui.theme.light_blue
import com.example.testjetpackcompose.ui.theme.light_red
import com.example.testjetpackcompose.ui.theme.purple

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestJetpackComposeTheme {
                Column() {
                    GradientButton(
                        onClick = {

                        },
                        text = "Click Button",
                        color1 = light_blue,
                        color2 = purple,
                        color3 = light_red
                    )

                    }
                }
            }
        }
}



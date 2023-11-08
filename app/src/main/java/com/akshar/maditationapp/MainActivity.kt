package com.akshar.maditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.akshar.maditationapp.ui.theme.HomeScreen
import com.akshar.maditationapp.ui.theme.MaditationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaditationAppTheme {
                HomeScreen()
            }
        }
    }
}

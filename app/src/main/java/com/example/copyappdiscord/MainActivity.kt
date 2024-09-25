package com.example.copyappdiscord

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.copyappdiscord.navigation.NavHostDesign
import com.example.copyappdiscord.ui.theme.CopyAppDiscordTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            CopyAppDiscordTheme {
                NavHostDesign()
            }
        }
    }
}
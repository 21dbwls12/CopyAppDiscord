package com.example.copyappdiscord

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.copyappdiscord.navigation.NavHostDesign
import com.example.copyappdiscord.ui.theme.CopyAppDiscordTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CopyAppDiscordTheme {
                splashScreen.setKeepOnScreenCondition { true }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHostDesign(innerPadding = innerPadding)
                }
            }
        }
    }
}
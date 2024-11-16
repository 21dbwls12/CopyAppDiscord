package com.example.copyappdiscord

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.copyappdiscord.navigation.NavHostDesign
import com.example.copyappdiscord.ui.theme.CopyAppDiscordTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 액션바 숨기기
        // SplashScreen 때문에 theme을 바꿔서 actionBar가 계속 나타나 있었음
        actionBar?.hide()
        installSplashScreen()
        // 상태바와 네비게이션바까지 배경 사용
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.dark(
                Color.TRANSPARENT
            )
        )
        setContent {
            CopyAppDiscordTheme {
                NavHostDesign()
            }
        }
    }
}
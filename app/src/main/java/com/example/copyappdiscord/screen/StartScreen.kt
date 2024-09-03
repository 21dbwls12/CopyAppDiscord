package com.example.copyappdiscord.screen

import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.copyappdiscord.R
import com.example.copyappdiscord.navigation.NavPath
import java.util.logging.Handler

@Composable
fun StartScreen(navController: NavController, innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            // 0xFF1C1D21 == 어두운 모드 배경색
            .background(Color(0xFF1C1D21)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.discord_icon_blurple),
            contentDescription = "Discord Icon White.png"
        )
    }

//    android.os.Handler(Looper.getMainLooper()).postDelayed({
//        navController.navigate(NavPath.Main.route)
//    },2000)
}
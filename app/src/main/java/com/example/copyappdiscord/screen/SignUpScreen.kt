package com.example.copyappdiscord.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SignUpScreen(navController: NavController) {
    Box(
        modifier = Modifier.background(Color.White).fillMaxSize().padding(10.dp)
    ) {
        SignUpScreenContent(navController)
    }
}

@Composable
fun SignUpScreenContent(navController: NavController) {
    SignUpOrLoginScreenTop(navController) {
        SignUpGuideMessage()
    }
}

@Composable
private fun SignUpGuideMessage() {
    SignUpGuideText("전화번호나 이메일 주소를")
    SignUpGuideText("입력하세요")
}

@Composable
fun SignUpOrLoginScreenTop(navController: NavController, message: @Composable () -> Unit) {
    Column {
        IconButton(
            onClick = { navController.popBackStack() }
        ) {
            Icon(
                Icons.AutoMirrored.Default.ArrowBack,
                contentDescription = "뒤로 가기",
                tint = Color(0xFF595959)
            )
        }
        SignUpGuideMessage()
    }
}

@Composable
private fun SignUpGuideText(message: String) {
    Text(text = message, textAlign = TextAlign.Center, fontWeight = FontWeight.W800, color = Color.Black, modifier = Modifier.fillMaxWidth())
}
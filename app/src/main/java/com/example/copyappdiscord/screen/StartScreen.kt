package com.example.copyappdiscord.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.copyappdiscord.R
import com.example.copyappdiscord.ui.theme.discordFont

@Composable
fun StartScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        StartScreenBG()
        StartScreenContent()
    }
}

@Composable
fun StartScreenBG() {
    Image(
        painter = painterResource(id = R.drawable.nightsky),
        contentDescription = "Background of start screen",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun StartScreenContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.discord_icon_white),
            contentDescription = "Discord Icon",
            modifier = Modifier.size(90.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        WelcomeHeadText()
    }
}

@Composable
private fun WelcomeHeadText() {
    Text(
        // 한 텍스트에 스타일을 다르게 입히기 위해 사용
        buildAnnotatedString {
            CustomStyledText(text = "DISCORD", style = welcomeHeadDiscordSpanStyle())
            CustomStyledText(text = "에 오신 걸 환영합니다", style = welcomeHeadRestSpanStyle())
        },
        lineHeight = 38.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
    )
}

@Composable
private fun welcomeHeadDiscordSpanStyle(): SpanStyle {
    return SpanStyle(
        color = Color.White,
        fontSize = 44.sp,
        fontWeight = FontWeight.W900,
        fontFamily = discordFont,
        letterSpacing = 1.sp
    )
}

@Composable
private fun welcomeHeadRestSpanStyle(): SpanStyle {
    return SpanStyle(
        color = Color.White,
        fontSize = 33.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    )
}

@Composable
private fun AnnotatedString.Builder.CustomStyledText(text: String, style: SpanStyle) {
    withStyle(style) {
        append(text)
    }
}

@Composable
fun WelcomeBodyText(text: String, fontWeight: Int) {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        color = Color.White,
        fontSize = 35.sp,
        fontWeight = FontWeight(fontWeight),
        letterSpacing = 0.2.sp,
        textAlign = TextAlign.Center,
        lineHeight = 38.sp
    )
}
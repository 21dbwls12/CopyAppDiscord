package com.example.copyappdiscord.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
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
        StartScreenContentTop()
        StartScreenContentBottom()
    }
}

@Composable
private fun StartScreenBG() {
    Image(
        painter = painterResource(id = R.drawable.nightsky),
        contentDescription = "Background of start screen",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
private fun StartScreenContentTop() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f)
            .padding(15.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.discord_icon_white),
            contentDescription = "Discord Icon",
            modifier = Modifier.size(90.dp)
        )
        WelcomeHeadText()
        WelcomeBodyText(text = "어울리고, 게임하고, 가볍게 대화하세요.")
        WelcomeBodyText(text = "아래를 탭해 시작해요!")
    }
}

@Composable
private fun StartScreenContentBottom() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .padding(vertical = 30.dp, horizontal = 50.dp)
    ) {
        StartButton(text = "가입하기", isSignUp = true) {

        }
        StartButton(text = "로그인", isSignUp = false) {

        }
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
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            lineHeight = 2.6.em,
            platformStyle = PlatformTextStyle(includeFontPadding = false),
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.Both
            )
        )
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
        letterSpacing = 0.2.sp,
    )
}

@Composable
private fun AnnotatedString.Builder.CustomStyledText(text: String, style: SpanStyle) {
    withStyle(style) {
        append(text)
    }
}

@Composable
private fun WelcomeBodyText(text: String) {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        color = Color.White,
        fontSize = 17.sp,
        letterSpacing = 0.2.sp,
        textAlign = TextAlign.Center,
        lineHeight = 16.sp
    )
}

@Composable
private fun StartButton(text: String, isSignUp: Boolean, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(if (isSignUp) Color.White else Color(0xFF161CBB))
    ) {
        Text(text = text, color = if (isSignUp) Color.Black else Color.White, fontWeight = FontWeight.Bold, fontSize = 15.sp, modifier = Modifier.padding(vertical = 5.dp))
    }
}
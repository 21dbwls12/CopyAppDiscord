package com.example.copyappdiscord.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.copyappdiscord.R

val discordFont = FontFamily(
    Font(R.font.kanit_thin, FontWeight.W100, FontStyle.Normal),
    Font(R.font.kanit_extralight, FontWeight.W200, FontStyle.Normal),
    Font(R.font.kanit_light, FontWeight.W300, FontStyle.Normal),
    Font(R.font.kanit_regular, FontWeight.W400, FontStyle.Normal),
    Font(R.font.kanit_medium, FontWeight.W500, FontStyle.Normal),
    Font(R.font.kanit_semibold, FontWeight.W600, FontStyle.Normal),
    Font(R.font.kanit_bold, FontWeight.W700, FontStyle.Normal),
    Font(R.font.kanit_extrabold, FontWeight.W800, FontStyle.Normal),
    Font(R.font.kanit_black, FontWeight.W900, FontStyle.Normal),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = discordFont,
        fontWeight = FontWeight.W900,
        fontSize = 35.sp,
        lineHeight = 38.sp,
        letterSpacing = 0.2.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
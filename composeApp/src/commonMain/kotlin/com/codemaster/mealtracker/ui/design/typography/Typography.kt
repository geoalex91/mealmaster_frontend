package com.codemaster.mealtracker.ui.design.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import myapplication.composeapp.generated.resources.Grandstander_Bold
import myapplication.composeapp.generated.resources.Inter_18pt_Medium
import myapplication.composeapp.generated.resources.Inter_18pt_Regular
import myapplication.composeapp.generated.resources.Res

val Grandstander @Composable get() = FontFamily(
    org.jetbrains.compose.resources.Font(resource = Res.font.Grandstander_Bold, weight = FontWeight.Bold)

)

val Inter @Composable get() = FontFamily(
    org.jetbrains.compose.resources.Font(
        resource = Res.font.Inter_18pt_Regular, weight = FontWeight.Normal),
        org.jetbrains.compose.resources.Font(
            resource = Res.font.Inter_18pt_Medium, weight = FontWeight.Medium)
)

val Typography @Composable get() = Typography(
    bodyLarge = TextStyle(
        fontFamily =Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 24.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily =Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp,
    ),
    bodySmall = TextStyle(
        fontFamily =Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 20.sp,
    ),
    titleLarge = TextStyle(
        fontFamily =Grandstander,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 36.sp,
    ),
    titleSmall = TextStyle(
        fontFamily =Grandstander,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 24.sp,
    ),
)
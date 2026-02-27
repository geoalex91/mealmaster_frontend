package com.codemaster.mealtracker.ui.design.color

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val mainThemeColorLightScheme = lightColorScheme(
    primary = Color(0x2C52C7),
    onPrimary = Color(0xffffff),
    primaryContainer = Color(0xa6ce1),
    onPrimaryContainer = Color(0xfffbff),
    secondary = Color(0x515c8a),
    onSecondary = Color(0xffffff),
    secondaryContainer = Color(0xbfcafe),
    onSecondaryContainer = Color(0x495481),
    tertiary = Color(0x903498),
    onTertiary = Color(0xffffff),
    error = Color(0xba1a1a),
    onError = Color(0xffffff),
    surface = Color(0xfaf8ff),
    onSurface = Color(0x1a1b22),
    surfaceDim = Color(0xdad9e3),
    outline = Color(0x747685),
    outlineVariant = Color(0xc4c5d6)
)

val mainThemeColorDarkScheme = lightColorScheme(
    primary = Color(0xb6c4ff), //buttons important things
    onPrimary = Color(0x002780), //text on buttons
    primaryContainer = Color(0x6889ff),
    onPrimaryContainer = Color(0x002171),
    secondary = Color(0xb9c4f8), //toggle buttons, filter
    onSecondary = Color(0x222e58),
    secondaryContainer = Color(0x394470),
    onSecondaryContainer = Color(0xa8b3e5),
    tertiary = Color(0xffa9fd) ,//cards, special ui
    onTertiary = Color(0x590061),
    error = Color(0xffb4ab),
    onError = Color(0x690005),
    surface = Color(0x12131a),
    onSurface = Color(0xe2e1ec), //background
    surfaceDim = Color(0x12131a),
    outline = Color(0x8e909f),
    outlineVariant = Color(0x444653)
)
package com.codemaster.mealtracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.tahadeta.coffeeshopkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

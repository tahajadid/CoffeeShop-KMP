package org.example.coffeeshopkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
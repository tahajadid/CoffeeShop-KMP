package com.tahadeta.coffeeshopkmp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.tahadeta.coffeeshopkmp.Screen.LoginScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Suppress("ktlint:standard:function-naming")
@Composable
@Preview
fun App() {
    MaterialTheme {
        LoginScreen()
    }
}

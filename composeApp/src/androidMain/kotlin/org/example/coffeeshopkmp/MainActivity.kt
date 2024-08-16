package org.example.coffeeshopkmp

import android.R
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : ComponentActivity() {

    private var keep = true
    private val DELAY = 1250

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val splashScreen: SplashScreen =  installSplashScreen()

        //Keep returning false to Should Keep On Screen until ready to begin.
        splashScreen.setKeepVisibleCondition{keep}

        val handler = Handler()
        handler.postDelayed({ keep = false }, DELAY.toLong())

        // installSplashScreen()
        setContent {
            App()
        }
    }


    /**Will cause a second process to run on the main thread */
    private val runner = Runnable { keep = false }
}


@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
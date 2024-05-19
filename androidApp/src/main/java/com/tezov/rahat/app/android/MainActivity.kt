package com.tezov.rahat.app.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tezov.rahat.HelloWorld

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView()
                }
            }
        }
    }
}

@Composable
fun GreetingView() {
    Text(text = HelloWorld.value)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView()
    }
}

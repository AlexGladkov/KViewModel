package io.github.alexgladkov.kviewmodel.example

import io.github.alexgladkov.kviewmodel.example.compose.test.TestScreen
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestScreen()
        }
    }
}

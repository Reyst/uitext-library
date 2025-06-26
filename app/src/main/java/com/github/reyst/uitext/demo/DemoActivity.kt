package com.github.reyst.uitext.demo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.reyst.uitext.asString
import com.github.reyst.uitext.ui.theme.UITextLibraryTheme

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewModel by viewModels<DemoViewModel>()

        val resolvedName = viewModel.name.asString(this)
        val resolvedAppName = viewModel.appName.asString(this)

        Log.d("DemoActivity", "\nviewModel\n\t - name: $resolvedName\n\t - appName: $resolvedAppName")

        setContent {
            UITextLibraryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = viewModel.name.asString(),
                        appName = viewModel.appName.asString(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    appName: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = spacedBy(16.dp),
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = appName,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UITextLibraryTheme {
        Greeting(
            "Android",
            appName = "App name",
        )
    }
}


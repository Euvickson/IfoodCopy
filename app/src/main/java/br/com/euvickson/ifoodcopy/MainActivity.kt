package br.com.euvickson.ifoodcopy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.euvickson.ifoodcopy.model.Icon
import br.com.euvickson.ifoodcopy.ui.components.TabBar
import br.com.euvickson.ifoodcopy.ui.screens.StartScreen
import br.com.euvickson.ifoodcopy.ui.theme.IfoodCopyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    IfoodCopyTheme {
        Surface {
            StartScreen()
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}

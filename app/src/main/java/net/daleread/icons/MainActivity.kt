package net.daleread.icons

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import net.daleread.data.IconDisplay
import net.daleread.icons.ui.theme.IconsTheme

const val TAG = "Main Activity"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // val inv : Inventory =

        super.onCreate(savedInstanceState)
        setContent {
            IconsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(modifier = Modifier)
                    {
                        Log.d(TAG, "$it")
                        IconDisplay()
                    }
                }
            }
        }
    }
}   // end MainActivity

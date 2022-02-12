package com.elsawy.practice.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elsawy.practice.basicnavigation.ui.theme.BasicNavigationTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         BasicNavigationTheme {
            // A surface container using the 'background' color from the theme
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
               SetupNavigation()
            }
         }
      }
   }
}

@Composable
fun SetupNavigation() {
   val navController = rememberNavController()
   NavHost(navController = navController, startDestination = "home") {
      composable("home") { Home(navController = navController) }
      composable("detail/{name}") { backStackEntry ->
         Detail(navController = navController, backStackEntry.arguments?.getString("name") ?: "no name")
      }
   }
}


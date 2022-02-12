package com.elsawy.practice.basicnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.elsawy.practice.basicnavigation.ui.theme.BasicNavigationTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun Home(navController: NavController) {
   BasicNavigationTheme {
      // A surface container using the 'background' color from the theme
      Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
         Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            var name by remember { mutableStateOf("") }

            OutlinedTextField(
               value = name,
               onValueChange = { name = it },
               label = { Text("Name", fontSize = 20.sp) },
               textStyle = TextStyle (fontSize = 25.sp),
               modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier
               .height(30.dp)
               .fillMaxWidth())

            Button(onClick = { navController.navigate("detail/$name") }) {
               Text(text = "Enter", fontSize = 25.sp)
            }
         }
      }
   }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
   BasicNavigationTheme {
      Home(rememberNavController())
   }
}
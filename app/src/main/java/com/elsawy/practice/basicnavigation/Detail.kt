package com.elsawy.practice.basicnavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.elsawy.practice.basicnavigation.ui.theme.BasicNavigationTheme

@Composable
fun Detail(navController: NavController, name: String) {
   BasicNavigationTheme {
      // A surface container using the 'background' color from the theme
      Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
         Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(text = "Welcome $name", modifier = Modifier, fontSize = 30.sp)

            Spacer(modifier = Modifier
               .height(30.dp)
               .fillMaxWidth())

            Button(onClick = { navController.popBackStack() }) {
               Text(text = "Exit", fontSize = 30.sp)
            }
         }
      }
   }
}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
   BasicNavigationTheme {
      Detail(rememberNavController(),"")
   }
}
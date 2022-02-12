package com.elsawy.practice.basicnavigation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
   primary = Purple200,
   primaryVariant = Purple700,
   secondary = Teal200
)

private val LightColorPalette = lightColors(
   primary = Purple500,
   primaryVariant = Purple700,
   secondary = Teal200

   /* Other defau def nav_version = "2.4.1"

    implementation("androidx.navigation:navigation-compose:$nav_version")
lt colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun BasicNavigationTheme(
   darkTheme: Boolean = isSystemInDarkTheme(),
   content: @Composable () -> Unit
) {
   val colors = if (darkTheme) {
      DarkColorPalette
   } else {
      LightColorPalette
   }

   MaterialTheme(
      colors = colors,
      typography = Typography,
      shapes = Shapes,
      content = content
   )
}
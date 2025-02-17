package com.example.myapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold)
)
val PlayDisplay = FontFamily(
    Font(R.font.playfair_display_bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
   displayLarge = TextStyle(
       fontFamily = PlayDisplay,
       fontWeight =  FontWeight.Normal,
       fontSize = 50.sp
   ),
    displayMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight =  FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight =  FontWeight.Bold,
        fontSize = 15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Montserrat,
        fontWeight =  FontWeight.Normal,
        fontSize = 15.sp
    )

)
package com.example.majoore

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PhotoPage(onNavigateToCard4: () -> Unit){
    Text(text = "The Photo PAGE")
    BottomAppBarExample()
}
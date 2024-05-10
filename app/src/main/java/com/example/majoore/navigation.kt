package com.example.majoore

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Cards",

        ){

        composable("cards", enterTransition = null, exitTransition = null){
            Card1(onNavigateToStoryPage = {navController.navigate("StoryPage")})
            Card2 { navController.navigate("VideoPage") }
            Card3(onNavigateToPostPage = {navController.navigate("PostPage")} )
            Card4 { navController.navigate("PhotoPage") }

        }
        composable("StoryPage", enterTransition = null, exitTransition = null){
            StoryPage (onNavigateToCard1 = { navController.navigate("Card1") })
        }


        composable("VideoPage", enterTransition = null, exitTransition = null){
            VideoPage (onNavigateToCard2 = { navController.navigate("Card2") })
        }

        composable("PostPage", enterTransition = null, exitTransition = null){
            PostPage (onNavigateToCard3 = { navController.navigate("Card3") })
        }


        composable("PhotoPage", enterTransition = null, exitTransition = null){
            PhotoPage (onNavigateToCard4 = { navController.navigate("Card4") })

        }
    }
    BottomAppBarExample()

}



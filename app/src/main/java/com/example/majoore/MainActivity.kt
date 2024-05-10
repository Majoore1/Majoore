package com.example.majoore

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.majoore.ui.theme.MajooreTheme
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MajooreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Drawer()



                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Card1(onNavigateToStoryPage: () -> Unit) {
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val fontName = GoogleFont("Lobster Two")

    val fontFamily = FontFamily(
        Font(googleFont = fontName, fontProvider = provider)
    )
    BottomAppBarExample()
    Text(
        text = "Your Social\nManager",
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = 30.sp,
        color = Color.DarkGray,
        textAlign = TextAlign.Center,
        letterSpacing = 2.sp,
        lineHeight = 35.sp,
        modifier = Modifier
            .fillMaxWidth() // Ensures text fills the available width
            .padding(horizontal = 16.dp, vertical = 24.dp) // Add margins

    )



    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = Dp(220f)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {

        Card(
            onClick = onNavigateToStoryPage,
            colors = CardDefaults.cardColors( // Use CardDefaults for Material Design colors
                containerColor = Color.LightGray, // Set the container color
                contentColor = Color.Black // Set the content color (optional)
            ),
            modifier = Modifier
                .height(89.dp)
                .width(320.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Text(
                    text = "Story",
                    modifier = Modifier
                        .padding(27.dp) // Add padding to the text
                        .weight(1f), // Occupy remaining space in the row
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    textAlign = TextAlign.Left // Center text horizontally
                )
                Image(
                    painter = painterResource(id = R.drawable.story_icon),
                    contentDescription = "story",
                    modifier = Modifier.padding(19.dp)
                )
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Card2(onNavigateToVideoPage: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = Dp(340f)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Card(
            onClick = onNavigateToVideoPage,
            colors = CardDefaults.cardColors( // Use CardDefaults for Material Design colors
                containerColor = Color.LightGray, // Set the container color
                contentColor = Color.Black // Set the content color (optional)
            ),
            modifier = Modifier
                .height(89.dp)
                .width(320.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Text(
                    text = "Video",
                    modifier = Modifier
                        .padding(27.dp) // Add padding to the text
                        .weight(1f), // Occupy remaining space in the row
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    textAlign = TextAlign.Left // Center text horizontally
                )
                Image(
                    painter = painterResource(id = R.drawable.reel_icon),
                    contentDescription = "story",
                    modifier = Modifier.padding(19.dp)

                )
            }
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Card3(onNavigateToPostPage: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = Dp(460f)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Card(
            onClick = onNavigateToPostPage,
            colors = CardDefaults.cardColors( // Use CardDefaults for Material Design colors
                containerColor = Color.LightGray, // Set the container color
                contentColor = Color.Black // Set the content color (optional)
            ),
            modifier = Modifier
                .height(89.dp)
                .width(320.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Text(
                    text = "Post",
                    modifier = Modifier
                        .padding(27.dp) // Add padding to the text
                        .weight(1f), // Occupy remaining space in the row
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    textAlign = TextAlign.Left // Center text horizontally
                )
                Image(
                    painter = painterResource(id = R.drawable.post_icon),
                    contentDescription = "story",
                    modifier = Modifier.padding(19.dp)

                )
            }
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Card4(onNavigateToPhotoPage: () -> Unit) {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .offset(y = Dp(580f)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Card(
            onClick = onNavigateToPhotoPage,
            colors = CardDefaults.cardColors( // Use CardDefaults for Material Design colors
                containerColor = Color.LightGray, // Set the container color
                contentColor = Color.Black // Set the content color (optional)
            ),
            modifier = Modifier
                .height(89.dp)
                .width(320.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Text(
                    text = "Photo",
                    modifier = Modifier
                        .padding(27.dp) // Add padding to the text
                        .weight(1f), // Occupy remaining space in the row
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    textAlign = TextAlign.Left // Center text horizontally
                )
                Image(
                    painter = painterResource(id = R.drawable.photo_icon),
                    contentDescription = "story",
                    modifier = Modifier.padding(19.dp)

                )
            }
        }

    }
}








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MajooreTheme {
        val navController = rememberNavController()
        Card1(onNavigateToStoryPage = { navController.navigate("StoryPage") })
        Card2(onNavigateToVideoPage = { navController.navigate("VideoPage") })
        Card3(onNavigateToPostPage = { navController.navigate("PostPage") })
        Card4(onNavigateToPhotoPage = { navController.navigate("PhotoPage") })

    }
}



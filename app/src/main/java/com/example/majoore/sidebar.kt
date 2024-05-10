package com.example.majoore


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@Composable
fun contactUsCard() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 100.dp)
    ) {
        Text(
            text = "Contact Us At:",
            modifier = Modifier
                .align(Alignment.Start)
                .padding(8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "majoore.co@gmail.com",
            modifier = Modifier.padding(14.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Drawer() {
    var navController = rememberNavController()
    rememberNavController()

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {


                    Column(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Card {
                            Text(
                                text = "Majoore",
                                color = Color.Black,
                                fontSize = 38.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(38.dp, 13.dp),
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        Divider(
                            color = Color.LightGray,
                            thickness = 1.8.dp,
                            modifier = Modifier.width(263.dp)
                                .shadow(elevation = 3.dp, shape = CircleShape, clip = false)
                        )

                        Spacer(modifier = Modifier.height(43.dp))

                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color.LightGray,
                                contentColor = Color.Black
                            ),
                            modifier = Modifier
                                .height(55.dp)
                                .width(250.dp)
                        ) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                Text(
                                    text = "Login to Your Socials",
                                    modifier = Modifier.padding(12.dp).offset(y = Dp(3f), x = Dp(25f)),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(23.dp))

                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            OutlinedButton(
                                onClick = { },
                                modifier = Modifier
                                    .padding(16.dp)
                                    .height(50.dp)
                                    .width(216.dp),
                                elevation = ButtonDefaults.elevatedButtonElevation(
                                    defaultElevation = 63.dp,
                                    pressedElevation = 15.dp,
                                    disabledElevation = 0.dp
                                )
                            ) {
                                Text(text = "Instagram              ")
                                Icon(Icons.Filled.AddCircle, contentDescription = "")
                            }

                            Spacer(modifier = Modifier.height(0.dp))

                            OutlinedButton(
                                onClick = { },
                                modifier = Modifier
                                    .padding(16.dp)
                                    .height(50.dp)
                                    .width(216.dp),
                                elevation = ButtonDefaults.elevatedButtonElevation(
                                    defaultElevation = 63.dp,
                                    pressedElevation = 15.dp,
                                    disabledElevation = 0.dp
                                )
                            ) {
                                Text(text = "FaceBook              ")
                                Icon(Icons.Filled.AddCircle, contentDescription = "")
                            }

                            Spacer(modifier = Modifier.height(0.dp))

                            OutlinedButton(
                                onClick = { },
                                modifier = Modifier
                                    .padding(16.dp)
                                    .height(50.dp)
                                    .width(216.dp),
                                elevation = ButtonDefaults.elevatedButtonElevation(
                                    defaultElevation = 63.dp,
                                    pressedElevation = 15.dp,
                                    disabledElevation = 0.dp
                                )
                            ) {
                                Text(text = "Linkedin              ")
                                Icon(Icons.Filled.AddCircle, contentDescription = "")
                            }

                            Spacer(modifier = Modifier.height(0.dp))

                            OutlinedButton(
                                onClick = { },
                                modifier = Modifier
                                    .padding(16.dp)
                                    .height(50.dp)
                                    .width(216.dp),
                                elevation = ButtonDefaults.elevatedButtonElevation(
                                    defaultElevation = 63.dp,
                                    pressedElevation = 15.dp,
                                    disabledElevation = 0.dp
                                )
                            ) {
                                Text(text = "Twitter              ")
                                Icon(Icons.Filled.AddCircle, contentDescription = "")
                            }

                            Spacer(modifier = Modifier.height(23.dp))

                            Divider(
                                color = Color.LightGray,
                                thickness = 1.8.dp,
                                modifier = Modifier.width(263.dp)
                                    .shadow(elevation = 3.dp, shape = CircleShape, clip = false)
                            )

                        }

                        Spacer(modifier = Modifier.height(43.dp))

                        contactUsCard()
                    }

            }
        }
    ) {
        Scaffold(
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    text = { Text("") },
                    icon = { Icon(Icons.Outlined.Menu, contentDescription = "") },
                    onClick = {
                        scope.launch {
                            drawerState.apply {
                                if (isClosed) open() else close()
                            }
                        }
                    },
                    modifier = Modifier
                        .offset(x = (-275).dp, y = (-679).dp)
                        .size(59.dp, 40.dp)
                )

            }

        ) { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {

                Navigation()

                // Screen content...
            }
        }
    }
}

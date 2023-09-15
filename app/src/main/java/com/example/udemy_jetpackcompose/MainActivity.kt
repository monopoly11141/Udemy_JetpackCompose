package com.example.udemy_jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplaySnackbar()
//            Column(
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.fillMaxSize()
//            ) {
//                ButtonExample1()
//            }


        }
    }
}

//@Composable
//fun BoxExample1() {
//    Box(
//        modifier = Modifier
//            .background(color = Color.Green)
//            .size(180.dp, 300.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .size(125.dp, 100.dp)
//                .align(Alignment.TopEnd)
//        ) {
//
//        }
//
//        Text(
//            text = "Hi",
//            style = MaterialTheme.typography.bodyMedium,
//            modifier = Modifier
//                .background(color = Color.White)
//                .size(90.dp, 50.dp)
//                .align(Alignment.BottomCenter)
//        )
//    }
//}
//
//@Composable
//fun BoxExample2() {
//    Box(
//        modifier = Modifier
//            .background(color = Color.LightGray)
//            .fillMaxSize()
//    ) {
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.TopStart),
//            text = "Top start"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.TopCenter),
//            text = "Top center"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.TopEnd),
//            text = "Top end"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.CenterStart),
//            text = "Center start"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.Center),
//            text = "Center"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.CenterEnd),
//            text = "Center end"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.BottomStart),
//            text = "Bottom start"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.BottomCenter),
//            text = "Bottom center"
//        )
//        Text(
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier
//                .background(color = Color.Yellow)
//                .align(Alignment.BottomEnd),
//            text = "Bottom End"
//        )
//    }
//}
//
//@Composable
//fun BoxExample3() {
//    Box(
//
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.beach_resort),
//            contentDescription = "beach resort",
//            modifier = Modifier
//                .size(300.dp, 240.dp)
//        )
//        Text(
//            text = "Beach resort",
//            style = MaterialTheme.typography.displaySmall,
//            color = Color.Black,
//            modifier = Modifier
//                .align(Alignment.BottomStart)
//        )
//        Button(
//            onClick = {},
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.White,
//                contentColor = Color.DarkGray
//            ),
//            modifier = Modifier
//                .align(Alignment.TopEnd)
//                .padding(10.dp)
//                .border(5.dp, Color.DarkGray, RectangleShape)
//        ) {
//            Text("Add to Cart")
//
//        }
//    }
//}

//@Composable
//fun ButtonExample1() {
//    val context = LocalContext.current
//    Button(
//        onClick = {
//            Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
//        }
//    ) {
//        Text("Add to Cart")
//    }
//
//    Button(
//        onClick = {
//            Toast.makeText(context, "Clicked on Button 1", Toast.LENGTH_SHORT).show()
//        },
//        enabled = false
//    ) {
//        Text("Add to Cart")
//    }
//
//    TextButton(
//        onClick = {
//            Toast.makeText(context, "Clicked on TextButton", Toast.LENGTH_SHORT).show()
//        }
//    ) {
//        Text("Add to Cart")
//    }
//
//    OutlinedButton(
//        onClick = {
//            Toast.makeText(context, "Clicked on Outlined Button", Toast.LENGTH_SHORT).show()
//        }
//    ) {
//        Text("Add to Cart")
//    }
//
//    IconButton(
//        onClick = {
//            Toast.makeText(context, "Clicked on Icon Button", Toast.LENGTH_SHORT).show()
//        }
//    ) {
//        Icon(
//            Icons.Filled.Refresh,
//            contentDescription = "refresh",
//            tint = Color.Red
//        )
//    }
//
//    Button(
//        onClick = {
//            Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
//        },
//        contentPadding = PaddingValues(10.dp),
//        border = BorderStroke(10.dp, Color.Black),
//        colors = ButtonDefaults.textButtonColors(
//            containerColor = Color.DarkGray,
//            contentColor = Color.White
//        )
//    ) {
//        Text(
//            "Add to Cart",
//            style = MaterialTheme.typography.headlineMedium,
//            modifier = Modifier
//                .padding(5.dp)
//        )
//
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DisplaySnackbar() {
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        content = {
            Column(modifier = Modifier.padding(it)) {
            }
            Button(
                onClick = {
                    coroutineScope.launch {
                        val snackbarResult = snackbarHostState.showSnackbar(
                            message = "This is the message",
                            actionLabel = "Click me",
                            duration = SnackbarDuration.Indefinite
                        )
                        when (snackbarResult) {
                            SnackbarResult.ActionPerformed -> Log.i("MYTAG", "action label clicked")
                            SnackbarResult.Dismissed -> Log.i("MYTAG", "dismissed snackbar")
                        }
                    }
                })
            {
                Text(text = "Display Snackbar")
            }
        }
    )
}
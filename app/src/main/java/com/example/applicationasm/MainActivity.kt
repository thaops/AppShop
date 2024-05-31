package com.example.applicationasm

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationasm.ui.theme.ApplicationASMTheme



@Composable
fun Main(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
        // Display background image
        Image(
            painter = painterResource(id = R.drawable.backgrou), // Ensure the image is available in drawable
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // Ensures the image covers the entire area
        )

        // Overlay content
        Column(
            modifier = Modifier
                .fillMaxSize()
                ,
            verticalArrangement = Arrangement.Center

        ) {
            Column(modifier = Modifier
                .padding(start = 30.dp)
                ) {
                Text(
                    text = "MAKE YOUR",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
                Text(
                    text = "HOME BEAUTIFUL",
                    fontSize = 30.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }


            Column(modifier = Modifier
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                ) {
                Text(
                    text = "The best simple place where \nyou discover most wonderful furnitures and make your home beautiful",
                    fontSize = 17.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally),
                    color = Color.Gray,
                    style = LocalTextStyle.current.copy(letterSpacing = 1.sp, lineHeight = 30.sp)

                )

            }
            Column(modifier = Modifier
                .fillMaxWidth()) {
                Button(onClick = { navController.navigate("login") }, modifier = Modifier
                    .padding(top = 200.dp)
                    .width(159.dp)
                    .height(54.dp)
                    .align(Alignment.CenterHorizontally)
                    ,
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)

                ) {
                    Text(text = "Get Started",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600)
                    )
                }
            }

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHi() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        Main(navController)
    }
}
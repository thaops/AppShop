package com.example.applicationasm.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationasm.ui.theme.ApplicationASMTheme
import com.example.applicationasm.R

@Composable
fun Congrats(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "SUCCESS!",
            fontSize = 36.sp,
            fontWeight = FontWeight(700),
            fontFamily = FontFamily.Serif,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Box(modifier = Modifier
            .width(300.dp)
            .height(270.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.bacgroubuy), contentDescription = null,
                modifier = Modifier
                    .width(270.dp)
                    .height(230.dp),
                colorFilter = ColorFilter.tint(Color.LightGray)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logobuy),
                    contentDescription = null,
                    modifier = Modifier
                        .width(213.dp)
                        .height(180.dp)
                        .padding(bottom = 5.dp),
                    colorFilter = ColorFilter.tint(Color.Black),
                    contentScale = ContentScale.Fit
                )
                Image(
                    painter = painterResource(id = R.drawable.iconcheck),
                    contentDescription = null,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Your order will be delivered soon.\n" +
                    "Thank you for choosing our app!",
            fontSize = 18.sp,
            color = Color.Gray,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.End
        )
        Column(modifier = Modifier
            .padding(30.dp)) {

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Track your orders",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500)
            }

            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),

                colors = ButtonDefaults.buttonColors(containerColor = Color.White)

            ) {
                Text(text = "BACK TO HOME",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500,
                    color = Color.Black)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewCongrats() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        Congrats(navController)
    }
}

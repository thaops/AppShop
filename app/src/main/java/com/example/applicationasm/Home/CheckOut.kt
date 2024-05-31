package com.example.applicationasm.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import com.example.applicationasm.R
import com.example.applicationasm.ui.theme.ApplicationASMTheme

@Composable
fun CheckOut(navController: NavController) {
    Column(modifier = Modifier
        .padding(30.dp)
        .fillMaxSize()) {
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier
                .padding()
                .fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(id = R.drawable.backcart),
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 2.dp, end = 25.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Check out",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Shipping Address",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,)

                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(127.dp)
                    .shadow(1.dp, RoundedCornerShape(8.dp)) // Thin shadow
                    .background(color = Color.White, shape = RoundedCornerShape(8.dp))
            ) {
                Column {
                    Text(text = "Bruno Fernandes",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier.padding(10.dp))
                    Spacer(modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = Color.LightGray))
                    Text(text = "25 rue Robert Latouche, Nice, 06200, Côte D’azur, France",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray,
                        modifier = Modifier.padding(10.dp, top = 20.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Payment",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,)

                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(68.dp)
                    .shadow(1.dp, RoundedCornerShape(8.dp)) // Thin shadow
                    .background(color = Color.White)
                    .clip(RoundedCornerShape(10.dp))
                    .padding(10.dp)) {
                Row(modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()) {

                    Column(modifier = Modifier
                        .padding(start = 20.dp, end = 10.dp)
                        .width(68.dp)
                        .height(38.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Color.Gray)) {
                        Image(
                            painter = painterResource(id = R.drawable.payment),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                                .width(32.dp)
                                .height(25.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Text(text = "**** **** **** 3947",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(10.dp, top = 2.dp,)
                            .align(Alignment.CenterVertically))
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Delivery method",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,)

                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(68.dp)
                .shadow(1.dp, RoundedCornerShape(8.dp)) // Thin shadow
                .background(color = Color.White)
                .clip(RoundedCornerShape(10.dp))) {
                Row(modifier = Modifier
                    .padding(top = 15.dp)
                    .fillMaxWidth()) {

                    Column(modifier = Modifier
                        .padding(start = 20.dp, end = 10.dp, top = 10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.logomethod),
                            contentDescription = null,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .width(90.dp)
                                .height(25.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Text(text = "Fast (2-3days)",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(10.dp)
                            .align(Alignment.CenterVertically))
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(135.dp)
            .shadow(1.dp, RoundedCornerShape(10.dp))
            .background(color = Color.White),
            verticalArrangement = Arrangement.Center) {
            Column(modifier = Modifier
                .padding(20.dp)) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(text = "Order: ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                    Text(text = "$ 95.00",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(text = "Delivery: ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                    Text(text = "$ 95.00",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(text = "Total: ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                    Text(text = "$ 95.00",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterVertically))
                }
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = { navController.navigate("congrats") },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "SUBMIT ORDER",
                fontSize = 20.sp,
                fontWeight = FontWeight.W500)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        CheckOut(navController)
    }
}

@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.applicationasm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationasm.ui.theme.ApplicationASMTheme


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SignUp(navController: NavController){
Column(modifier = Modifier.fillMaxSize()) {
    Column(modifier = Modifier.height(60.dp)) {
    }
    Row (horizontalArrangement = Arrangement.SpaceBetween){
        Column(modifier = Modifier
            .padding(30.dp)
            .height(2.dp)
            .width(110.dp)
            .background(color = Color.Gray)) {

        }
        Image(painter = painterResource(id = R.drawable.group), contentDescription = null,
            modifier = Modifier
                .height(63.dp)
                .width(63.dp)
                .background(color = Color.White)
            ,
            contentScale = ContentScale.Crop)

        Column(modifier = Modifier
            .padding(30.dp)
            .height(2.dp)
            .width(110.dp)
            .background(color = Color.Gray)) {

        }
    }

    Column (modifier = Modifier.padding(20.dp)){

        Text(text = "WELCOME !",
            fontSize = 30.sp,
            fontWeight = FontWeight(600),
            fontFamily = FontFamily.Serif,
            color = Color.Black
        )



    }

    Column(modifier = Modifier
        .padding(end = 30.dp, bottom = 0.dp)
        .fillMaxWidth()

        .shadow(8.dp, RoundedCornerShape(8.dp))
        .clip(RoundedCornerShape(8.dp))
        .background(color = Color.White)) {

        Column(modifier = Modifier
            .padding(30.dp, top = 10.dp)) {
            Column (modifier = Modifier.padding(top = 20.dp)){
                Text(text = "Name",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Gray
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White // Đổi màu nền thành màu đỏ
                    )
                )
            }

            Column (modifier = Modifier.padding(top = 30.dp)){
                Text(text = "Email",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Gray
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White // Đổi màu nền thành màu đỏ
                    )
                )
            }

            Column (modifier = Modifier.padding(top = 30.dp)){
                Text(text = "Password",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Gray
                )

                Box (modifier = Modifier
                    .fillMaxWidth(),
                ){
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White // Đổi màu nền thành màu trắng
                        ),
                    )

                    Image(
                        painter = painterResource(id = R.drawable.eye), contentDescription = null,
                        modifier = Modifier
                            .padding(bottom = 20.dp, end = 20.dp)
                            .height(20.dp)
                            .width(20.dp)
                            .align(Alignment.BottomEnd)
                            .background(color = Color.White),
                        contentScale = ContentScale.Crop
                    )
                }
            }


            Column (modifier = Modifier.padding(top = 30.dp)){
                Text(text = "Confirm Password",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Gray
                )
                Box (modifier = Modifier
                    .fillMaxWidth(),
                ){
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White // Đổi màu nền thành màu trắng
                        ),
                    )

                    Image(
                        painter = painterResource(id = R.drawable.eye), contentDescription = null,
                        modifier = Modifier
                            .padding(bottom = 20.dp, end = 20.dp)
                            .height(20.dp)
                            .width(20.dp)
                            .align(Alignment.BottomEnd)
                            .background(color = Color.White),
                        contentScale = ContentScale.Crop
                    )
                }
            }



            Button(onClick = { navController.navigate("login") },
                modifier = Modifier
                .padding(top = 40.dp)
                .width(285.dp)
                .height(54.dp)
                .align(Alignment.CenterHorizontally)
                ,
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Black)

            ) {
                Text(text = "SIGN UP",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600)
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Already have account? ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(400),
                )

                Text(text = "SIGN IN",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    )
            }

            Column(modifier = Modifier.height(30.dp)) {

            }
        }
    }
}
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSigup() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        SignUp(navController)
    }
}
package com.example.applicationasm.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

fun Cart(navController: NavController){

    val cartList = listOf(
        Triple("Modern Chair", R.drawable.product1, "$ 12.00",),
        Triple("Wooden Table", R.drawable.product2, "$ 25.00"),
        Triple("Coffee Chair", R.drawable.product3, "$ 20.00"),
        Triple("Modern Chair", R.drawable.product1, "$ 12.00",),
        Triple("Wooden Table", R.drawable.product2, "$ 25.00"),
        Triple("Coffee Chair", R.drawable.product3, "$ 20.00"),

    )

    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(40.dp))
        Row (
            modifier = Modifier
                .padding(30.dp, bottom = 0.dp)
                .fillMaxWidth(),

        ){
            Image(
                painter = painterResource(id = R.drawable.backcart),
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                contentScale = ContentScale.Crop
            )
            Column (
                modifier = Modifier
                    .padding(bottom = 2.dp, end = 25.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Make home",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,

                )
            }
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ){
            items(cartList) { cart ->
                ListCart(cart = cart)
            }
        }

        Column (modifier = Modifier.padding(30.dp, bottom = 0.dp, end = 30.dp)){
            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()
                .background(color = Color.White)
                .clip(RoundedCornerShape(10.dp)),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Enter your promo code",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically),
                    color = Color.Gray
                )
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = null,
                    modifier = Modifier
                        .width(44.dp)
                        .height(44.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Total:",
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp
                )
                Text(text = "$ 95.00",
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp)
            }
            Button(onClick = { navController.navigate("checkout") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                ,
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Add to cart")
            }
            Spacer(modifier = Modifier.height(55.dp))
        }
    }
}


@Composable
fun ListCart(cart: Triple<String, Int, String>) {
    Row(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = cart.second),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop,

        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(modifier = Modifier
            .padding(start = 0.dp)) {
            Text(
                text = cart.first,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,

                )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = cart.third,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,

                )
            Spacer(modifier = Modifier.height(25.dp))
            Row (modifier = Modifier
                .width(120.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Image(painter = painterResource(id = R.drawable.add), contentDescription =null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    contentScale = ContentScale.Crop)
                Text(text = "01",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W500,
                    fontFamily = FontFamily.Serif)

                Image(painter = painterResource(id = R.drawable.deduction), contentDescription =null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    contentScale = ContentScale.Crop)
            }
        }
        Column(modifier = Modifier
            .padding(start = 40.dp)
            ) {
            Image(painter = painterResource(id = R.drawable.delete), contentDescription =null,
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp),
                contentScale = ContentScale.Crop)

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewCart() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        Cart(navController)
    }
}
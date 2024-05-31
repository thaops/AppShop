package com.example.applicationasm.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
fun Home(navController: NavController) {
    val itemList = listOf(
        Pair("Popu", R.drawable.star),
        Pair("Chair", R.drawable.chair),
        Pair("Table", R.drawable.table),
        Pair("Armch", R.drawable.armachair),
        Pair("Bed", R.drawable.bed),
    )


    val productList = listOf(
        Triple("Modern Chair", R.drawable.product1, "$ 12.00",),
        Triple("Wooden Table", R.drawable.product2, "$ 25.00"),
        Triple("Coffee Chair", R.drawable.product3, "$ 20.00"),
        Triple("Simple Desk", R.drawable.product4, "$ 50.00"),
        Triple("Modern Chair", R.drawable.product1, "$ 12.00"),
        Triple("Wooden Table", R.drawable.product2, "$ 25.00"),
    )

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .padding(end = 20.dp, start = 20.dp, top = 30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .background(color = Color.White)
                    .clickable { navController.navigate("detail") }
                ,
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier) {
                Text(
                    text = "Make home",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(bottom = 2.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = "BEAUTIFUL",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black
                )
            }

            Image(
                painter = painterResource(id = R.drawable.bi_cart2),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .background(color = Color.White)
                    .clickable { navController.navigate("cart") },
                contentScale = ContentScale.Crop
            )
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 0.dp, end = 20.dp)
        ) {
            items(itemList) { item ->
                ListItem(item = item)
            }
        }

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(productList.chunked(2)) { rowItems ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    for (product in rowItems) {
                        ListProduct(product)
                    }
                }
            }
        }
    }
}

val customColor = Color(0xFF000000)

@Composable
fun ListItem(item: Pair<String, Int>) {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .width(44.dp)
                .height(44.dp)
                .shadow(8.dp, RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .background(color = Color.White)
        ) {
            Image(
                painter = painterResource(id = item.second),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(24.dp)
                    .width(24.dp)
                    .align(Alignment.CenterHorizontally),
                colorFilter = (ColorFilter.tint(customColor)),
                contentScale = ContentScale.Crop,
            )
        }

        Text(
            text = item.first,
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier
                .padding(top = 2.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ListProduct(product: Triple<String, Int, String>) {
    Column(
        modifier = Modifier
            .padding(20.dp)

    ) {
        Image(
            painter = painterResource(id = product.second),
            contentDescription = null,
            modifier = Modifier
                .width(157.dp)
                .height(236.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = product.first,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,

        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = product.third,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,

        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHome() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        Home(navController)
    }
}

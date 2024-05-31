package com.example.applicationasm.Home

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationasm.ui.theme.ApplicationASMTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationasm.R
@Composable
fun Detail(navController: NavController){
    Box (modifier = Modifier
        .fillMaxWidth(),

      ){
        Image(
            painter = painterResource(id = R.drawable.productdetail),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 50.dp)
                .width(349.dp)
                .height(465.dp)
                .clip(RoundedCornerShape(bottomStart = 50.dp)),
            contentScale = ContentScale.Crop,
        )

    }
    Column(
        modifier = Modifier.fillMaxSize()
        ) {
        Column {
            Image(painter = painterResource(id = R.drawable.back), contentDescription =null,
                modifier = Modifier
                    .width(112.dp)
                    .height(120.dp),
                contentScale = ContentScale.Crop)

            Image(painter = painterResource(id = R.drawable.colorux), contentDescription =null,
                modifier = Modifier
                    .width(124.dp)
                    .height(272.dp),
                contentScale = ContentScale.Crop)
        }
        Spacer(modifier = Modifier.height(70.dp))

        Column(modifier = Modifier
            .padding(30.dp)) {
            Text(text = "Minimal Stand",
                fontSize = 24.sp,
                fontWeight = FontWeight.W500,
                fontFamily = FontFamily.Serif
            )
            Row(modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(text = "$ 50",
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.W600,
                        fontFamily = FontFamily.Serif)



                Row (modifier = Modifier
                    .width(150.dp)
                    .align(Alignment.CenterVertically),
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

            Row(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.star), contentDescription =null,
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp),
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.tint(color = Color.Yellow)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "4.5",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W500,
                    fontFamily = FontFamily.Serif)
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "(50 reviews)",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W500,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                        .align(alignment = Alignment.Bottom)
                )

            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Minimal Stand is made of by natural wood. The design that is very simple and minimal. This is truly one of the best furnitures in any family for now. With 3 different colors, you can easily select the best match for your home. ",
                fontSize = 14.sp,
                textAlign = TextAlign.Justify,
                fontFamily = FontFamily.Serif,
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.CenterHorizontally),
                style = LocalTextStyle.current.copy(letterSpacing = 1.sp, lineHeight = 30.sp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier
                .fillMaxHeight()){
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

                ) {
                    Image(painter = painterResource(id = R.drawable.save), contentDescription =null,
                        modifier = Modifier
                            .width(16.dp)
                            .height(20.dp)
                        ,
                        contentScale = ContentScale.Crop,
                        colorFilter = ColorFilter.tint(color = Color.Black)
                    )
            }
                Spacer(modifier = Modifier.width(35.dp))
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(260.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

                ) {
                    Text(text = "Add to cart")
                }

            }



        }


    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewDetail() {
    val navController = rememberNavController()
    ApplicationASMTheme {
        Detail(navController)
    }
}
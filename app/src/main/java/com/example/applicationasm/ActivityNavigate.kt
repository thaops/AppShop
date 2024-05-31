package com.example.applicationasm

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applicationasm.Home.Cart
import com.example.applicationasm.Home.CheckOut
import com.example.applicationasm.Home.Congrats
import com.example.applicationasm.Home.Detail
import com.example.applicationasm.Home.Home


@Composable
fun Navigate(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            Main(navController)
        }
        composable("login") {
            Login(navController)
        }
        composable("signup") {
            SignUp(navController)
        }
        composable("home") {
            Home(navController)
        }
        composable("detail") {
            Detail(navController)
        }
        composable("cart") {
            Cart(navController)
        }

        composable("checkout") {
            CheckOut(navController)
        }

        composable("congrats") {
            Congrats(navController)
        }
    }
}

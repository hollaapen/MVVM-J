package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.contact.ContactScreen
import net.ezra.ui.dashboard.DashboardScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.products.InsertProductScreen
import net.ezra.ui.products.ProductDetailScreen
import net.ezra.ui.products.ProductListScreen
import net.ezra.ui.shop.ShopScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_SHOP){
            ShopScreen(navController)
        }

        composable(ROUTE_INSERT_PRODUCT) {
            InsertProductScreen(navController = navController){}
        }

        composable(ROUTE_VIEW_PRODUCTS) {
            ProductListScreen(navController = navController, products = listOf() )
        }

        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }


        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController) {

            }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }


        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController = navController)
        }













































    }
}
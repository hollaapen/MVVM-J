package net.ezra.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_INSERT_PRODUCT
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_VIEW_PRODUCTS

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
        Text(text = "this is the homepage")

        Text("shop",
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOP)
                }
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text("Insert Products",
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_INSERT_PRODUCT)
                }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("View Products",
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_VIEW_PRODUCTS)
                }
        )

        Spacer(modifier = Modifier.height(20.dp))



        Button(

            onClick = { navController.navigate(ROUTE_SHOP) }

        ) {
            Text(text = "go to shop")

        }


        Button(onClick = {
            navController.navigate(ROUTE_ABOUT)
        }) {

            Text(text = "about")

        }

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CONTACT)
                },
            text = "Contact"
        )


        











    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}


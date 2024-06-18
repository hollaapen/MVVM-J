package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME


@Composable
fun ContactScreen(navController: NavHostController) {
    Column {


    Text(text = "this is the contact page")

    Text(
        modifier = Modifier
            .clickable {
                navController.navigate(ROUTE_HOME)
            },
        text = "Contact"
    )








    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}


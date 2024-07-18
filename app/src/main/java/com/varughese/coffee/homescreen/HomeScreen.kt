package com.varughese.coffee.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.varughese.coffee.R

@Composable
fun HomeScreen(navController: NavController) {
    Home(navController, modifier = Modifier.fillMaxSize())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            Column(modifier = Modifier.background(Color(0xFFc67c4e))) {
                TopAppBar(
                    title = {
                        Column {
                            Spacer(modifier = Modifier.padding(4.dp))
                            Text("Location", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.ExtraBold )
                            Text("Chicago, Illinois", style = MaterialTheme.typography.labelLarge)
                        }
                    },
                    actions = {
                        IconButton(onClick = { /* TODO: Another Action */ }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "More")
                        }
                    },
                    backgroundColor = Color.Transparent,
                    elevation = 0.dp
                )
                SearchBar()
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = MaterialTheme.colorScheme.surface
            ) {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = true,
                    onClick = { /* TODO: Navigate to Home */ },
                    selectedContentColor = MaterialTheme.colorScheme.primary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurface
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    selected = false,
                    onClick = { /* TODO: Navigate to Favorites */ },
                    selectedContentColor = MaterialTheme.colorScheme.primary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurface
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    selected = false,
                    onClick = { /* TODO: Navigate to Profile */ },
                    selectedContentColor = MaterialTheme.colorScheme.primary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)
            .background(Color(0xFF1B1B1B))) {
            // Promo Banner
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_background),
                    contentDescription = "Banner background",
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(30.dp))
                )
                Image(
                    painter = painterResource(id = R.drawable.promo),
                    contentDescription = "Promo",
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .align(Alignment.TopStart)
                        .padding(horizontal = 80.dp, vertical = 10.dp)
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(horizontal = 80.dp, vertical = 15.dp),
                ) {
                    Text(
                        text = "Buy one",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "get one FREE",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            // Tabs for Coffee Categories
            val categories = listOf("All Coffee", "Macchiato", "Latte", "Americano")
            var selectedTabIndex by remember { mutableStateOf(0) }

            TabRow(
                selectedTabIndex = selectedTabIndex,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                backgroundColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                categories.forEachIndexed { index, category ->
                    Tab(
                        text = { Text(category, style = MaterialTheme.typography.labelLarge) },
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index},
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
            // Coffee Items
            LazyColumn(
                modifier = Modifier.padding(16.dp)
            ) {
                items(
                    listOf(
                        CoffeeItem("Caffe Mocha", "Deep Foam", "$4.53", R.drawable.caffe_mocha),
                        CoffeeItem("Flat White", "Espresso", "$3.53", R.drawable.flat_white),
                        CoffeeItem("Coffee Drink 3", "Description", "Price", R.drawable.coffee_1),
                        CoffeeItem("Coffee Drink 4", "Description", "Price", R.drawable.coffee_2),
                        CoffeeItem("Coffee Drink 5", "Description", "Price", R.drawable.coffee_2),
                        CoffeeItem("Coffee Drink 6", "Description", "Price", R.drawable.coffee_2)
                    )
                ) { coffee ->
                    CoffeeCard(navController, coffee)
                }
            }
        }
    }
}

@Composable
fun SearchBar() {
    var query by remember { mutableStateOf("") }

    TextField(
        value = query,
        onValueChange = { query = it },
        placeholder = { Text("Search coffee") },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White, RoundedCornerShape(8.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true
    )
}

@Composable
fun CoffeeCard(navController: NavController, coffee: CoffeeItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { navController.navigate("details") },
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = coffee.imageRes),
                contentDescription = coffee.name,
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(coffee.name, style = MaterialTheme.typography.titleLarge)
                Text(coffee.description, style = MaterialTheme.typography.bodyMedium)
                Text(
                    coffee.price,
                    style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

data class CoffeeItem(
    val name: String,
    val description: String,
    val price: String,
    val imageRes: Int
)
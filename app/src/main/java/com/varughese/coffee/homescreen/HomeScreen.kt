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
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.varughese.coffee.R

@Composable
fun HomeScreen(navController: NavController) {
    Home(navController, modifier = Modifier.fillMaxSize())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold() { innerPadding ->
        Column(modifier = Modifier
            .padding(bottom = innerPadding.calculateBottomPadding())
            .drawBehind {
                val gradient = Brush.verticalGradient(
                    colors = listOf(Color.Black, Color.Gray),
                    startY = 0f,
                    endY = size.height
                )
                drawRect(brush = gradient, size = size)
            }
        ) {
            Column(modifier = Modifier.systemBarsPadding()) {


                Column(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        "Location",
                        style = TextStyle(
                            color = Color(0xFFA2A2A2),
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp
                        )
                    )
                    Text(
                        "Chicago, Illinois",
                        style = TextStyle(
                            color = Color(0xFFD8D8D8),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp
                        )
                    )
                    SearchBar()
                }


            }
            // Promo Banner
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.banner_background),
                    contentDescription = "Banner background",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(horizontal = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.promo),
                        contentDescription = "Promo",
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 5.dp)
                    )

                    HighlightText(text = "Buy one", modifier = Modifier.padding(horizontal = 5.dp))
                    HighlightText(
                        text = "get one FREE",
                        modifier = Modifier.padding(horizontal = 5.dp)
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
                contentColor = MaterialTheme.colorScheme.primary,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Color(0xFFDE9368)
                    )
                }
            ) {
                categories.forEachIndexed { index, category ->
                    Tab(
                        text = {
                            Text(
                                category,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = if (selectedTabIndex == index) Color.White else Color.Black
                            )
                        },
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        modifier = Modifier
                            .background(if (selectedTabIndex == index) Color(0xFFDE9368) else Color.Transparent) // Conditional background
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
fun HighlightText(text: String, modifier: Modifier) {
    Box(
        modifier = modifier
            .drawBehind {
                val gradient = Brush.verticalGradient(
                    colors = listOf(Color.Black, Color.Gray),
                    startY = 0f,
                    endY = size.height
                )
                drawRect(brush = gradient, size = size)
            }
            .drawBehind {
                val padding = 1.dp.toPx()
                val backgroundRect = Rect(
                    left = 0f,
                    top = 0f,
                    right = size.width + 2 * padding,
                    bottom = size.height + 2 * padding
                )
                val gradient = Brush.verticalGradient(
                    colors = listOf(Color(0xFF1E1E1E), Color.DarkGray),
                    startY = 0f,
                    endY = size.height
                )
                drawRect(
                    brush = gradient,
                    topLeft = Offset(-padding, -padding),
                    size = backgroundRect.size
                )
            }
            .padding(4.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp,
            modifier = Modifier.padding(horizontal = 5.dp)
        )
    }
}

@Composable
fun SearchBar() {
    var query by remember { mutableStateOf("") }

    TextField(
        value = query,
        onValueChange = { query = it },
        placeholder = {
            Text(
                "Search coffee",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        },
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF2A2A2A),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        shape = RoundedCornerShape(16.dp)
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
                    .size(128.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(coffee.name, fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
                Text(coffee.description, fontWeight = FontWeight.Normal, fontSize = 18.sp, color = Color(0xFFA2A2A2))
                Text(
                    coffee.price, fontWeight = FontWeight.SemiBold, fontSize = 24.sp
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
package com.varughese.coffee.ordering

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.varughese.coffee.R

@Composable
fun OrderScreen(navController: NavHostController) {
    OrderPreview(navController, modifier = Modifier.fillMaxSize())
}


@Composable
fun OrderPreview(navController: NavHostController, modifier: Modifier) {
    var selectedTab by remember { mutableStateOf("Deliver") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                val gradient = Brush.verticalGradient(
                    colors = listOf(Color.Black, Color.Gray),
                    startY = 0f,
                    endY = size.height
                )
                drawRect(brush = gradient, size = size)
            }
            .padding(16.dp)

    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back_arrow),
                    contentDescription = "Back",
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.width(117.dp))
            Text(
                text = "Order",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally)
            )
        }

        Spacer(modifier = Modifier.height(18.dp))

        TopBar(selectedTab) { selectedTab = it }

        Spacer(modifier = Modifier.height(72.dp))

        DeliveryAddressSection()

        Spacer(modifier = Modifier.height(72.dp))

        ItemDetails()

        Spacer(modifier = Modifier.height(72.dp))

        DiscountInfo()

        Spacer(modifier = Modifier.height(72.dp))

        PaymentSummary()

        Spacer(modifier = Modifier.height(48.dp))

        OrderButton()
    }
}

@Composable
fun TopBar(selectedTab: String, onTabSelected: (String) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = { onTabSelected("Deliver") },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (selectedTab == "Deliver") Color(0xFFDE9368) else Color.Gray
            ),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Deliver", color = Color.White)
        }
        Button(
            onClick = { onTabSelected("Pick Up") },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (selectedTab == "Pick Up") Color(0xFFDE9368) else Color.Gray
            ),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Pick Up", color = Color.White)
        }
    }
}

@Composable
fun DeliveryAddressSection() {
    Column {
        Text(text = "Delivery Address", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "(name)")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "(address)", color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Button(onClick = { /* Edit Address */ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFFDE9368),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Edit Address")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { /* Add Note */ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFFDE9368),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(8.dp)) {
                Text(text = "Add Note", color = Color.White)
            }
        }
    }
}

@Composable
fun ItemDetails() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.caffe_mocha), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = "Cafe Mocha", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(2.dp))
            Text(text = "Deep Foam", color = Color.Gray)
        }
        Spacer(modifier = Modifier.weight(1f))
        Counter()
    }
}

@Composable
fun Counter() {
    var count by remember { mutableStateOf(1) }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { if (count > 1) count-- }) {
            Icon(painter = painterResource(id = R.drawable.ic_minus), contentDescription = null)
        }
        Text(text = count.toString())
        IconButton(onClick = { count++ }) {
            Icon(painter = painterResource(id = R.drawable.ic_plus), contentDescription = null)
        }
    }
}

@Composable
fun DiscountInfo() {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFFF0F0F0),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "1 Discount is Applied",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun PaymentSummary() {
    Column {
        Text(text = "Payment Summary", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Price")
            Text(text = "$3.63")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Delivery Fee")
            Text(
                text = "$2.00",
                style = LocalTextStyle.current.copy(
                    textDecoration = TextDecoration.LineThrough,
                    color = Color.Gray
                )
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Cash/Wallet")
            Text(text = "$5.63")
        }
    }
}

@Composable
fun OrderButton() {
    Button(
        onClick = { /* Place Order */ },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFDE9368)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = "Order", color = Color.White)
    }
}

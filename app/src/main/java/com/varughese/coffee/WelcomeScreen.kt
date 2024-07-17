package com.varughese.coffee

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow


@Composable
fun WelcomeScreen(navController: NavController) {
    Welcome(navController, modifier = Modifier.fillMaxSize())
}

@Composable
fun Welcome(navController: NavController, modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ImageCoffee6(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f))
        AndroidLarge2(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)) {}
        Rectangle1(navController, modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f))
        GetStarted(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f))
        WelcomeToOurCozyCoffeeCornerWhereEveryCupIsDelightfulForYou(
            modifier = Modifier
                .rowWeight(
                    1.0f
                )
                .columnWeight(1.0f)
        )
        FallInLoveWithCoffeeInBlissfulDelight(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 56.0.dp,
                    y = 485.0.dp
                )
            )
        )
    }
}

@Composable
fun ImageCoffee6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.welcome_image_coffee_6),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.0.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 264.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 0.0.dp,
                blur = 0.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun AndroidLarge2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 50.0,
        content = content,
        modifier = modifier
            .background(Color.Transparent)
            .drawWithContent(
                onDraw = {
                    drawRect(
                        brush = Brush.linearGradient(
                            0.6f to Color(
                                alpha = 0,
                                red = 0,
                                green = 0,
                                blue = 0
                            ),
                            Float.POSITIVE_INFINITY to Color(
                                alpha = 255,
                                red = 0,
                                green = 0,
                                blue = 0
                            ),
                            start = Offset(
                                0.5f,
                                0.0f
                            ),
                            end = Offset(
                                0.5f,
                                Float.POSITIVE_INFINITY
                            )
                        ),
                        topLeft = Offset(
                            3.0.dp.toPx(),
                            0.0.dp.toPx()
                        ),
                        size = Size(
                            (size.width.toDp() - (3.0.dp)).toPx(),
                            (size.height.toDp() - (264.0.dp)).toPx()
                        )
                    )
                    drawContent()
                }
            )
            .padding(
                paddingValues = PaddingValues(
                    start = 3.0.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 264.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle1(navController: NavController, modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.welcome_rectangle_1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 75.0.dp,
                    top = 750.0.dp,
                    end = 48.0.dp,
                    bottom = 76.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .clickable {
                navController.navigate("home")
            }
    )
}

@Composable
fun GetStarted(modifier: Modifier = Modifier) {
    RelayText(
        content = "Get Started",
        fontSize = 25.0.sp,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.171875.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 55.0.dp,
                    top = 765.0.dp,
                    end = 48.0.dp,
                    bottom = 76.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun WelcomeToOurCozyCoffeeCornerWhereEveryCupIsDelightfulForYou(modifier: Modifier = Modifier) {
    RelayText(
        content = "Welcome to our cozy coffee corner, where every cup is delightful for you.",
        fontSize = 15.0.sp,
        color = Color(
            alpha = 255,
            red = 88,
            green = 88,
            blue = 88
        ),
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 35.0.dp,
                    top = 690.0.dp,
                    end = 30.0.dp,
                    bottom = 137.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun FallInLoveWithCoffeeInBlissfulDelight(modifier: Modifier = Modifier) {
    RelayText(
        content = "Fall in Love with Coffee in Blissful Delight",
        fontSize = 30.0.sp,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.171875.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 25.0.dp,
                    top = 90.0.dp,
                    end = 50.0.dp,
                    bottom = 137.0.dp
                )
            )
            .requiredWidth(247.0.dp)
            .requiredHeight(145.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

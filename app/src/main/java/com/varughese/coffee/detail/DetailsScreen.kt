package com.varughese.coffee.detail

import com.varughese.coffee.details.poppins
import com.varughese.coffee.details.sora
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.varughese.coffee.R
import com.varughese.coffee.TopLevel


@Composable
fun DetailsScreen(navController: NavHostController) {
    Details(modifier = Modifier.fillMaxSize())
}
@Composable
fun Details(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Button(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Price {
                Price1()
                Class453()
            }
            Button1 {
                BuyNow()
            }
        }
        Size(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 589.0.dp
                )
            )
        ) {
            Size1()
            Choice {
                Small {
                    S()
                }
                Medium {
                    M()
                }
                Large {
                    L()
                }
            }
        }
        Description(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 470.0.dp
                )
            )
        ) {
            Description1()
            ACappuccinoIsAnApproximately150Ml5OzBeverageWith25MlOfEspressoCoffeeAnd85mlOfFreshMilkTheFoReadMore()
        }
        DetailProduct(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 354.0.dp
                )
            )
        ) {
            CaffeMocha {
                Tect {
                    Text {
                        CafeMocha()
                        IceHot()
                    }
                    Rating {
                        Rating1 {
                            VuesaxLinearStar {
                                Star {
                                    Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                        }
                        Class48230()
                    }
                }
                Superiority {
                    FastDelivery {
                        Icon {
                            MaskGroup(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 0.0000057220458984375.dp,
                                        y = 0.00001049041748046875.dp
                                    )
                                )
                            ) {
                                Motorbike1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                Motorbike2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                    QualityBean {
                        Icon1 {
                            MaskGroup1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 2.0.dp,
                                        y = 2.0.dp
                                    )
                                )
                            ) {
                                CoffeeBean1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                CoffeeBean2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                    ExtraMilk {
                        Icon2 {
                            MaskGroup2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 2.0.dp,
                                        y = 2.0.dp
                                    )
                                )
                            ) {
                                Packaging1()
                                Packaging2()
                            }
                        }
                    }
                }
            }
            Line(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -1.000000913159674.dp
                    )
                )
            )
        }
        Image(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 136.0.dp
                )
            )
        ) {
            ImageCoffee2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Detail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 68.0.dp
                )
            )
        ) {
            Back {
                Icon3 {
                    ArrowLeft2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 4.249999999999998.dp,
                                y = 7.75.dp
                            )
                        )
                    ) {
                        Stroke1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
            }
            Home()
            Favourite {
                Icon4 {
                    Heart(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.0.dp,
                                y = 2.999908447265625.dp
                            )
                        )
                    ) {
                        Group3 {
                            Clip2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        Fill4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun DetailsPreview() {
    MaterialTheme {
        RelayContainer {
            Details(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Price1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Price",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 144,
            green = 144,
            blue = 144
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Class453(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 4.53",
        fontSize = 18.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 198,
            green = 124,
            blue = 78
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(76.0.dp)
    )
}

@Composable
fun Price(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun BuyNow(modifier: Modifier = Modifier) {
    RelayText(
        content = "Buy Now",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Button1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 198,
            green = 124,
            blue = 78
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 16.0.dp,
            end = 20.0.dp,
            bottom = 16.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(217.0.dp)
    )
}

@Composable
fun Button(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 16.0.dp,
            end = 24.0.dp,
            bottom = 46.0.dp
        ),
        itemSpacing = 34.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Size1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Size",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun S(modifier: Modifier = Modifier) {
    RelayText(
        content = "S",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Small(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 227,
            green = 227,
            blue = 227
        ),
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun M(modifier: Modifier = Modifier) {
    RelayText(
        content = "M",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 198,
            green = 124,
            blue = 78
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Medium(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 249,
            green = 242,
            blue = 237
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 198,
            green = 124,
            blue = 78
        ),
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun L(modifier: Modifier = Modifier) {
    RelayText(
        content = "L",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Large(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 227,
            green = 227,
            blue = 227
        ),
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Choice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Size(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Description1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Description",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun ACappuccinoIsAnApproximately150Ml5OzBeverageWith25MlOfEspressoCoffeeAnd85mlOfFreshMilkTheFoReadMore(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 162,
                        green = 162,
                        blue = 162
                    ),
                    fontFamily = sora,
                    fontWeight = FontWeight(300.0.toInt())
                )
            ) {
                append("A cappuccino is an approximately 150 ml (5 oz) beverage, with 25 ml of espresso coffee and 85ml of fresh milk the fo..")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = sora,
                    fontWeight = FontWeight(300.0.toInt())
                )
            ) {
                append(" ")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 198,
                        green = 124,
                        blue = 78
                    ),
                    fontFamily = sora,
                    fontWeight = FontWeight(600.0.toInt())
                )
            ) {
                append("Read More")
            }
        },
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 162,
            green = 162,
            blue = 162
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(327.0.dp)
    )
}

@Composable
fun Description(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun CafeMocha(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cafe Mocha",
        fontSize = 20.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun IceHot(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ice/Hot",
        fontSize = 12.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 162,
            green = 162,
            blue = 162
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Text(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.66754150390625.dp,
                top = 1.731250286102295.dp,
                end = 1.6639480590820312.dp,
                bottom = 1.736860752105713.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Star(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun VuesaxLinearStar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Rating1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Class48230(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 42,
                        green = 42,
                        blue = 42
                    ),
                    fontFamily = sora,
                    fontWeight = FontWeight(600.0.toInt())
                )
            ) {
                append("4.8")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = sora,
                    fontWeight = FontWeight(600.0.toInt())
                )
            ) {
                append(" ")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 162,
                        green = 162,
                        blue = 162
                    ),
                    fontFamily = sora,
                    fontSize = 12.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("(230)")
            }
        },
        fontSize = 16.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 42,
            green = 42,
            blue = 42
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rating(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Tect(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Motorbike1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.details_motorbike_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Motorbike2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_motorbike_2),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaskGroup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 180.0f).requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun FastDelivery(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 89,
            red = 237,
            green = 237,
            blue = 237
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 6.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun CoffeeBean1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.details_coffee_bean_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CoffeeBean2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_coffee_bean_2),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaskGroup1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Icon1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun QualityBean(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 89,
            red = 237,
            green = 237,
            blue = 237
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Packaging1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.details_packaging_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Packaging2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_packaging_2),
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun MaskGroup2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Icon2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun ExtraMilk(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 89,
            red = 237,
            green = 237,
            blue = 237
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Superiority(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 12.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun CaffeMocha(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 42.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_line),
        modifier = modifier.requiredWidth(295.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun DetailProduct(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun ImageCoffee2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.details_image_coffee_2),
        radius = 16.0,
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(327.0.dp).requiredHeight(202.0.dp)
    )
}

@Composable
fun Stroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_stroke_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 7.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ArrowLeft2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000000000001f).requiredWidth(15.5.dp).requiredHeight(8.5.dp)
    )
}

@Composable
fun Icon3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Back(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    RelayText(
        content = "Detail",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.2000000762939453.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Clip2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Group3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.472515106201172.dp).requiredHeight(19.500999450683594.dp)
    )
}

@Composable
fun Fill4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.details_fill_4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.4873046875.dp,
                top = 3.703826904296875.dp,
                end = 3.567396879196167.dp,
                bottom = 11.876010417938232.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Heart(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(20.472515106201172.dp).requiredHeight(19.500999450683594.dp)
    )
}

@Composable
fun Icon4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Favourite(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Detail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}


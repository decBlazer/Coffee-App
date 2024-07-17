package com.varughese.coffee.ordering

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
import com.varughese.coffee.order.sora

@Composable
fun OrderScreen(navController: NavHostController) {
    Order(modifier = Modifier.fillMaxSize())
}

@Composable
fun Order(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ButtonPaymern(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            PaymentMethod {
                Wallet {
                    IconlyRegularLightWallet {
                        Wallet1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 2.0833740234375.dp,
                                    y = 2.5.dp
                                )
                            )
                        ) {
                            Stroke1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.75.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5001220703125.dp,
                                        y = -0.370269775390625.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke5(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.75.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke7(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.370269775390625.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }
                    Text {
                        CashWallet()
                        Class553()
                    }
                }
                OptionPayment {
                    Icon(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.5.dp
                            )
                        )
                    ) {
                        ArrowDown2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 3.5416259765625.dp,
                                    y = 6.4583282470703125.dp
                                )
                            )
                        ) {
                            Stroke2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            Button {
                Order1()
            }
        }
        PaymentSummary(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 522.0.dp
                )
            )
        ) {
            PaymentSummary1()
            Detail {
                Price {
                    Price1()
                    Class453()
                }
                DeliveryFee {
                    DeliveryFee1()
                    Price2 {
                        Class200()
                        Class100()
                    }
                }
            }
        }
        Discount(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 442.0.dp
                )
            )
        ) {
            Text1 {
                Icon2 {
                    Discount1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 1.6668701171875.dp,
                                y = 1.6668319702148438.dp
                            )
                        )
                    ) {
                        Group3 {
                            Clip2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                        Fill4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        Fill6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        Fill8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
                Class1DiscountIsApplied()
            }
            Icon1 {
                ArrowRight2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 3.5416667461395264.dp,
                            y = 6.458333730697632.dp
                        )
                    )
                ) {
                    Stroke4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = -9.5367431640625e-7.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
            }
        }
        Line(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 7.5.dp,
                    y = 18.0.dp
                )
            )
        )
        CheckoutProduct(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 352.0.dp
                )
            )
        ) {
            Detail1 {
                Image {
                    ImageCoffee2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Text2 {
                    CafeMocha()
                    DeepFoam()
                }
            }
            AddItem {
                Icon3 {
                    IconDefaultMinuscircle {
                        Minus {
                            Vector(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.75.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                Class1()
                Icon4 {
                    IconDefaultPluscircle {
                        Add {
                            Vector2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.75.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Vector3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.75.dp,
                                        y = -0.75.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
        }
        Line1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 335.0000205242551.dp
                )
            )
        )
        DeliveryAddress(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 199.0.dp
                )
            )
        ) {
            Address {
                DeliveryAddress1()
                Text3 {
                    Name()
                    Address()
                }
            }
            Edit {
                EditAdress {
                    Edit1 {
                        EditSquare(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 1.6043701171875.dp,
                                    y = 1.604400634765625.dp
                                )
                            )
                        ) {
                            Stroke6(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke8(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke9(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }
                    EditAddress()
                }
                AddNote {
                    Note {
                        Document(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 2.1878662109375.dp,
                                    y = 1.6040496826171875.dp
                                )
                            )
                        ) {
                            Stroke10(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.20833587646484375.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke11(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.20833587646484375.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke12(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.20833587646484375.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Stroke13(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }
                    AddNote1()
                }
            }
        }
        Type(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 132.0.dp
                )
            )
        ) {
            Deliver {
                Deliver1()
            }
            Pickup {
                PickUp()
            }
        }
        Order(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 64.0.dp
                )
            )
        ) {
            Back {
                Icon5 {
                    ArrowLeft2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 4.249999999999998.dp,
                                y = 7.75.dp
                            )
                        )
                    ) {
                        Stroke14(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
            }
            Home()
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun OrderPreview() {
    MaterialTheme {
        RelayContainer {
            Order(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Stroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.33203125.dp,
                top = 5.011016845703125.dp,
                end = 0.000011444091796875.dp,
                bottom = 5.230496883392334.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.447509765625.dp,
                top = 6.822662353515625.dp,
                end = 2.742131531238556.dp,
                bottom = 7.144832909107208.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.000152587890625.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.7796630859375.dp,
                top = 3.402069091796875.dp,
                end = 7.670326232910156.dp,
                bottom = 10.565426170825958.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Wallet1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(15.949115753173828.dp).requiredHeight(14.726969718933105.dp)
    )
}

@Composable
fun IconlyRegularLightWallet(
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
fun CashWallet(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cash/Wallet",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(150.0.dp)
    )
}

@Composable
fun Class553(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 5.53",
        fontSize = 12.0.sp,
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
fun Wallet(
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
fun Stroke2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_2),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ArrowDown2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(12.916666984558105.dp).requiredHeight(7.083333492279053.dp)
    )
}

@Composable
fun Icon(
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
fun OptionPayment(
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
fun PaymentMethod(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 117.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Order1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Order",
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
fun Button(
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
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun ButtonPaymern(
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
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 16.0.dp,
            end = 24.0.dp,
            bottom = 46.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun PaymentSummary1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Payment Summary",
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
fun Price1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Price",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Class453(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 4.53",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Price(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 247.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun DeliveryFee1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Delivery Fee",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Class200(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 2.00",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 42,
            green = 42,
            blue = 42
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        strikethrough = true,
        modifier = modifier
    )
}

@Composable
fun Class100(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 1.00",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.5.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Price2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(55.0.dp)
    )
}

@Composable
fun DeliveryFee(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 164.0,
        clipToParent = false,
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
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun PaymentSummary(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min).requiredHeight(93.0.dp)
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
        modifier = modifier.requiredWidth(16.668954849243164.dp).requiredHeight(16.667499542236328.dp)
    )
}

@Composable
fun Fill4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_fill_4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.5670166015625.dp,
                top = 5.5671234130859375.dp,
                end = 5.568188190460205.dp,
                bottom = 5.566417694091797.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Fill6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_fill_6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.5819091796875.dp,
                top = 9.582500457763672.dp,
                end = 5.416213035583496.dp,
                bottom = 5.418333053588867.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Fill8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_fill_8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.415283203125.dp,
                top = 5.41583251953125.dp,
                end = 9.582838535308838.dp,
                bottom = 9.58500051498413.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Discount1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.668954849243164.dp).requiredHeight(16.667499542236328.dp)
    )
}

@Composable
fun Icon2(
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
fun Class1DiscountIsApplied(modifier: Modifier = Modifier) {
    RelayText(
        content = "1 Discount is Applied",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Text1(
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
fun Stroke4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_4),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ArrowRight2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = -90.0f).requiredWidth(12.916666984558105.dp).requiredHeight(7.083333492279053.dp)
    )
}

@Composable
fun Icon1(
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
fun Discount(
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
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 90.0,
        clipToParent = false,
        radius = 16.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 237,
            green = 237,
            blue = 237
        ),
        content = content,
        modifier = modifier.requiredHeight(56.0.dp)
    )
}

@Composable
fun Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_line),
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(4.0.dp)
    )
}

@Composable
fun ImageCoffee2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.order_image_coffee_2),
        radius = 8.0,
        contentScale = ContentScale.Crop,
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
        modifier = modifier.requiredWidth(54.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun CafeMocha(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cafe Mocha",
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
fun DeepFoam(modifier: Modifier = Modifier) {
    RelayText(
        content = "Deep Foam",
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
fun Text2(
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
fun Detail1(
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
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.0.dp,
                top = 8.0.dp,
                end = 4.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Minus(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun IconDefaultMinuscircle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Icon3(
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
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 10.0,
        radius = 20.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 249,
            green = 242,
            blue = 237
        ),
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Class1(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 42,
            green = 42,
            blue = 42
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.0.dp,
                top = 8.0.dp,
                end = 4.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 4.0.dp,
                end = 8.0.dp,
                bottom = 4.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Add(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun IconDefaultPluscircle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Icon4(
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
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 10.0,
        radius = 20.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 249,
            green = 242,
            blue = 237
        ),
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun AddItem(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 18.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun CheckoutProduct(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 64.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Line1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_line1),
        modifier = modifier.requiredWidth(295.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun DeliveryAddress1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Delivery Address",
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
fun Name(modifier: Modifier = Modifier) {
    RelayText(
        content = "(name)",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Address(modifier: Modifier = Modifier) {
    RelayText(
        content = "(address)",
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
        maxLines = -1,
        modifier = modifier.requiredWidth(315.0.dp)
    )
}

@Composable
fun Text3(
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
fun Address(
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
fun Stroke6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.02251434326171875.dp,
                end = 0.0033540725708007812.dp,
                bottom = 0.0000019073486328125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.1199951171875.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 3.173391342163086.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_9),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.2420654296875.dp,
                top = 1.0803909301757812.dp,
                end = 1.082538366317749.dp,
                bottom = 7.263958692550659.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun EditSquare(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(10.988103866577148.dp).requiredHeight(11.00784969329834.dp)
    )
}

@Composable
fun Edit1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(14.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun EditAddress(modifier: Modifier = Modifier) {
    RelayText(
        content = "Edit Address",
        fontSize = 12.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun EditAdress(
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
        padding = PaddingValues(
            start = 12.0.dp,
            top = 6.0.dp,
            end = 12.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        radius = 16.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 162,
            green = 162,
            blue = 162
        ),
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Stroke10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_10),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.768310546875.dp,
                top = 7.56793212890625.dp,
                end = 2.7412734031677246.dp,
                bottom = 2.5879008173942566.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.768310546875.dp,
                top = 5.1258087158203125.dp,
                end = 2.7412734031677246.dp,
                bottom = 5.030024230480194.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_12),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.768310546875.dp,
                top = 2.6893386840820312.dp,
                end = 5.345856547355652.dp,
                bottom = 7.466494262218475.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Stroke13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_13),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Document(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(9.721250534057617.dp).requiredHeight(10.739166259765625.dp)
    )
}

@Composable
fun Note(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(14.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun AddNote1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add Note",
        fontSize = 12.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 48,
            green = 48,
            blue = 48
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun AddNote(
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
        padding = PaddingValues(
            start = 12.0.dp,
            top = 6.0.dp,
            end = 12.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 4.0,
        clipToParent = false,
        radius = 16.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 162,
            green = 162,
            blue = 162
        ),
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Edit(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun DeliveryAddress(
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
fun Deliver1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Deliver",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Deliver(
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
            start = 24.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(153.0.dp)
    )
}

@Composable
fun PickUp(modifier: Modifier = Modifier) {
    RelayText(
        content = "Pick Up",
        fontSize = 16.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 36,
            green = 36,
            blue = 36
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Pickup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 237,
            green = 237,
            blue = 237
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(153.0.dp)
    )
}

@Composable
fun Type(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 237,
            green = 237,
            blue = 237
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 4.0.dp),
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun Stroke14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.order_stroke_14),
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
fun Icon5(
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
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
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
        content = "Order",
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
fun Order(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.SpaceBetween,
        arrangement = RelayContainerArrangement.Row,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(188.0.dp)
    )
}

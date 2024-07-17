package com.varughese.coffee

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.varughese.coffee.home.sora
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.ColumnScopeInstanceImpl.weight
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.varughese.coffee.R

@Composable
fun HomeScreen(navController: NavHostController) {
    RelayContainer {
        Home(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

/**
 * This composable was generated from the UI Package 'home'.
 * Generated code; do not edit directly
 */
@Composable
fun Home(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier.fillMaxSize()) {
        ButtonIcon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Home {
                IconlyBulkHome {
                    Home1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.5.dp,
                                y = 2.0.dp
                            )
                        )
                    ) {
                        Home2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
                Dot()
            }
            Icon {
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
            Icon1 {
                Bag(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.0.dp,
                            y = 2.00030517578125.dp
                        )
                    )
                ) {
                    Group4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 4.539794921875.dp
                            )
                        )
                    ) {
                        Clip3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                    Fill5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Fill6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Fill8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Icon2 {
                Notification(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 3.00006103515625.dp,
                            y = 1.0.dp
                        )
                    )
                ) {
                    Group5 {
                        Clip4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                    Fill7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
        }
        Category(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -1.0.dp
                )
            )
        ) {
            Category1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                Category2 {
                    AllCoffee {
                        AllCoffee1()
                    }
                    Machiato {
                        Macchiato()
                    }
                    Latte {
                        Latte1()
                    }
                    Americano {
                        Americano1()
                    }
                }
                ProductCategory {
                    Product {
                        ImageRating {
                            Image(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 0.0.dp,
                                        y = 0.0.dp
                                    )
                                )
                            ) {
                                ImageCoffee2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Detail {
                            Text {
                                CaffeMocha()
                                DeepFoam()
                            }
                            ButtonAddItem {
                                Class453()
                                Icon3 {
                                    IconAddPlus {
                                        Add {
                                            Vector(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = -0.75.dp,
                                                        y = -0.75.dp
                                                    )
                                                ).rowWeight(1.0f).columnWeight(1.0f)
                                            )
                                            Vector1(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = -0.75.dp,
                                                        y = -0.75.dp
                                                    )
                                                ).rowWeight(1.0f).columnWeight(1.0f)
                                            )
                                            Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Product1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 171.0.dp,
                                y = 0.0.dp
                            )
                        )
                    ) {
                        ImageRating1 {
                            Image1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 0.0.dp,
                                        y = 0.0.dp
                                    )
                                )
                            ) {
                                ImageCoffee3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Detail1 {
                            Text1 {
                                FlatWhite()
                                Espresso()
                            }
                            ButtonAddItem1 {
                                Class353()
                                Icon4 {
                                    IconAddPlus1 {
                                        Add1 {
                                            Vector3(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = -0.75.dp,
                                                        y = -0.75.dp
                                                    )
                                                ).rowWeight(1.0f).columnWeight(1.0f)
                                            )
                                            Vector4(
                                                modifier = Modifier.boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = -0.75.dp,
                                                        y = -0.75.dp
                                                    )
                                                ).rowWeight(1.0f).columnWeight(1.0f)
                                            )
                                            Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Product2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 171.0.dp,
                                y = 262.0.dp
                            )
                        )
                    ) {
                        ImageRating2 {
                            Image2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 0.0.dp,
                                        y = 0.0.dp
                                    )
                                )
                            ) {
                                ImageCoffee4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Detail2 {
                            Text2 {
                                CaffePanna()
                                IceHot()
                            }
                            ButtonAddItem2 {
                                Class553()
                                Icon5 {
                                    IconAddPlus2 {
                                        Add2 {
                                            Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                            Vector7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                            Vector8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Product3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 262.0.dp
                            )
                        )
                    ) {
                        ImageRating3 {
                            Image3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 0.0.dp,
                                        y = 0.0.dp
                                    )
                                )
                            ) {
                                ImageCoffee5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                        Detail3 {
                            Text3 {
                                MochaFusi()
                                IceHot1()
                            }
                            ButtonAddItem3 {
                                Class753()
                                Icon6 {
                                    IconAddPlus3 {
                                        Add3 {
                                            Vector9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                            Vector10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                            Vector11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Top {
            Container(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            BOGOPromoBanner(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 211.0.dp
                    )
                )
            ) {
                BannerRectangle(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Banner1Img(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                DetailPromo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 24.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    PromoBanner {
                        Promo()
                    }
                    Text4 {
                        Line(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 54.0.dp
                                )
                            )
                        )
                        Line1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 15.0.dp
                                )
                            )
                        )
                        BuyOneGetOneFREE(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 1.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                    }
                }
            }
            LocationProfile(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 24.0.dp,
                        y = 68.0.dp
                    )
                )
            ) {
                Location {
                    Location1()
                    YourLocation {
                        ChicagoIllinois()
                        Icon7 {
                            ArrowDown2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 2.479156494140625.dp,
                                        y = 4.520843505859375.dp
                                    )
                                )
                            ) {
                                Stroke1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                }
            }
            SearchBar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 24.0.dp,
                        y = 135.0.dp
                    )
                )
            ) {
                Search {
                    Icon8 {
                        Search1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 1.666656494140625.dp,
                                    y = 1.666656494140625.dp
                                )
                            )
                        ) {
                            Group6 {
                                Clip5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                            Group7(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 12.699951171875.dp,
                                        y = 13.089111328125.dp
                                    )
                                )
                            ) {
                                Clip6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                Fill9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            }
                        }
                    }
                    SearchCoffee()
                }
            }
        }
    }
}

@Preview(widthDp = 480, heightDp = 800)
@Composable
private fun HomePreview() {
    MaterialTheme {
        RelayContainer {
            Home(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Home2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_home),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Home1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(19.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun IconlyBulkHome(
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
fun Dot(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_dot),
        modifier = modifier.requiredWidth(10.0.dp).requiredHeight(5.0.dp)
    )
}

@Composable
fun Home(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        itemSpacing = 6.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
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
        vector = painterResource(R.drawable.home_fill_4),
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
fun Icon(
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
fun Clip3(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Group4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(19.58588409423828.dp).requiredHeight(16.18160057067871.dp)
    )
}

@Composable
fun Fill5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_fill_5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.688812255859375.dp,
                top = 0.0.dp,
                end = 4.738071441650391.dp,
                bottom = 14.901401042938232.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Fill6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_fill_6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.947296142578125.dp,
                top = 8.82391357421875.dp,
                end = 6.115587949752808.dp,
                bottom = 10.39748764038086.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Fill8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_fill_8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.1171875.dp,
                top = 8.82391357421875.dp,
                end = 11.945696592330933.dp,
                bottom = 10.39748764038086.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Bag(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(19.58588409423828.dp).requiredHeight(20.72140121459961.dp)
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
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Clip4(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Group5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(18.49691390991211.dp).requiredHeight(17.347999572753906.dp)
    )
}

@Composable
fun Fill7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_fill_7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.01678466796875.dp,
                top = 18.856842041015625.dp,
                end = 6.111278057098389.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Notification(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(18.49691390991211.dp).requiredHeight(21.5.dp)
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
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun ButtonIcon(
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 56.0,
        content = content,
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(99.0.dp)
    )
}

@Composable
fun AllCoffee1(modifier: Modifier = Modifier) {
    RelayText(
        content = "All Coffee",
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
fun AllCoffee(
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
            start = 8.0.dp,
            top = 4.0.dp,
            end = 8.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Macchiato(modifier: Modifier = Modifier) {
    RelayText(
        content = "Macchiato",
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
fun Machiato(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 4.0.dp,
            end = 8.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Latte1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Latte",
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
fun Latte(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 4.0.dp,
            end = 8.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Americano1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Americano",
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
fun Americano(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 4.0.dp,
            end = 8.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Category2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        scrollable = true,
        itemSpacing = 16.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun ImageCoffee2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_image_coffee_2),
        radius = 12.0,
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
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun ImageRating(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun CaffeMocha(modifier: Modifier = Modifier) {
    RelayText(
        content = "Caffe Mocha",
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
fun Class453(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 4.53",
        fontSize = 18.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 5,
            green = 5,
            blue = 5
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(76.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector),
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
    RelayVector(
        vector = painterResource(R.drawable.home_vector1),
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
fun Vector2(modifier: Modifier = Modifier) {
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
fun IconAddPlus(
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
            red = 198,
            green = 124,
            blue = 78
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun ButtonAddItem(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 32.0,
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
fun Product(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 8.0.dp,
            end = 8.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun ImageCoffee3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_image_coffee_3),
        radius = 12.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun ImageRating1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun FlatWhite(modifier: Modifier = Modifier) {
    RelayText(
        content = "Flat White",
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
fun Espresso(modifier: Modifier = Modifier) {
    RelayText(
        content = "Espresso",
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
fun Text1(
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
fun Class353(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 3.53",
        fontSize = 18.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 5,
            green = 5,
            blue = 5
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(76.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector2),
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
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector3),
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
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Add1(
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
fun IconAddPlus1(
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
            red = 198,
            green = 124,
            blue = 78
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun ButtonAddItem1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 32.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Detail1(
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
fun Product1(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 8.0.dp,
            end = 8.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun ImageCoffee4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_image_coffee_4),
        radius = 12.0,
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun ImageRating2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun CaffePanna(modifier: Modifier = Modifier) {
    RelayText(
        content = "Caffe Panna",
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
fun Class553(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 5.53",
        fontSize = 18.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 5,
            green = 5,
            blue = 5
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(76.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector4),
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
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector5),
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
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Add2(
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
fun IconAddPlus2(
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
fun Icon5(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun ButtonAddItem2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 32.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Detail2(
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
fun Product2(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 8.0.dp,
            end = 8.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun ImageCoffee5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_image_coffee_5),
        radius = 12.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun ImageRating3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(140.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun MochaFusi(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mocha Fusi",
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
fun IceHot1(modifier: Modifier = Modifier) {
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
fun Class753(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$ 7.53",
        fontSize = 18.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 5,
            green = 5,
            blue = 5
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(76.0.dp)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector6),
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
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_vector7),
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
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Add3(
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
fun IconAddPlus3(
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
fun Icon6(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun ButtonAddItem3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 32.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Detail3(
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
fun Product3(
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
        padding = PaddingValues(
            start = 8.0.dp,
            top = 8.0.dp,
            end = 8.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun ProductCategory(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(327.0.dp).requiredHeight(500.0.dp)
    )
}

@Composable
fun Category1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        scrollable = true,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.width(IntrinsicSize.Min)
    )
}

@Composable
fun Category(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(436.0.dp)
    )
}

@Composable
fun Container(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_container),
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun BannerRectangle(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(400.0.dp).requiredHeight(140.0.dp))
}

@Composable
fun Banner1Img(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_banner_1_img),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(140.0.dp)
    )
}

@Composable
fun Promo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Promo",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2599999564034599.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun PromoBanner(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 236,
            green = 80,
            blue = 80
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 6.0.dp,
            top = 4.0.dp,
            end = 6.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_line),
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun Line1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_line1),
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(27.0.dp)
    )
}

@Composable
fun BuyOneGetOneFREE(modifier: Modifier = Modifier) {
    RelayText(
        content = "Buy one get one FREE",
        fontSize = 32.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2599999904632568.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(203.0.dp)
    )
}

@Composable
fun Text4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(204.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun DetailPromo(
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
fun BOGOPromoBanner(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(327.0.dp).requiredHeight(140.0.dp)
    )
}

@Composable
fun Location1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Location",
        fontSize = 12.0.sp,
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 162,
            green = 162,
            blue = 162
        ),
        height = 1.2000000762939453.em,
        letterSpacing = 0.12.sp,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun ChicagoIllinois(modifier: Modifier = Modifier) {
    RelayText(
        content = "Chicago, Illinois",
        fontFamily = sora,
        color = Color(
            alpha = 255,
            red = 216,
            green = 216,
            blue = 216
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Stroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_stroke_1),
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
        modifier = modifier.requiredWidth(9.041666030883789.dp).requiredHeight(4.958333492279053.dp)
    )
}

@Composable
fun Icon7(
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
fun YourLocation(
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
fun Location(
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
fun LocationProfile(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 122.0,
        clipToParent = false,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min)
    )
}

@Composable
fun Clip5(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Group6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.230669021606445.dp).requiredHeight(16.230833053588867.dp)
    )
}

@Composable
fun Clip6(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Fill9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_fill_9),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(4.186708450317383.dp).requiredHeight(4.178958892822266.dp)
    )
}

@Composable
fun Search1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.886667251586914.dp).requiredHeight(17.268083572387695.dp)
    )
}

@Composable
fun Icon8(
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
fun SearchCoffee(modifier: Modifier = Modifier) {
    RelayText(
        content = "Search coffee",
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
fun Search(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 42,
            green = 42,
            blue = 42
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 12.0,
        content = content,
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(327.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Top(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(375.0.dp).requiredHeight(280.0.dp)
    )
}

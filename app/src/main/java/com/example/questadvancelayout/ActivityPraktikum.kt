package com.example.questadvancelayout

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign

val PlusJakartaSans = FontFamily(
    Font(R.font.plusjakartasans_light, FontWeight.Light),
    Font(R.font.plusjakartasans_regular, FontWeight.Normal),
    Font(R.font.plusjakartasans_medium, FontWeight.Medium),
    Font(R.font.plusjakartasans_bold, FontWeight.Bold)
)

@Composable
fun ActivityPraktikum (modifier: Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.blue)
    ) {
        Column (modifier = Modifier
            .padding(top = 80.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val gambar1 = painterResource(id = R.drawable.profil_kereta)
            Image(painter = gambar1,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 2.dp)
                    .height(height = 160.dp)
                    .border(
                        width = 2.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                    .clip(CircleShape))
            Column() {
                Row(modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally))
                {
                    val icon1 = painterResource(id = R.drawable.instagram_icon)
                    Image(painter = icon1,
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(height = 48.dp)
                            .width(width = 48.dp)
                            .border(
                                width = 2.dp,
                                color = colorResource(id = R.color.orange),
                                shape = CircleShape
                            )
                            .clip(CircleShape))
                    val icon2 = painterResource(id = R.drawable.tiktok_icon)
                    Image(painter = icon2,
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(height = 48.dp)
                            .width(width = 48.dp)
                            .border(
                                width = 2.dp,
                                color = colorResource(id = R.color.orange),
                                shape = CircleShape
                            )
                            .clip(CircleShape))
                    val icon3 = painterResource(id = R.drawable.youtube_icon)
                    Image(painter = icon3,
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(height = 48.dp)
                            .width(width = 48.dp)
                            .border(
                                width = 2.dp,
                                color = colorResource(id = R.color.orange),
                                shape = CircleShape
                            )
                            .clip(CircleShape))
                    val icon4 = painterResource(id = R.drawable.github_icon)
                    Image(painter = icon4,
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(height = 48.dp)
                            .width(width = 48.dp)
                            .border(
                                width = 2.dp,
                                color = colorResource(id = R.color.orange),
                                shape = CircleShape
                            )
                            .clip(CircleShape))
                }
            }
            Text(
                text = stringResource(id = R.string.nama),
                fontSize = 32.sp,
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white)
            )
            Spacer(modifier = Modifier.height(height = 4.dp))
            Text(
                text = stringResource(id = R.string.username),
                fontSize = 20.sp,
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Light,
                color = colorResource(id = R.color.white),
            )
            Spacer(modifier = Modifier.height(height = 12.dp))
            Text(
                text = stringResource(id = R.string.jobs),
                fontSize = 20.sp,
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.white)
            )
            Column(modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Card(modifier = Modifier
                    .height(height = 92.dp)
                    .padding(all = 12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.white)))
                {
                    Row (modifier = Modifier.fillMaxWidth()
                        .padding(all = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        val cardIcon1 = painterResource(id = R.drawable.figma_icon)
                        Image(painter = cardIcon1,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 52.dp)
                                .width(width = 52.dp)
                                .padding(start = 8.dp)
                        )
                        Text(
                            text = "Portofolio",
                            fontSize = 20.sp,
                            fontFamily = PlusJakartaSans,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.blue),
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Left
                        )
                        val icon5 = painterResource(id = R.drawable.right_fill)
                        Image(painter = icon5,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 40.dp)
                                .width(width = 40.dp)
                                .padding(end = 8.dp)
                        )
                    }
                }
                Card(modifier = Modifier
                    .height(height = 92.dp)
                    .padding(all = 12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.white)))
                {
                    Row (modifier = Modifier.fillMaxWidth()
                        .padding(all = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        val cardIcon2 = painterResource(id = R.drawable.gmail_icon)
                        Image(painter = cardIcon2,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 52.dp)
                                .width(width = 52.dp)
                                .padding(start = 8.dp)
                        )
                        Text(
                            text = "Order",
                            fontSize = 20.sp,
                            fontFamily = PlusJakartaSans,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.blue),
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Left
                        )
                        val icon5 = painterResource(id = R.drawable.right_fill)
                        Image(painter = icon5,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 40.dp)
                                .width(width = 40.dp)
                                .padding(end = 8.dp)
                        )
                    }
                }
                Card(modifier = Modifier
                    .height(height = 92.dp)
                    .padding(all = 12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.white)))
                {
                    Row (modifier = Modifier.fillMaxWidth()
                        .padding(all = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        val cardIcon3 = painterResource(id = R.drawable.igc_icon)
                        Image(painter = cardIcon3,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 52.dp)
                                .width(width = 52.dp)
                                .padding(start = 8.dp)
                        )
                        Text(
                            text = "About Me",
                            fontSize = 20.sp,
                            fontFamily = PlusJakartaSans,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.blue),
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Left
                        )
                        val icon5 = painterResource(id = R.drawable.right_fill)
                        Image(painter = icon5,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 40.dp)
                                .width(width = 40.dp)
                                .padding(end = 8.dp)
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(height = 48.dp)
                        .width(width = 140.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.orange)
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(all = 2.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val cardIcon3 = painterResource(id = R.drawable.left_fill)
                        Image(
                            painter = cardIcon3,
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(height = 32.dp)
                                .width(width = 32.dp)
                        )
                        Text(
                            text = "Back",
                            fontSize = 20.sp,
                            fontFamily = PlusJakartaSans,
                            fontWeight = FontWeight.Medium,
                            color = colorResource(id = R.color.blue)
                        )
                    }
                }
            }

            Text(
                text = stringResource(id = R.string.copy),
                fontSize = 12.sp,
                fontFamily = PlusJakartaSans,
                fontWeight = FontWeight.Light,
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Center
            )
        }
    }
}
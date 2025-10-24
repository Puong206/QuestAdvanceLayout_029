package com.example.questadvancelayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


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
            val gambar = painterResource(id = R.drawable.profil_kereta)
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(all = 10.dp)
                    .height(height = 160.dp)
                    .border(
                        width = 2.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                    .clip(CircleShape))
            Spacer(modifier = Modifier.height(height = 8.dp))
            Text(
                text = stringResource(id = R.string.nama),
                fontSize = 32.sp,
                color = colorResource(id = R.color.white),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(height = 4.dp))
            Text(
                text = stringResource(id = R.string.username),
                fontSize = 20.sp,
                color = colorResource(id = R.color.white),
            )
        }
    }
}
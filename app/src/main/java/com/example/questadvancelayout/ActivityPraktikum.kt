package com.example.questadvancelayout

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
import androidx.compose.foundation.background
import androidx.compose.material3.Text

@Composable
fun ActivityPraktikum (modifier: Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.blue)
    ) {
        Column (modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.nama),
                fontSize = 32.sp,
                color = colorResource(id = R.color.white),
                fontWeight = FontWeight.Bold
            )
        }
    }
}
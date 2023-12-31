package com.example.ucp2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ucp2.ui.theme.Ucp2Theme


@Composable
fun HalamanHome(
    onNextButtonClicked: () -> Unit
){
    val image = painterResource(id =  R.drawable.logoumy)
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .weight(1f, false),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Button(
                modifier = Modifier.weight(1f),
                onClick = onNextButtonClicked
            )
            {
                Text(stringResource(R.string.next))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun halamhomeprev() {
    Ucp2Theme {
        HalamanHome {

        }
    }
}
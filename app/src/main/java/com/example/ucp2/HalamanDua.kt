package com.example.ucp2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ucp2.ui.data.FormUIState
import com.example.ucp2.ui.theme.Ucp2Theme

@Composable
fun HalamanDua(
    formUIState: FormUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama), formUIState.nama),
        Pair(stringResource(id = R.string.nim), formUIState.nim),
        Pair(stringResource(id = R.string.konsen), formUIState.konsen),
        Pair(stringResource(id = R.string.judul), formUIState.judul),
        Pair(stringResource(id = R.string.dospen1), formUIState.dospem1),
        Pair(stringResource(id = R.string.dospen2), formUIState.dospem2)
    )

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(stringResource(id = R.string.nama))
                Text(text = formUIState.nama)
            }
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(stringResource(id = R.string.nim))
                Text(text = formUIState.nim)
            }
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(stringResource(id = R.string.konsen))
                Text(text = formUIState.konsen)
            }
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(text = item.second.toString(), fontWeight = FontWeight.Bold)
                }
                Divider()
            }
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(text = item.second.toString(), fontWeight = FontWeight.Bold)
                }
                Divider()
            }

        }
        Row(
            modifier = Modifier
                .weight(1f, false)
                .padding(8.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Button(modifier = Modifier.fillMaxWidth(),onClick = {}) {
                    Text(stringResource(R.string.back))
                }
                OutlinedButton(modifier = Modifier.fillMaxWidth(),onClick = onCancelButtonClicked) {
                    Text(stringResource(R.string.back))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun halamandatuprev() {
    Ucp2Theme {
        HalamanDua()
    }
}
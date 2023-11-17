package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ucp2.ui.theme.Ucp2Theme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSelectionChanged: (String) -> Unit,
    pilihandospem1: List<String>,
    pilihandospem2: List<String>,
){
    var nama  by rememberSaveable {
        mutableStateOf("")
    }
    var nim by rememberSaveable {
        mutableStateOf("")
    }
    var konsen by rememberSaveable {
        mutableStateOf("")
    }
    var judul by remember {
        mutableStateOf("")
    }
    var dospem1 by remember {
        mutableStateOf("")
    }
    var dospem2 by remember {
        mutableStateOf("")
    }

    var listData : MutableList<String> = mutableListOf(nama, nim, konsen, judul)
    Column(modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Formulir Pengajuan Skripsi",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            OutlinedTextField(
                value = nama,
                onValueChange ={nama = it},
                label = { Text(stringResource(R.string.nama))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Prab")}
            )
            OutlinedTextField(
                value = nim,
                onValueChange ={nim = it},
                label = { Text(stringResource(R.string.nim))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = konsen,
                onValueChange ={konsen = it},
                label = { Text(stringResource(R.string.konsen))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = judul,
                onValueChange ={judul = it},
                label = { Text(stringResource(R.string.judul))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
            )
            Row {
                pilihandospem1.forEach { item ->
                    Row(
                        modifier = Modifier.selectable(
                            selected = dospem1 == item,
                            onClick = {
                                dospem1 = item
                                onSelectionChanged(item)
                            }
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(selected = dospem1 == item, onClick = {
                            dospem1 = item
                            onSelectionChanged(item)
                        }
                        )
                        Text(item)
                    }
                }
                pilihandospem2.forEach { item ->
                    Row(
                        modifier = Modifier.selectable(
                            selected = dospem2 == item,
                            onClick = {
                                dospem2 = item
                                onSelectionChanged(item)
                            }
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(selected = dospem2 == item, onClick = {
                            dospem2 = item
                            onSelectionChanged(item)
                        }
                        )
                        Text(item)
                    }
                }
            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun halamansatuprev() {
    Ucp2Theme {
        HalamanSatu()
    }
}
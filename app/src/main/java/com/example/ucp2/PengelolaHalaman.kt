package com.example.ucp2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

enum class PengelolaHalaman {
    Home,
    Summary,
    Form
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PenglolaHalama(
    viewModel: FormViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    Scaffold {
            innerPadding ->
        val uiState by viewModel.stateUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Home.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = PengelolaHalaman.Home.name) {
                HalamanHome(onNextButtonClicked = {

                    navController.navigate(PengelolaHalaman.Form.name)
                }
                )
            }
        }
    }
}
package com.example.ucp2

import androidx.lifecycle.ViewModel
import com.example.ucp2.ui.data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FormViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()

    fun setDospem1(dos1Pilihan: String){
        _stateUI.update {stateSaatIni ->
            stateSaatIni.copy(dospem1 = dos1Pilihan)
        }
    }

    fun setDospem2(dos2Pilihan: String){
        _stateUI.update {stateSaatIni ->
            stateSaatIni.copy(dospem2 = dos2Pilihan)
        }
    }

    fun setContact(ListContact : MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = ListContact[0],
                nim = ListContact[1],
                konsen = ListContact[2],
                judul = ListContact[3]
            )
        }
    }
}
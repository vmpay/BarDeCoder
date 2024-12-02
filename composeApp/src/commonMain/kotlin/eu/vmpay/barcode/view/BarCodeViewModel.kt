package eu.vmpay.barcode.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BarCodeViewModel(
    private val countryMap: Map<Int, Pair<String, String>>,
) : ViewModel() {
    private val _uiState = MutableStateFlow<BarCodeUiState>(BarCodeUiState.Initial(input = ""))
    val uiState: StateFlow<BarCodeUiState> = _uiState.asStateFlow()

    fun handleInput(inputCode: String) {
        // TODO sanitize input
        _uiState.update {
            if (inputCode.length < 3) {
                BarCodeUiState.Initial(input = inputCode)
            } else {
                countryMap[inputCode.toIntOrNull()]
                    ?.let {
                        BarCodeUiState.Success(
                            input = inputCode,
                            output = it.toString(),
                        )
                    }
                    ?: BarCodeUiState.NotFoundError(inputCode)
            }
        }
    }
}
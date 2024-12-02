package eu.vmpay.barcode.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BarCodeViewModel(
    private val countryMap: Map<String, Pair<String, String>>,
) : ViewModel() {
    private val _uiState = MutableStateFlow<BarCodeUiState>(BarCodeUiState.Initial(input = ""))
    val uiState: StateFlow<BarCodeUiState> = _uiState.asStateFlow()

    fun handleInput(inputCode: String) {
        val sanitizedInput = inputCode.filter { it.isDigit() }
        _uiState.update {
            if (sanitizedInput.length < 3) {
                BarCodeUiState.Initial(input = sanitizedInput)
            } else {
                countryMap[sanitizedInput.take(3)]
                    ?.let {
                        BarCodeUiState.Success(
                            input = sanitizedInput,
                            output = it.toString(),
                        )
                    }
                    ?: BarCodeUiState.NotFoundError(sanitizedInput)
            }
        }
    }

    fun onCameraClick() {
        _uiState.update { BarCodeUiState.Recognise }
    }
}
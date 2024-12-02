package eu.vmpay.barcode.view

sealed class BarCodeUiState {
    data class Initial(val input: String) : BarCodeUiState()
    data class Success(
        val input: String,
        val output: String,
    ) : BarCodeUiState()
    data class NotFoundError(val input: String) : BarCodeUiState()
    data object Recognise : BarCodeUiState()
}
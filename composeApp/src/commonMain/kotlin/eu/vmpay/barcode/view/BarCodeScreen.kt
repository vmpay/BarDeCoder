package eu.vmpay.barcode.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun BarCodeScreen(
    viewModel: BarCodeViewModel,
) {
    val uiState by viewModel.uiState.collectAsState()
    BarCodeScreen(
        uiState = uiState,
        onValueChange = viewModel::handleInput,
    )
}

@Composable
private fun BarCodeScreen(
    uiState: BarCodeUiState,
    onValueChange: (String) -> Unit,
) {
    val (input, country) = when (uiState) {
        is BarCodeUiState.Initial -> uiState.input to ""
        is BarCodeUiState.NotFoundError -> uiState.input to "Not Found"
        is BarCodeUiState.Success -> uiState.input to uiState.output
    }
    BarCodeView(
        inputCode = input,
        country = country,
        onValueChange = onValueChange,
    )
}

@Composable
private fun BarCodeView(
    inputCode: String = "",
    country: String = "",
    onValueChange: (String) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = inputCode,
            onValueChange = onValueChange,
            label = { Text("Input Code") },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )
        Text(
            text = country,
        )
    }
}

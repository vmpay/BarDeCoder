package eu.vmpay.barcode.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import org.publicvalue.multiplatform.qrcode.CodeType
import org.publicvalue.multiplatform.qrcode.ScannerWithPermissions

@Composable
fun BarCodeScreen(
    viewModel: BarCodeViewModel,
) {
    val uiState by viewModel.uiState.collectAsState()
    BarCodeScreen(
        uiState = uiState,
        onValueChange = viewModel::handleInput,
        onCameraClick = viewModel::onCameraClick,
        onScanned = viewModel::handleInput,
    )
}

@Composable
private fun BarCodeScreen(
    uiState: BarCodeUiState,
    onValueChange: (String) -> Unit,
    onCameraClick: () -> Unit,
    onScanned: (String) -> Unit,
) {
    if (uiState is BarCodeUiState.Recognise) {
        ScannerWithPermissions(
            onScanned = {
                onScanned(it)
                true
            },
            types = listOf(CodeType.EAN13),
        )
    } else {
        val (input, country) = when (uiState) {
            is BarCodeUiState.Initial -> uiState.input to ""
            is BarCodeUiState.NotFoundError -> uiState.input to "Not Found"
            is BarCodeUiState.Success -> uiState.input to uiState.output
            BarCodeUiState.Recognise -> TODO()
        }
        BarCodeView(
            inputCode = input,
            country = country,
            onValueChange = onValueChange,
            onCameraClick = onCameraClick,
        )
    }
}

@Composable
private fun BarCodeView(
    inputCode: String = "",
    country: String = "",
    onValueChange: (String) -> Unit,
    onCameraClick: () -> Unit,
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
            trailingIcon = {
                IconButton(
                    onClick = { onValueChange("") },
                    enabled = inputCode.isNotEmpty(),
                ) {
                    Icon(
                        Icons.Default.Clear,
                        contentDescription = "Clear",
                    )
                }
            },
            leadingIcon = {
                IconButton(
                    onClick = { onCameraClick() },
                ) {
                    Icon(
                        Icons.Default.Face,
                        contentDescription = "Recognise",
                    )
                }
            }
        )
        Text(
            text = country,
        )
    }
}

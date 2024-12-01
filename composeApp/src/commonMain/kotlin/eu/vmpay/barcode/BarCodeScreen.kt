package eu.vmpay.barcode

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun BarCodeScreen() {
    var inputCode by remember { mutableStateOf("") }
    var outputCode by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = inputCode,
            onValueChange = {
                inputCode = it
                outputCode = handleInput(it)
            },
            label = { Text("Input Code") },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )
        Text(
            text = outputCode,
        )
    }
}

private fun handleInput(inputCode: String): String {
    return if (inputCode.isBlank()) ""
    else (countryMap[inputCode.toIntOrNull()] ?: "").toString()
}
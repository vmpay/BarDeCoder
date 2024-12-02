package eu.vmpay.barcode

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import eu.vmpay.barcode.view.BarCodeScreen
import eu.vmpay.barcode.view.BarCodeViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = BarCodeViewModel(countryMap = countryMap)
        BarCodeScreen(viewModel = viewModel)
    }
}
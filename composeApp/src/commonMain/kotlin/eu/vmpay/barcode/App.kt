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
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting")
//                }
//            }
//        }
        val viewModel = BarCodeViewModel(countryMap = countryMap)
        BarCodeScreen(viewModel = viewModel)
    }
}
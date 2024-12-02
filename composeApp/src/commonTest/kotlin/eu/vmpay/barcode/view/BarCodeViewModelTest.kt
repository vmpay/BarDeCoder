import eu.vmpay.barcode.countryMap
import eu.vmpay.barcode.view.BarCodeUiState
import eu.vmpay.barcode.view.BarCodeViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class BarCodeViewModelTest {

    private lateinit var viewModel: BarCodeViewModel

    @BeforeTest
    fun setup() {
        viewModel = BarCodeViewModel(countryMap)
    }

    @Test
    fun `initial state is correct`() = runBlocking {
        val initialState = viewModel.uiState.first()
        assertEquals(BarCodeUiState.Initial(input = ""), initialState)
    }

    @Test
    fun `handleInput with input less than 3 digits`() = runBlocking {
        viewModel.handleInput("12")
        val state = viewModel.uiState.first()
        assertEquals(BarCodeUiState.Initial(input = "12"), state)
    }

    @Test
    fun `handleInput with valid code in countryMap`() = runBlocking {
        viewModel.handleInput("12345")
        val state = viewModel.uiState.first()
        assertEquals(
            BarCodeUiState.Success(
                input = "12345",
                output = "USA\n" +
                        "\n" +
                        "\n" +
                        "\uD83C\uDDFA\uD83C\uDDF8"
            ),
            state
        )
    }

    @Test
    fun `handleInput with code not in countryMap`() = runBlocking {
        viewModel.handleInput("999")
        val state = viewModel.uiState.first()
        assertEquals(BarCodeUiState.NotFoundError(input = "999"), state)
    }

    @Test
    fun `handleInput sanitizes input`() = runBlocking {
        viewModel.handleInput("123abc")
        val state = viewModel.uiState.first()
        assertEquals(
            BarCodeUiState.Success(
                input = "123",
                output = "USA\n" +
                        "\n" +
                        "\n" +
                        "\uD83C\uDDFA\uD83C\uDDF8"
            ),
            state
        )
    }

    @Test
    fun `onCameraClick sets Recognise state`() = runBlocking {
        viewModel.onCameraClick()
        val state = viewModel.uiState.first()
        assertEquals(BarCodeUiState.Recognise, state)
    }
}

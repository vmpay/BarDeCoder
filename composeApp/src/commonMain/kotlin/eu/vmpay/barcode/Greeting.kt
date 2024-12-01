package eu.vmpay.barcode

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!\n${countryMap[1]}"
    }
}
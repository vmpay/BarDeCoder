package eu.vmpay.barcode

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
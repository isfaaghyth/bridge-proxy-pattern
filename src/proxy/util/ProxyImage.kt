package proxy.util

import proxy.`interface`.Image

class ProxyImage(var fileName: String): Image {
    private lateinit var realImage: RealImage
    override fun display() {
        realImage = RealImage(fileName)
        realImage.display()
    }
}
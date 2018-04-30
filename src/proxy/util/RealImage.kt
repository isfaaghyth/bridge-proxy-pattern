package proxy.util

import proxy.`interface`.Image

class RealImage(private var fileName: String) : Image {

    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying: ${fileName}")
    }

    private fun loadFromDisk(fileName: String) {
        println("Loading Cache: ${fileName}")
    }

}
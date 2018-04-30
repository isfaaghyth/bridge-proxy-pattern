package proxy

import proxy.`interface`.Image
import proxy.util.ProxyImage

fun main(args: Array<String>) {
    val image: Image = ProxyImage("isfaganteng.png")
    image.display()
    println()
    image.display()
}
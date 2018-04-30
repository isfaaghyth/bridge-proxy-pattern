package bridge

import bridge.abstraction.Shape
import bridge.circles.GreenCircle
import bridge.circles.RedCircle
import bridge.util.Circle

fun main(args: Array<String>) {
    val redCircle: Shape = Circle(100, 100, 10, RedCircle())
    val greenCircle: Shape = Circle(100, 100, 10, GreenCircle())
    //implementasi
    redCircle.draw()
    greenCircle.draw()
}

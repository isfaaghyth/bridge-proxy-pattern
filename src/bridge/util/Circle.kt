package bridge.util

import bridge.abstraction.Shape

class Circle(var x: Int,
             var y: Int,
             var radius: Int,
             override var drawAPI: DrawAPI): Shape(drawAPI) {

    override fun draw() {
        drawAPI.drawCircle(radius,x,y)
    }

}
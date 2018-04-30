package abstraction

import util.DrawAPI

abstract class Shape(drawAPI: DrawAPI) {
    protected lateinit var drawAPI: DrawAPI
    abstract fun draw()
}
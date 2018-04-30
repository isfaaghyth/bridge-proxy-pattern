package bridge.abstraction

import bridge.util.DrawAPI

abstract class Shape(drawAPI: DrawAPI) {
    protected open val drawAPI: DrawAPI?=null
    abstract fun draw()
}
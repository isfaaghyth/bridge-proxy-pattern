package bridge.circles

import bridge.util.DrawAPI

class RedCircle: DrawAPI {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Membuat lingkaran warna merah dengan radius ${radius} dan x ${x} serta y ${y}")
    }

}
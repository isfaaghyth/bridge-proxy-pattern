package bridge.circles

import bridge.util.DrawAPI

class GreenCircle: DrawAPI {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Membuat lingkaran warna hijau dengan radius ${radius} dan x ${x} serta y ${y}")
    }

}
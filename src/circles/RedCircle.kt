package circles

import util.DrawAPI

class RedCircle: DrawAPI {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        System.out.println("Membuat lingkaran warna merah dengan radius ${radius} dan x ${x} serta y ${y}")
    }

}
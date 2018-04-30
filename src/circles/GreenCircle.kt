package circles

import util.DrawAPI

class GreenCircle: DrawAPI {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        System.out.println("Membuat lingkaran warna hijau dengan radius ${radius} dan x ${x} serta y ${y}")
    }

}
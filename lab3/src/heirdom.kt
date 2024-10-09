//полиморфизм
open class Soldat {
    var Surename: String = ""
    var Height: Double = 0.0
    var Weight: Double = 0.0

    open fun Qfun(height: Double = 0.0, weight: Double = 0.0): Double {
        return height * weight
    }

}

class miniSoldat : Soldat() {
    var degree: Int = 0



    override fun Qfun(height: Double, weight: Double): Double {
        if (degree == 1) {
            return 0.5 * super.Qfun(height, weight)
        } else if (degree == 2) {
            return super.Qfun(height, weight)
        } else {
            return 2 * super.Qfun(height, weight)
        }
    }

}

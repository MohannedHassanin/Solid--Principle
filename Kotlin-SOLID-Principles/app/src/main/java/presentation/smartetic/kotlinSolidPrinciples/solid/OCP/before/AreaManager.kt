package presentation.smartetic.kotlinSolidPrinciples.solid.OCP.before

class AreaManager {

    fun calculateArea(vararg shapes: Any?): Double {
        var area = 0.0
        for (shape in shapes) {
            if (shape is Rectangle) {
                val (length, height) = shape as Rectangle
                area += length * height
            } else if (shape is Circle) {
                val (radius) = shape as Circle
                area += radius * shape.radius * Math.PI
            } else {
                throw RuntimeException("Shape not supported")
            }
        }
        return area
    }
}


package presentation.smartetic.kotlinSolidPrinciples.solid.OCP.after

/**
 *
 * We’ve made changes to the AreaManager that allow it to be closed for modification but open for extension. If we need to add a new shape
 * , such as triangle, the AreaManager will not need to be changed because it is open for extension through the Shape interface
 */

class AreaManager {

    fun calculateArea(vararg shapes: ArrayList<Shape?>?): Double {
        var area = 0.0
        for (shapeList in shapes) {
            shapeList?.forEach { shape ->
                if (shape != null) {
                    area += shape.getArea()
                }
            }
        }
        return area
    }
}

package presentation.smartetic.kotlinSolidPrinciples.solid.OCP.after

data class Rectangle(val length: Double, val height: Double) :Shape {


    override fun getArea(): Double {
       return (length * height)
    }
}
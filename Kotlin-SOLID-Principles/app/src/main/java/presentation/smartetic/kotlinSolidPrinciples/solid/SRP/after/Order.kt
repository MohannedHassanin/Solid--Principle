package presentation.smartetic.kotlinSolidPrinciples.solid.SRP.after

data class Order(val orderNumber: Int = 0, val totalNumber: Int = 0, val lineItems: List<LineItem>)

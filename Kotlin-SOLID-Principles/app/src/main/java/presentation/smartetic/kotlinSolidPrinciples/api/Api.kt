package presentation.smartetic.kotlinSolidPrinciples.api

import presentation.smartetic.kotlinSolidPrinciples.solid.LSP.before.Customer

class Api {
    private val customerIds =
    listOf(
    Customer(1, "Mohanned Hassanin"),
    Customer(2, "Hussam Kassab"),
    Customer(3, "Safa'a Moner")
    )
    fun getWholeLottaCustomers(ids: List<Int?>?): List<Customer> {
        return customerIds
    }

}
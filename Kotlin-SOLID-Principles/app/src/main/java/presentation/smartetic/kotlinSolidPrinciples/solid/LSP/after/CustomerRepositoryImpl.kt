package presentation.smartetic.kotlinSolidPrinciples.solid.LSP.after

import presentation.smartetic.kotlinSolidPrinciples.api.Api
import presentation.smartetic.kotlinSolidPrinciples.solid.LSP.before.Customer


interface CustomerRepository {
    fun getCustomersWithIds(ids: List<Int?>?): List<Customer?>?
}

class CustomerRepositoryImpl : CustomerRepository {

    private val api : Api = TODO()

    override fun getCustomersWithIds(ids: List<Int?>?): List<Customer?> {

        // Go to API, DB, etc and get the customers.
        // Go to API, DB, etc and get the customers.
        return api.getWholeLottaCustomers(ids)
    }
}

// Somewhere else in the program
val  customers:List<Customer> = customerRepository.getCustomersWithIds(...)
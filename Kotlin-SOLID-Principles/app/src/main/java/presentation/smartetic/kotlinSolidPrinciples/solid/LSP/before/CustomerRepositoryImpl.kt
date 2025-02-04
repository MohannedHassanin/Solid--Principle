package presentation.smartetic.kotlinSolidPrinciples.solid.LSP.before

interface CustomerRepository {
    fun getCustomersWithIds(ids: List<Int?>?): List<Customer?>?
}

class CustomerRepositoryImpl :CustomerRepository {


    override fun getCustomersWithIds(ids: List<Int?>?): List<Customer?>? {

        // Get the ids somehow (loop, lookup, etc)
        val ids: Collection<Int> = getCustomerIds()
        val customers: List<Customer> =
            customerRepository.getCustomersWithIds(ids)

    }
}
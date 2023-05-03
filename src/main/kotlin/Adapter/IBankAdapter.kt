package Adapter

interface IBankAdapter {
    fun sendCreditRequest( request: BankCreditRequest): BankCreditResponse
}

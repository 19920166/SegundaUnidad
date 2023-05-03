package Adapter

interface YBankCreditSenderListener {
    fun notifyCreditResult(result: YBankCreditApproveResult?)
}
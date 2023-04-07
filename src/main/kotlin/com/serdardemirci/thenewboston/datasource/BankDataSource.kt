package com.serdardemirci.thenewboston.datasource

import com.serdardemirci.thenewboston.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String) : Bank
    fun createBank(bank: Bank): Bank
}
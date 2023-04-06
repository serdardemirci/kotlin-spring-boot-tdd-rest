package com.serdardemirci.thenewboston.datasource.mock

import com.serdardemirci.thenewboston.datasource.BankDataSource
import com.serdardemirci.thenewboston.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.10, 17),
        Bank("1010", 17.0, 0),
        Bank("2121", 0.0, 100),
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}
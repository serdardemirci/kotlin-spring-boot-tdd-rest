package com.serdardemirci.thenewboston.datasource

import com.serdardemirci.thenewboston.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}
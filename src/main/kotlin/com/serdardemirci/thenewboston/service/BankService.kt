package com.serdardemirci.thenewboston.service

import com.serdardemirci.thenewboston.datasource.BankDataSource
import com.serdardemirci.thenewboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}
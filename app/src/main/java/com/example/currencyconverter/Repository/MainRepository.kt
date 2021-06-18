package com.example.currencyconverter.Repository

import com.example.currencyconverter.data.CurrencyResponse
import com.example.currencyconverter.utils.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}
package com.example.currencyconverter.repository

import com.example.currencyconverter.model.CurrencyResponse
import com.example.currencyconverter.utils.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}
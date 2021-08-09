package com.example.currencyconverter.network

import com.example.currencyconverter.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("api_key") api_key:String
        ): Response<CurrencyResponse>

}
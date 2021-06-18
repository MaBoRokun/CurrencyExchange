package com.example.currencyconverter.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("api_key") api_key:String
        ): Response<CurrencyResponse>

}
package com.example.currencyconverter.Repository

import com.example.currencyconverter.data.CurrencyApi
import com.example.currencyconverter.data.CurrencyResponse
import com.example.currencyconverter.utils.Resource
import javax.inject.Inject

class DefaultRepository @Inject constructor(
    private val Api:CurrencyApi
):MainRepository {
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
           val  response = Api.getRates(base)
            val result = response.body()
            if(response.isSuccessful && result !=null){
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }
        }catch (e:Exception){
            Resource.Error(e.message ?:"An error occured")
        }
    }
}
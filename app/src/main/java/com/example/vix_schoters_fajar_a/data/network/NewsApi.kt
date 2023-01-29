package com.example.vix_schoters_fajar_a.data.network

import com.example.vix_schoters_fajar_a.model.Result
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface NewsApi {

    @GET("/v2/top-headlines")
    suspend fun getNews(
        @QueryMap queries: Map<String, String>
    ): Response<Result>
}
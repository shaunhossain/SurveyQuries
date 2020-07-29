package com.shaunhossain.surveyquries.network

import com.shaunhossain.surveyquries.model.Questions
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {

    @GET("/getSurvey")
    suspend fun getQuestion() : Response<Questions>

}
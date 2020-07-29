package com.shaunhossain.surveyquries.repos

import com.shaunhossain.surveyquries.network.RetrofitInstrance

class Repository {

    companion object{
        suspend fun getAllQuestions() = RetrofitInstrance.api.getQuestion()
    }
}
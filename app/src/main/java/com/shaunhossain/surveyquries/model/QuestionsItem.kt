package com.shaunhossain.surveyquries.model

data class QuestionsItem(
    val options: String,
    val question: String,
    val required: Boolean,
    val type: String
)
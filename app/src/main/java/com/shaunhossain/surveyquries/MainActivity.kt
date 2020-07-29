package com.shaunhossain.surveyquries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.shaunhossain.surveyquries.model.QuestionsItem
import com.shaunhossain.surveyquries.repos.Repository.Companion.getAllQuestions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    lateinit var survey: TextView
    lateinit var surveyArray : QuestionsItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        survey = findViewById<TextView>(R.id.questionsView)

        GlobalScope.launch(Dispatchers.IO){

            val Questions = getAllQuestions()
            //survey.text = Questions.body().toString()
            for (qustion in Questions.body()!!){
                surveyArray  = qustion
                Log.d(TAG, surveyArray.toString())
            }

            withContext(Dispatchers.Main) {
                survey.text = surveyArray.toString()
            }
        }
    }
}
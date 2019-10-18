package com.example.lab2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)
        textViewTwo.text=intent.getStringExtra("question")
        buttonTwo.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("answer",editTextTwo.text.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
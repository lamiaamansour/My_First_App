package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var firstNumEditText: EditText
lateinit var secNumEditText: EditText
lateinit var button: Button
lateinit var addTextView: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumEditText = findViewById(R.id.num1)
        secNumEditText = findViewById(R.id.num2)
        button = findViewById(R.id.btn)
        addTextView = findViewById(R.id.add)

        button.setOnClickListener {


            val num1: Int = if (firstNumEditText.text.toString()
                    .isNullOrEmpty()
            ) 0 else firstNumEditText.text.toString().toInt()


            val num2 =
                if (secNumEditText.text.toString().isNotEmpty()) secNumEditText.text.toString()
                    .toInt() else 0

            val res = num1 + num2

            addTextView.text = res.toString()
        }

    }

}
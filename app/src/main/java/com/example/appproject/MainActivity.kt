package com.example.appproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        compareButton.setOnClickListener {
            compareValues()
        }
    }

    private fun compareValues()
    {
        val firstNumber = findViewById<EditText>(R.id.edtNumber)
        val secondNumber = findViewById<EditText>(R.id.edtNumber1)

        if(firstNumber.length() > 0 && secondNumber.length() > 0)
        {
            val first2Integer = Integer.parseInt(firstNumber.text.toString())
            val second2Integer = Integer.parseInt(secondNumber.text.toString())

            when {
                (first2Integer > second2Integer) -> Toast.makeText(this, "First number is great than the second one", Toast.LENGTH_SHORT).show()
                (first2Integer < second2Integer) -> Toast.makeText(this, "First number is less than the second one", Toast.LENGTH_SHORT).show()
                (first2Integer == second2Integer) -> Toast.makeText(this, "First number is equal to the second one", Toast.LENGTH_SHORT).show()
            }
        }
        else Toast.makeText(this, "Something went wrong! Please verify your inputs!", Toast.LENGTH_SHORT).show()
    }
}
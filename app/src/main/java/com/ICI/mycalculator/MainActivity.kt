package com.ICI.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**Image view **/
        val image = findViewById<ImageView>(R.id.imageView)

        /** EditText **/
        val firstNumberEditText = findViewById<EditText>(R.id.first_number)
        val secondNumberEditText = findViewById<EditText>(R.id.editTextNumber)

        /** Buttons **/
        val sumButton = findViewById<Button>(R.id.sum)
        val minusButton = findViewById<Button>(R.id.minus)
        val multiplyButton = findViewById<Button>(R.id.multiply)
        val divideButton = findViewById<Button>(R.id.divide)

        /** Textview **/
        val results = findViewById<TextView>(R.id.results)




        sumButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val sum = firstNumber + secondNumber
            results.setText("The answer is $sum")
        }

        minusButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val minus = firstNumber - secondNumber
            results.setText("The answer is $minus")
        }

        multiplyButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val multiply = firstNumber * secondNumber
            results.setText("The answer is $multiply")
    }

        divideButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val divide = firstNumber / secondNumber
            results.setText("The answer is $divide")


}

}
}






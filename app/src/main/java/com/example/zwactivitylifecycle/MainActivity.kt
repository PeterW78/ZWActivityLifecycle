package com.example.zwactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Activity Life Cycle", "onCreate event called")

        var sayButton: Button = findViewById(R.id.say_button)
        var textBox: TextView = findViewById(R.id.textBox)
        var editText: EditText = findViewById(R.id.editText)

        sayButton.setOnClickListener { view: View ->
            textBox.text = "Hello!"
            editText.setText("Hello!")
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("Activity Life Cycle", "onStart event called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity Life Cycle", "onRestart event called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity Life Cycle", "onResume event called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity Life Cycle", "onPause event called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity Life Cycle", "onStop event called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity Life Cycle", "onDestroy event called")
    }
}
package com.example.firstactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView;
    lateinit var myButton : Button;
    lateinit var myEditText : EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.myText);
        myButton = findViewById(R.id.myButton);
        myEditText = findViewById(R.id.myEditText);
        myButton.setOnClickListener {
            if (myEditText.text.length != 0){
                myText.text = "Hello "+myEditText.text;
            }else{
                myText.text = "Hello DSI31";
            }
        }

    }
}
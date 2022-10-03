package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView;
    lateinit var myButton : Button;
    lateinit var myEditText : EditText;
    lateinit var myImage : ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.myText);
        myButton = findViewById(R.id.myButton);
        myEditText = findViewById(R.id.myEditText);
        myImage = findViewById(R.id.myImage);
        myImage.isVisible = false;
        myButton.setOnClickListener {
            myImage.isVisible=true;
            if (myEditText.text.length != 0){
                myText.text = "Hello "+myEditText.text;
            }else{
                myText.text = "Hello DSI31";
                myImage.setImageResource(R.drawable.img2);
            }
        }

    }
}
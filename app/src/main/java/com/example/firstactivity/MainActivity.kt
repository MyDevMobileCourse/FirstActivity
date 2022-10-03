package com.example.firstactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView;
    lateinit var myButton : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var clicked = false;
        myText = findViewById(R.id.myText);
        myText.visibility = View.INVISIBLE;
        myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener {
            if (!clicked){
                myText.visibility = View.VISIBLE;
                myButton.text = "Hide the text"
                clicked = true;
            }else{
                myText.visibility = View.INVISIBLE;
                myButton.text = "Show text";
                clicked=false;
            }
        }

    }
}
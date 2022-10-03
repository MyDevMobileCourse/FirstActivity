package com.example.firstactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var clicked = false;
        myText = findViewById(R.id.myText);
        myText.setText("This is a text setted by kotlin!");
        myText.setOnClickListener{
            if(!clicked){
                myText.setText("You clicked me");
                myText.setTextColor(Color.WHITE);
                myText.setBackgroundColor(Color.BLACK);
                clicked=true;
            }else{
                myText.setText("You unclicked me");
                myText.setTextColor(Color.RED);
                myText.setBackgroundColor(Color.BLUE);
                clicked=false;
            }
        }
    }
}
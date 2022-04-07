package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void generateRandomNumber(){
        Random rand=new Random();
        randomNumber=rand.nextInt(20)+1;
    }
    int randomNumber;

    public void guessGame(View view){
        EditText guess=(EditText) findViewById(R.id.ansguess);
        int gs = Integer.parseInt(guess.getText().toString());

        String message;

        if(gs<randomNumber){
           message="higher";
        } else if(gs>randomNumber){
            message="lower";
        } else {
            message="correct guess !!!";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Information","Button Pressed");
        Log.i("Guess",guess.getText().toString());
        Log.i("Random Number",Integer.toString(randomNumber));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
package com.example.codeclan.rockpaperscissorsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    Button rockButton;
    Button scissorsButton;
    Button paperButton;
    TextView gameResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

//        rockButton = findViewById(R.id.rock_button);
//        scissorsButton = findViewById(R.id.scissors_button);
//        paperButton = findViewById(R.id.paper_button);

    }

    public void onButtonRockClick(View view){
        String rock = "rock";
    }

    public void onButtonScissorsClick(View view){
        String scissors = "scissors";

    }

    public void onButtonPaperkClick(View view){
        String paper = "paper";

    }




}

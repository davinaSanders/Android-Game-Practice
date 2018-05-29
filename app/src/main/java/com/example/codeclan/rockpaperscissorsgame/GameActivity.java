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
    TextView gameResultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = findViewById(R.id.rock_button);
        scissorsButton = findViewById(R.id.scissors_button);
        paperButton = findViewById(R.id.paper_button);
        gameResultText = findViewById(R.id.game_result);

    }

    public void onButtonRockClick(View view){
        String rock = "rock";
        Game game = new Game();
        gameResultText.setText(game.gameResult(rock));
    }

    public void onButtonScissorsClick(View view){
        String scissors = "scissors";
        Game game = new Game();
        gameResultText.setText(game.gameResult(scissors));

    }

    public void onButtonPaperkClick(View view){
        String paper = "paper";
        Game game = new Game();
        gameResultText.setText(game.gameResult(paper));

    }








}

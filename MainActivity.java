package com.example.water.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//test
    //hi

    //copying and pasting some code

    private TextView ourScore;
    private TextView opponentScore;
    private Spinner menu = null;
    private ImageView theirProfile = null;
    private ImageView ourProfile = null;
    private ScrabbleGameState ourGameState;
    private View selectedView = null;
    private GameHumanPlayer ourPlayer = null;
    private Game ourGame;
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // player1=0 and player2=1
    int activePlayer=0;
    boolean gameIsActive=true;
    int gameSate[] = {2,2,2,2,2,2,2,2,2};
    int [][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void dropin (View view)
    {
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameSate[tappedCounter] == 2  && gameIsActive==true)
        {
            counter.setTranslationY(-1000);
            counter.animate().translationYBy(1000f).setDuration(500);
            gameSate[tappedCounter]=activePlayer;
            if(activePlayer==0)
            {
                counter.setImageResource(R.drawable.black_circle);
                activePlayer=1;
            }
            else
            {
                counter.setImageResource(R.drawable.black_cross);
                activePlayer=0;
            }

            for(int[] winningPosition : winningPositions)
            {
                if (gameSate[winningPosition[0]] == gameSate[winningPosition[1]] && gameSate[winningPosition[1]] == gameSate[winningPosition[2]] && gameSate[winningPosition[0]] != 2) {
                    gameIsActive=false;
                    TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
                    if(gameSate[winningPosition[0]]==0)
                    {
                        winnerMessage.setText("Player 1 has won!");
                    }
                    else if(gameSate[winningPosition[0]]==1)
                    {
                        winnerMessage.setText("Player 2 has won!");
                    }
                    LinearLayout layout = (LinearLayout) findViewById(R.id.winnerBox);
                    layout.setVisibility(View.VISIBLE);
                }
                else
                {
                    boolean gameIsOver=true;
                    for(int counterState : gameSate) {
                        if (counterState == 2) gameIsOver=false;
                    }
                    if (gameIsOver){
                        TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
                        winnerMessage.setText("It is a DRAW!");
                        LinearLayout layout = (LinearLayout) findViewById(R.id.winnerBox);
                        layout.setVisibility(View.VISIBLE);
                    }
                }
            }
        }
    }

    public void playAgain(View view) {
        gameIsActive=true;
        LinearLayout layout = (LinearLayout) findViewById(R.id.winnerBox);
        layout.setVisibility(View.INVISIBLE);
        activePlayer=0;
        for(int i=0; i<gameSate.length; i++)
        {
            gameSate[i]=2;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        for(int i=1; i<frameLayout.getChildCount(); i++) {
            ((ImageView) frameLayout.getChildAt(i)).setImageResource(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
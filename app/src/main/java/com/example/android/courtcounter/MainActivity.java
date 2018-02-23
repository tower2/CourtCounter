package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulCountTeamA = 0;
    int foulCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Foul count for team A

    public void foulButtonA(View view) {
        foulCountTeamA = foulCountTeamA + 1;
        displayFoulsForTeamA(foulCountTeamA);
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(fouls));
    }

    // Foul count for team B

    public void foulButtonB(View view) {
        foulCountTeamB = foulCountTeamB + 1;
        displayFoulsForTeamB(foulCountTeamB);
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(fouls));
    }

// =======================================

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Adds 3 points to scoreTeamA
    */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /*
    * Adds 2 points to scoreTeamA
    */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /*
    * Adds 1 points to scoreTeamA
    */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetA(View view) {
        scoreTeamA = 0;
        foulCountTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulCountTeamA);
    }

// ===================================================

    /*
* Adds 3 points to scoreTeamB
*/

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /*
    * Adds 2 points to scoreTeamB
    */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /*
    * Adds 1 points to scoreTeamB
    */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetB(View view) {
        scoreTeamB = 0;
        foulCountTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamB(foulCountTeamB);
    }
}

package com.example.android.scorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declare and Initialize Variables for Philly and NE Score starting at 0
     */
    int scorePhilly = 0;
    int scoreNE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase score for Philly by 6 points.
     */
    public void touchdownForPhilly(View v) {
        scorePhilly = scorePhilly + 6;
        displayForPhilly(scorePhilly);
    }

    /**
     * Increase score for Philly by 3 points..
     */
    public void fieldgoalForPhilly(View v) {
        scorePhilly = scorePhilly + 3;
        displayForPhilly(scorePhilly);
    }

    /**
     * Increase score for Philly by 2 points.
     */
    public void safetyForPhilly(View v) {
        scorePhilly = scorePhilly + 2;
        displayForPhilly(scorePhilly);
    }

    /**
     * Increase score for Philly by 2 points.
     */
    public void conversionForPhilly(View v) {
        scorePhilly = scorePhilly + 2;
        displayForPhilly(scorePhilly);
    }

    /**
     * Increase score for NE by 6 points.
     */
    public void touchdownForNE(View v) {
        scoreNE = scoreNE + 6;
        displayForNE(scoreNE);
    }

    /**
     * Increase score for NE by 3 points..
     */
    public void fieldgoalForNE(View v) {
        scoreNE = scoreNE + 3;
        displayForNE(scoreNE);
    }

    /**
     * Increase score for NE by 2 points.
     */
    public void safetyForNE(View v) {
        scoreNE = scoreNE + 2;
        displayForNE(scoreNE);
    }

    /**
     * Increase score for NE by 2 points.
     */
    public void conversionForNE(View v) {
        scoreNE = scoreNE + 2;
        displayForNE(scoreNE);
    }

    /**
     * Resets the score of both teams back to 0.
     */
public void resetScore (View v) {
scorePhilly = 0;
scoreNE = 0;
displayForPhilly(scorePhilly);
displayForNE(scoreNE);

}


    /**
     * Displays the given score for Philly.
     */
    public void displayForPhilly(int score) {
        TextView scoreView = (TextView) findViewById(R.id.philly_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for NE.
     */
    public void displayForNE(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ne_score);
        scoreView.setText(String.valueOf(score));
    }
}

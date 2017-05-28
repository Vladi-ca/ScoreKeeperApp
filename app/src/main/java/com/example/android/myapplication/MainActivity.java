package com.example.android.myapplication;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Chronometer chronometer;

    // Variables for scores in numbers for both of the teams
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    int AddYellowTeamA = 0;
    int AddYellowTeamB = 0;
    int AddRedTeamA = 0;
    int AddRedTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = (Chronometer) findViewById(R.id.chronometer);
        ((Button) findViewById(R.id.start_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.stop_button)).setOnClickListener(this);
        // TODO: pause button

        // Team A buttons
        Button GoalTeamA = (Button) findViewById(R.id.GoalTeamA);
        GoalTeamA.setOnClickListener(this);

        Button YellowTeamA = (Button) findViewById(R.id.YellowTeamA);
        YellowTeamA.setOnClickListener(this);

        Button YellowResetTeamA = (Button) findViewById(R.id.ResetYellowA);
        YellowResetTeamA.setOnClickListener(this);

        Button RedTeamA = (Button) findViewById(R.id.RedTeamA);
        RedTeamA.setOnClickListener(this);

        Button RedResetTeamA = (Button) findViewById(R.id.ResetRedA);
        RedResetTeamA.setOnClickListener(this);

        // Team B buttons
        Button GoalTeamB = (Button) findViewById(R.id.GoalTeamB);
        GoalTeamB.setOnClickListener(this);

        Button YellowTeamB = (Button) findViewById(R.id.YellowTeamB);
        YellowTeamB.setOnClickListener(this);

        Button YellowResetTeamB = (Button) findViewById(R.id.ResetYellowB);
        YellowResetTeamB.setOnClickListener(this);

        Button RedTeamB = (Button) findViewById(R.id.RedTeamB);
        RedTeamB.setOnClickListener(this);

        Button RedResetTeamB = (Button) findViewById(R.id.ResetRedB);
        RedResetTeamB.setOnClickListener(this);

        // Reset All scores button.
        Button ResetAll = (Button) findViewById(R.id.ResetAll);
        ResetAll.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView ScoreNumTeamA = (TextView) findViewById(R.id.team_a_score);
        TextView ScoreNumTeamB = (TextView) findViewById(R.id.team_b_score);
        TextView YellowNumTeamA = (TextView) findViewById(R.id.team_a_yellow);
        TextView RedNumTeamA = (TextView) findViewById(R.id.team_a_red);
        TextView YellowNumTeamB = (TextView) findViewById(R.id.team_b_yellow);
        TextView RedNumTeamB = (TextView) findViewById(R.id.team_b_red);

        switch (v.getId()) {
            // Goals for Team A
            case R.id.GoalTeamA:
                ScoreTeamA ++;
                ScoreNumTeamA.setText(String.valueOf(ScoreTeamA));
                break;

            // Yellow cards for Team A
            case R.id.YellowTeamA:
                AddYellowTeamA ++;
                YellowNumTeamA.setText(String.valueOf(AddYellowTeamA));
                break;

            // Red cards for Team A
            case R.id.RedTeamA:
                AddRedTeamA ++;
                RedNumTeamA.setText(String.valueOf(AddRedTeamA));
                break;

            // Goals for Team B
            case R.id.GoalTeamB:
                ScoreTeamB ++;
                ScoreNumTeamB.setText(String.valueOf(ScoreTeamB));
                break;

            // Yellow cards for Team B
            case R.id.YellowTeamB:
                AddYellowTeamB ++;
                YellowNumTeamB.setText(String.valueOf(AddYellowTeamB));
                break;

            // Goals for Team B
            case R.id.RedTeamB:
                AddRedTeamB ++;
                RedNumTeamB.setText(String.valueOf(AddRedTeamB));
                break;

            // Reset cards separately
            case R.id.ResetYellowA:
                int YellowTeamA = 0;
                YellowNumTeamA.setText(String.valueOf(YellowTeamA));
                break;

            case R.id.ResetRedA:
                int RedTeamA = 0;
                RedNumTeamA.setText(String.valueOf(RedTeamA));
                break;

            case R.id.ResetYellowB:
                int YellowTeamB = 0;
                YellowNumTeamB.setText(String.valueOf(YellowTeamB));
                break;

            case R.id.ResetRedB:
                int RedTeamB = 0;
                RedNumTeamB.setText(String.valueOf(RedTeamB));
                break;

            // Reset all the scores, goals and cards.
            case R.id.ResetAll:
                int ScoreTeamA = 0;
                int ScoreTeamB = 0;
                int AddYellowTeamA = 0;
                int AddYellowTeamB = 0;
                int AddRedTeamA = 0;
                int AddRedTeamB = 0;
                ScoreNumTeamA.setText(String.valueOf(ScoreTeamA));
                ScoreNumTeamB.setText(String.valueOf(ScoreTeamB));
                YellowNumTeamA.setText(String.valueOf(AddYellowTeamA));
                YellowNumTeamB.setText(String.valueOf(AddYellowTeamB));
                RedNumTeamA.setText(String.valueOf(AddRedTeamA));
                RedNumTeamB.setText(String.valueOf(AddRedTeamB));
                break;

            case R.id.start_button:
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                break;
            case R.id.stop_button:
                chronometer.stop();
                break;

        }

    }

    public void resetnow (View v){
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());

    }

}



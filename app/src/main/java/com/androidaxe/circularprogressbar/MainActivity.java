package com.androidaxe.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private int currProgress = 0;
    private ProgressBar progressBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressbar);
        button = findViewById(R.id.button);

        CountDownTimer countDownTimer = new CountDownTimer(110*30, 30) {
            @Override
            public void onTick(long l) {
                currProgress = currProgress + 1;
                progressBar.setProgress(currProgress);
                progressBar.setMax(100);
            }

            @Override
            public void onFinish() {

            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.start();
            }
        });

    }
}
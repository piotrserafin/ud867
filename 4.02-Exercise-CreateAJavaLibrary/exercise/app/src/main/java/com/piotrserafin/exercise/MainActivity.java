package com.piotrserafin.exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.piotrserafin.jokesmithlib.JokeSmith;
import com.piotrserafin.jokewizardlib.JokeWizard;

public class MainActivity extends AppCompatActivity {

    TextView joke1Text;
    TextView joke2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joke1Text = findViewById(R.id.joke_1_text);
        joke2Text = findViewById(R.id.joke_2_text);

        JokeSmith jokeSmith = new JokeSmith();
        JokeWizard jokeWizard = new JokeWizard();

        joke1Text.setText(jokeSmith.getJoke());
        joke2Text.setText(jokeWizard.getJoke());
    }
}

package uk.edu.le.co2103FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstFragment.USER_NAME);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Hi, " + message);

    }
}
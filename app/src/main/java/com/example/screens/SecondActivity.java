package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button signout;
    private TextView username;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "SecondActivity resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "SecondActivity started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "SecondActivity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "SecondActivity destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        signout = findViewById(R.id.signout_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        username = findViewById(R.id.profile_layout);
        String name = extras.getString("username");
        username.setText(name);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign out");
            }
        });
    }
}
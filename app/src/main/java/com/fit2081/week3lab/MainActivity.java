package com.fit2081.week3lab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String message;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editTextTextPersonName);

        // Toast.makeText(this, "Message is: " + message, Toast.LENGTH_LONG).show();
        Log.d("mApp", "onCreate");
    }

    public void handleClick(View view) {
        message = input.getText().toString();

        Toast.makeText(this, "Message is: " + message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("input", message);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        message = savedInstanceState.getString("input");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("mApp", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("mApp", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("mApp", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("mApp", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Message is: " + message, Toast.LENGTH_LONG).show();

        Log.d("mApp", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("mApp", "onRestart");
    }
}
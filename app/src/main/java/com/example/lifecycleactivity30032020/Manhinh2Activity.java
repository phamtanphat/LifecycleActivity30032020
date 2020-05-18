package com.example.lifecycleactivity30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Manhinh2Activity extends AppCompatActivity {

    Button mBtnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        Log.d("BBB","Activity 2 : onCreate");
        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);

        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Manhinh2Activity.this,
                        Manhinh3Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Activity 2 : onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Activity 2 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Activity 2 : onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Activity 2 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Activity 2 : onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Activity 2 : onDestroy");
    }
}

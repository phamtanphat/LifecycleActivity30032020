package com.example.lifecycleactivity30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Manhinh3Activity extends AppCompatActivity {

    Button mBtnNavigateScreen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh3);
        Log.d("BBB","Activity 3 : onCreate");
        mBtnNavigateScreen1 = findViewById(R.id.buttonNavigateScreen1);

        mBtnNavigateScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Manhinh3Activity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Activity 3 : onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Activity 3 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Activity 3 : onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Activity 3 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Activity 3 : onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Activity 3 : onDestroy");
    }
}

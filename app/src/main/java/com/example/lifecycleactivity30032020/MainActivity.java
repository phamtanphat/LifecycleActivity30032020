package com.example.lifecycleactivity30032020;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigateScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Activity 1 : onCreate");
        mBtnNavigateScreen2 = findViewById(R.id.buttonNavigateScreen2);

        mBtnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,
                        Manhinh2Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Activity 1 : onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Activity 1 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Activity 1 : onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Activity 1 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Activity 1 : onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Activity 1 : onDestroy");
    }
}

package com.example.yu.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","onStart 朕知道了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","onResume 朕知道了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","onStop 朕知道了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","onRestart 朕知道了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","onPause 朕知道了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","onDestroy 朕知道了");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

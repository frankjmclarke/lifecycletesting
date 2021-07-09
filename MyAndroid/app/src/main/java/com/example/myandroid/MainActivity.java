package com.example.myandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyAndroid", "onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MyAndroid", "onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MyAndroid", "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MyAndroid", "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MyAndroid", "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MyAndroid", "onDestroy");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("MyAndroid","onRestart");
    }
}

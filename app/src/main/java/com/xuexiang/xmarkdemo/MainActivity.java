package com.xuexiang.xmarkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xuexiang.xmark.XMark;
import com.xuexiang.xmark.annotation.MarkLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printArgs("The", "Quick", "Brown", "Fox");
    }


    @MarkLog
    private void printArgs(String... args) {
        for (String arg : args) {
            XMark.log("Args", arg);
        }
    }
}

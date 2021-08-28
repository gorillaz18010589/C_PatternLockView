package com.dyaco.c_patternlockview;
//1.implementation 'com.itsxtt:patternlockview:0.1.0'

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//    PatternLockView patternLockView;
    private String TAG = "hank";
//    private PatternLockView patternLockView;
    private com.dyaco.c_patternlockview.PatternLockView mPatternLockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        mPatternLockView = findViewById(R.id.lock_view);

//        initPatternLockView();
        initPatternLockView2();
    }

    private void initPatternLockView2() {
        mPatternLockView.setPatternLockViewListener(new PatternLockView.PatternLockViewListener() {
            @Override
            public void onLockEnd(int[] values) {
                for(int i : values){
                    Log.v("hank","onLockEnd: i:" + i);
                }

            }
        });
    }

    private void initPatternLockView() {
//        patternLockView = findViewById(R.id.pattern_lock_view);
//        patternLockView.setListener(new PatternLockView.Listenser() {
//            @Override
//            public void onProgress(String digit) {
//
//            }
//
//            @Override
//            public void onFinish(String pattern) {
//
//            }
//        });


//        patternLockView.setOnPatternListener(new PatternLockView.OnPatternListener() {
//            @Override
//            public void onStarted() {
//                Log.v(TAG, "setOnPatternListener ()");
//            }
//
//            @Override
//            public void onProgress(ArrayList<Integer> arrayList) {
//                Log.v(TAG, "setOnPatternListener ()");
//            }
//
//            @Override
//            public boolean onComplete(ArrayList<Integer> arrayList) {
//                for (Integer integer : arrayList) {
//                    Log.v(TAG, "onComplete(): i:" + integer);
//                }
//                return false;
//            }
//        });
    }
}
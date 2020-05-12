package com.example.radarview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    double[] data={50,120,90,70,50,100,20};
    String[] titles={"发球","经验","防守","技巧","速度","力量"};
    RadarView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.rader);

        view.setData(data);
        view.setTitles(titles);
    }
}

package com.example.layouttesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {
    //private LineGraphSeries<DataPoint> series1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        double x, y;
        x = 0;
        GraphView graph = (GraphView) findViewById(R.id.graph);
         series1 = new LineGraphSeries<>();
        int numDataPoint = 500; //this is the number of data points we are plotting
        for (int i = 0; i < numDataPoint; i++) {
        x = x + 0.1;//0.1 gives the graph a nice continuous look
        y = Math.sin(x);
         series1.appendData(new DataPoint(x, y), true, 100);
        */

    }
        //graph.addSeries(series1);

    }
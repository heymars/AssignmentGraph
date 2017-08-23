package com.sujeet.assignmentgraph;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0,0),
                new DataPoint(1,0),
                new DataPoint(2,38),
                new DataPoint(3,25),
                new DataPoint(4,39),
                new DataPoint(5,30),
                new DataPoint(6,22),
                new DataPoint(7,28),
                new DataPoint(8,28),
                new DataPoint(9,34),
                new DataPoint(10,31),
                new DataPoint(11,21),
                new DataPoint(12,50)
        });

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(20);
        graph.getViewport().setMaxY(50);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(1);
        graph.getViewport().setMaxX(5);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(15f);


        graph.getViewport().setScrollable(true);


        graph.addSeries(series);

    }

}

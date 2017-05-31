package com.sample.dashboard;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Performance extends Fragment {

     PieChart mChartPC;
     BarChart mChart1,mChart2,mChart3,mChart4;
    final int[] COLORSATT = {Color.rgb(50,205,50), Color.rgb(100,149,237)};

    final int[] COLORSSUB = {Color.rgb(50,205,50), Color.rgb(100,149,237), Color.rgb(215,59,36), Color.rgb(23,158,200)};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_performance, container, false);

        mChartPC = (PieChart) view.findViewById(R.id.pieChart);
        mChart1 = (BarChart) view.findViewById(R.id.barChart1);
        mChart2 = (BarChart) view.findViewById(R.id.barChart2);
        mChart3 = (BarChart) view.findViewById(R.id.barChart3);
        mChart4 = (BarChart) view.findViewById(R.id.barChart4);





        mChartPC.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChartPC.setRotationEnabled(true);
        mChartPC.setHighlightPerTapEnabled(true);

        mChartPC.animateY(1400, Easing.EasingOption.EaseInOutQuad);

        Legend l = mChartPC.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setXEntrySpace(7f);
        l.setYEntrySpace(0f);
        l.setYOffset(0f);

        // entry label styling
        mChartPC.setEntryLabelColor(Color.WHITE);
        mChartPC.setEntryLabelTextSize(12f);



        mChart1.setDrawBarShadow(false);
        mChart1.setDrawValueAboveBar(true);

        mChart1.getDescription().setEnabled(false);

        mChart1.setMaxVisibleValueCount(100);

        mChart1.setPinchZoom(false);
        mChart1.setDoubleTapToZoomEnabled(false);

        mChart1.setDrawGridBackground(false);

        XAxis xAxis = mChart1.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1f);

        YAxis leftAxis = mChart1.getAxisLeft();
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setSpaceTop(15f);
        leftAxis.setAxisMinimum(0f);

        YAxis rightAxis = mChart1.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setLabelCount(8, false);
        rightAxis.setSpaceTop(15f);
        rightAxis.setAxisMinimum(0f);

        Legend l1 = mChart1.getLegend();
        l1.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l1.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l1.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l1.setDrawInside(false);
        l1.setForm(Legend.LegendForm.SQUARE);
        l1.setFormSize(9f);
        l1.setTextSize(11f);
        l1.setXEntrySpace(4f);
        l1.setExtra(COLORSATT, new String[] { "% Present","% Required Attendence"});


        mChart2.setDrawBarShadow(false);
        mChart2.setDrawValueAboveBar(true);

        mChart2.getDescription().setEnabled(false);

        mChart2.setMaxVisibleValueCount(100);

        mChart2.setPinchZoom(false);
        mChart2.setDoubleTapToZoomEnabled(false);

        mChart2.setDrawGridBackground(false);

        XAxis xAxis1 = mChart2.getXAxis();
        xAxis1.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis1.setDrawGridLines(false);
        xAxis1.setGranularity(1f);

        YAxis leftAxis1 = mChart2.getAxisLeft();
        leftAxis1.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis1.setSpaceTop(15f);
        leftAxis1.setAxisMinimum(0f);

        YAxis rightAxis1 = mChart2.getAxisRight();
        rightAxis1.setDrawGridLines(false);
        rightAxis1.setLabelCount(8, false);
        rightAxis1.setSpaceTop(15f);
        rightAxis1.setAxisMinimum(0f);

        Legend l2 = mChart2.getLegend();
        l2.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l2.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l2.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l2.setDrawInside(false);
        l2.setForm(Legend.LegendForm.SQUARE);
        l2.setFormSize(9f);
        l2.setTextSize(9f);
       // l2.setXEntrySpace(4f);
        l2.setExtra(COLORSSUB, new String[] { "Scored","Avg", "Class Topper","Subject Topper"});

        mChart3.setDrawBarShadow(false);
        mChart3.setDrawValueAboveBar(true);

        mChart3.getDescription().setEnabled(false);

        mChart3.setMaxVisibleValueCount(100);

        mChart3.setPinchZoom(false);
        mChart3.setDoubleTapToZoomEnabled(false);

        mChart3.setDrawGridBackground(false);

        XAxis xAxis2 = mChart3.getXAxis();
        xAxis2.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis2.setDrawGridLines(false);
        xAxis2.setGranularity(1f);

        YAxis leftAxis2 = mChart3.getAxisLeft();
        leftAxis2.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis2.setSpaceTop(15f);
        leftAxis2.setAxisMinimum(0f);

        YAxis rightAxis2 = mChart3.getAxisRight();
        rightAxis2.setDrawGridLines(false);
        rightAxis2.setLabelCount(8, false);
        rightAxis2.setSpaceTop(15f);
        rightAxis2.setAxisMinimum(0f);

        Legend l3 = mChart3.getLegend();
        l3.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l3.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l3.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l3.setDrawInside(false);
        l3.setForm(Legend.LegendForm.SQUARE);
        l3.setFormSize(9f);
        l3.setTextSize(9f);
        //l3.setXEntrySpace(4f);
        l3.setExtra(COLORSSUB, new String[] { "Scored","Avg", "Class Topper","Subject Topper"});


        mChart4.setDrawBarShadow(false);
        mChart4.setDrawValueAboveBar(true);

        mChart4.getDescription().setEnabled(false);

        mChart4.setMaxVisibleValueCount(100);

        mChart4.setPinchZoom(false);
        mChart4.setDoubleTapToZoomEnabled(false);

        mChart4.setDrawGridBackground(false);

        XAxis xAxis3 = mChart4.getXAxis();
        xAxis3.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis3.setDrawGridLines(false);
        xAxis3.setGranularity(1f);

        YAxis leftAxis3 = mChart4.getAxisLeft();
        leftAxis3.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis3.setSpaceTop(15f);
        leftAxis3.setAxisMinimum(0f);

        YAxis rightAxis3 = mChart4.getAxisRight();
        rightAxis3.setDrawGridLines(false);
        rightAxis3.setLabelCount(8, false);
        rightAxis3.setSpaceTop(15f);
        rightAxis3.setAxisMinimum(0f);

        Legend l4 = mChart4.getLegend();
        l4.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l4.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l4.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l4.setDrawInside(false);
        l4.setForm(Legend.LegendForm.SQUARE);
        l4.setFormSize(9f);
        l4.setTextSize(9f);
        //l4.setXEntrySpace(4f);
        l4.setExtra(COLORSSUB, new String[] { "Scored","Avg", "Class Topper","Subject Topper"});

        setDataForPieChart();
        setDataForBarChart1();
        setDataForBarChart2();
        setDataForBarChart3();
        setDataForBarChart4();

        return view;
    }


    void setDataForPieChart(){


        ArrayList<PieEntry> entries = new ArrayList<PieEntry>();

        // NOTE: The order of the entries when being added to the entries array determines their position around the center of
        // the chart.
        entries.add(new PieEntry((float) (60),
                "Correct"));

        entries.add(new PieEntry((float) (15),
                "Wrong"));

        entries.add(new PieEntry((float) (25),
                "Skipped"));

        PieDataSet dataSet = new PieDataSet(entries, "Test Results");

        dataSet.setDrawIcons(false);

        dataSet.setSliceSpace(2f);
        // dataSet.setIconsOffset(new MPPointF(0, 40));
        dataSet.setSelectionShift(5f);

        // add a lot of colors

        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.rgb(50,205,50));
        colors.add(Color.rgb(220,20,60));
        colors.add(Color.rgb(100,149,237));

        dataSet.setColors(colors);
        //dataSet.setSelectionShift(0f);

        PieData data = new PieData(dataSet);
        // data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.WHITE);
        mChartPC.setData(data);

        // undo all highlights
        mChartPC.highlightValues(null);
        mChartPC.invalidate();

    }
    void setDataForBarChart1(){


        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        yVals1.add(new BarEntry(0f, 85f));
        yVals1.add(new BarEntry(1f, 75f));



        BarDataSet set1;

        set1 = new BarDataSet(yVals1, "Attendance");

        set1.setDrawIcons(false);

        set1.setColors(COLORSATT);

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        mChart1.setData(data);
        mChart1.invalidate();

    }
    void setDataForBarChart2(){


        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        yVals1.add(new BarEntry(0f, 56f));
        yVals1.add(new BarEntry(1f, 75f));
        yVals1.add(new BarEntry(2f, 93f));
        yVals1.add(new BarEntry(3f, 98f));



        BarDataSet set1;

        set1 = new BarDataSet(yVals1, "");

        set1.setDrawIcons(false);

        set1.setColors(COLORSSUB);

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        mChart2.setData(data);
        mChart2.invalidate();



    }
    void setDataForBarChart3(){


        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        yVals1.add(new BarEntry(0f, 86f));
        yVals1.add(new BarEntry(1f, 79f));
        yVals1.add(new BarEntry(2f, 99f));
        yVals1.add(new BarEntry(3f, 99f));



        BarDataSet set1;

        set1 = new BarDataSet(yVals1, "");

        set1.setDrawIcons(false);

        set1.setColors(COLORSSUB);

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        mChart3.setData(data);
        mChart3.invalidate();
    }
    void setDataForBarChart4(){


        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        yVals1.add(new BarEntry(0f, 100f));
        yVals1.add(new BarEntry(1f, 89f));
        yVals1.add(new BarEntry(2f, 100f));
        yVals1.add(new BarEntry(3f, 100f));



        BarDataSet set1;

        set1 = new BarDataSet(yVals1, "");

        set1.setDrawIcons(false);

        set1.setColors(COLORSSUB);

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        mChart4.setData(data);
        mChart4.invalidate();
    }

}

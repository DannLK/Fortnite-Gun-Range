package com.example.ayylmao.fortnitegunrangev20;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.Collection;


public class Scar_stats extends AppCompatActivity {

    TextView GName1P2, GunType, Category1, Category2, Category3, Category4;
    private HorizontalBarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scar_stats);
        GName1P2 = (TextView)findViewById(R.id.gunNameP2);
        GunType = (TextView)findViewById(R.id.gunType);
        Category1 = (TextView)findViewById(R.id.Damage);
        Category2 = (TextView)findViewById(R.id.FireRate);
        Category3 = (TextView)findViewById(R.id.MagazineSize);
        Category4 = (TextView)findViewById(R.id.ReloadTime);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/burbankbig.otf");
        GName1P2.setTypeface(myCustomFont, Typeface.BOLD);
        GunType.setTypeface(myCustomFont, Typeface.BOLD);
        GunType.setTextColor(Color.parseColor("#ff8c00"));
        Category1.setTypeface(myCustomFont, Typeface.BOLD_ITALIC);
        Category2.setTypeface(myCustomFont, Typeface.BOLD_ITALIC);
        Category3.setTypeface(myCustomFont, Typeface.BOLD_ITALIC);
        Category4.setTypeface(myCustomFont, Typeface.BOLD_ITALIC);



barChart = (HorizontalBarChart) findViewById(R.id.scarChart);
        ArrayList<BarEntry> yVals = new ArrayList<>();
        yVals.add(new BarEntry(36f,0));
        yVals.add(new BarEntry(5.5f,1));
        yVals.add(new BarEntry(30f,2));
        yVals.add(new BarEntry(2.1f,3));
        BarDataSet barDataSet = new BarDataSet(yVals, "Values");

        ArrayList<String> Categories = new ArrayList<>();
        Categories.add("Damage");
        Categories.add("Fire Rate");
        Categories.add("Magazine Size");
        Categories.add("Reload Time");

        BarData theData = new BarData(Categories, barDataSet);
        barChart.setData(theData);
        barChart.setTouchEnabled(true);
        barChart.setScaleEnabled(true);
        barChart.setDescription("");    // Hide the description
        barChart.getAxisLeft().setDrawLabels(false);
        barChart.getAxisRight().setDrawLabels(false);
        barChart.getXAxis().setDrawLabels(false);
        barChart.getXAxis().setEnabled(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);



        barChart.getLegend().setEnabled(false);
        barDataSet.setValueTextSize(12f);
        barDataSet.setColor(Color.WHITE);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barChart.animateXY(1500,1500);
        barChart.invalidate();


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

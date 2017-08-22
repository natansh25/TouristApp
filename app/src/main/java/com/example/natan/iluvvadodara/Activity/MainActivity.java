package com.example.natan.iluvvadodara.Activity;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.natan.iluvvadodara.R;
import com.example.natan.iluvvadodara.ViewPagerAdapter.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id for View Pager

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setBackgroundColor(Color.BLACK);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());



        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
    }
}

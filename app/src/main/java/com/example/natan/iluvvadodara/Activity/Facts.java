package com.example.natan.iluvvadodara.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.natan.iluvvadodara.Fragments.FactsFragment;
import com.example.natan.iluvvadodara.R;

/**
 * Created by natan on 8/14/2017.
 */

public class Facts extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FactsFragment())
                .commit();
    }
}

package com.example.natan.iluvvadodara.ViewPagerAdapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.natan.iluvvadodara.Fragments.FactsFragment;
import com.example.natan.iluvvadodara.Fragments.MallsFragment;
import com.example.natan.iluvvadodara.Fragments.PlacesFragment;
import com.example.natan.iluvvadodara.Fragments.StreetFoodFragment;
import com.example.natan.iluvvadodara.R;

/**
 * Created by natan on 8/14/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * private Context mContext;
     p
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new StreetFoodFragment();
        } else if (position == 2) {
            return new MallsFragment();
        } else {
            return new FactsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Places);
        } else if (position == 1) {
            return mContext.getString(R.string.category_StreetFood);
        } else if (position == 2) {
            return mContext.getString(R.string.category_Malls);
        } else {
            return mContext.getString(R.string.category_Facts);
        }
    }
}
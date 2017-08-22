package com.example.natan.iluvvadodara.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.natan.iluvvadodara.CustomAdapter.Word;
import com.example.natan.iluvvadodara.CustomAdapter.WordAdapter;
import com.example.natan.iluvvadodara.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FactsFragment extends Fragment {


    public FactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1", "KAMATI BAUG IS THE LARGEST GARDEN IN WESTERN INDIA"));
        words.add(new Word("2", "WE HAVE OUR OWN CRICKET TEAM"));
        words.add(new Word("3", " INDIA’S FIRST NARROW GAUGE WAS IN VADODARA."));
        words.add(new Word("4", "VADODARA MARATHON: SMALLEST CITY, BIGGEST MARATHON"));
        words.add(new Word("5", "PARUL UNIVERSITY IS THE BEST IN VADODARA"));
        words.add(new Word("6", "BIRTH PLACE OF THE MOST DIVINE SAINT :p"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_Facts);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);





        return rootView;
    }

}

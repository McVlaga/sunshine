package io.github.mcvlaga.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        // Get the message from the intent
        Intent intent = getActivity().getIntent();
        String message = intent.getStringExtra(MainActivityFragment.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = (TextView) rootView.findViewById(R.id.textview_forecast);
        textView.setText(message);

        return rootView;
    }
}

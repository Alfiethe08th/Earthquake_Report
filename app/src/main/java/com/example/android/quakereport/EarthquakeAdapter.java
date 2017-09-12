package com.example.android.quakereport;

/**
 * Created by TenTsering on 9/12/17.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter that can provide the layout for each list
 * based on a data source, which is a list of {@link Earthquake} objects.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    /**
     * Creating a custom constructor
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param earthquake A list of Earthquake objects to display in a list
     */

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquake) {

        super(context, 0, earthquake);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.lists, parent, false);
        }
        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Magnitude
        TextView magTextView = (TextView) listItemView.findViewById(R.id.Magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the lists.xml layout with the ID Location
        TextView locTextView = (TextView) listItemView.findViewById(R.id.Location);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locTextView.setText(currentEarthquake.getLocation());

        // Find the TextView in the lists.xml layout with the ID Location
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.Date);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquake.getDate());

        /*// Find the ImageView in the list_item.xml layout with the ID list_item_icon

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
        */

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
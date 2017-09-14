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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/*
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter that can provide the layout for each list
 * based on a data source, which is a list of {@link Earthquake} objects.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();
    /*
   * Return the formatted date String (i.e. "May 6, 1995") from a Date object.
   */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    /*
     * Return the formatted time String (i.e. "12:20 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
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
        // To Find the earthquake at a given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Magnitude
        TextView magView = (TextView) listItemView.findViewById(R.id.Magnitude);
        //Display magnitude of the current earthquake in that TextView
        magView.setText(currentEarthquake.getMagnitude());


        // Find the TextView in the lists.xml layout with the ID Location
        TextView primeLocView = (TextView) listItemView.findViewById(R.id.Location_Prime);
        //Display location of the current earthquake in that TextView
        primeLocView.setText(currentEarthquake.getLocPrime());

        TextView locOffsetView = (TextView) listItemView.findViewById(R.id.Location_Offset);
        //Display location of the current earthquake in that TextView
        locOffsetView.setText(currentEarthquake.getLocOffSet());


        //Create a new Date object from the time in milli-sec when the eathquake took place
        Date dateObject = new Date(currentEarthquake.getmTimeInMilSec());
        // Find the TextView in the lists.xml layout with the ID Date
        TextView dateView = (TextView) listItemView.findViewById(R.id.Date);
        //Format the date String (i.e. "May 6, 1995")
        String formattedDate = formatDate(dateObject);
        //Display Date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView in the lists.xml layout with the ID Time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        //Format the time String (i.e. "9:30 AM")
        String formattedtime = formatTime(dateObject);
        //Display time of the current earthquake in that TextView
        timeView.setText(formattedtime);

        return listItemView;

    }


}
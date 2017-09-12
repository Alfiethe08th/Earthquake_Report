package com.example.android.quakereport;

/**
 * Created by Alfie on 9/12/17.
 * Each object in Earthquake has 3 properties: magnitude, location, and date.
 */

public class Earthquake {

    //Magnitude of the Earthquake
    private String mMagnitude;

    //Location/place of the Earthquake
    private String mLocation;

    //Date at which the Earthquake took place
    private String mDate;

    /*
    * Create a Earthquake object
    *
    * @param vMag is the magnitude of the Earthquake
    * @param vLoc is the location at which the Earthquake took place
    * @param mDate is the date at which the Earthquake occured
     */
    public Earthquake(String vMag, String vLoc, String vDate)
    {
        mMagnitude = vMag;
        mLocation = vLoc;
        mDate = vDate;
    }
    /**
     * Gets the magnitude of the Earthquake
     */
    public String getMagnitude() { return mMagnitude;}

    /**
     * Gets the location of the Earthquake
     */
    public String getLocation() { return mLocation;}

    /**
     * Gets the Date at which Earthquake occurred
     */
    public String getDate() { return mDate;}
}

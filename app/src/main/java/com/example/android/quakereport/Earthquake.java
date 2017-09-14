package com.example.android.quakereport;

import java.util.Date;
import java.util.ArrayList;
/**
 * Created by Alfie on 9/12/17.
 * Each object in Earthquake has 3 properties: magnitude, location, and date.
 */

public class Earthquake {

    //Magnitude of the Earthquake
    private String mMagnitude;

    //Location/place of the Earthquake
    private String mLocPrime;

    private String mLocOffSet;

    //Date at which the Earthquake took place
    private long mTimeInMilSec;


    /*
    * Create a Earthquake object
    *
    * @param vMag is the magnitude of the Earthquake
    * @param vLoc is the location at which the Earthquake took place
    * @param vtimeInMilSec is the time in milliseconds
     */
    public Earthquake(String vMag, String vLocPrime, String vLocOffSet, long vtimeInMilSec)
    {
        mMagnitude = vMag;
        mLocPrime = vLocPrime;
        mLocOffSet = vLocOffSet;
        mTimeInMilSec = vtimeInMilSec;
    }
    /**
     * Gets the magnitude of the Earthquake
     */
    public String getMagnitude() { return mMagnitude;}

    /**
     * Gets the location of the Earthquake
     */
    public String getLocPrime() { return mLocPrime;}

    public String getLocOffSet() { return mLocOffSet;}

    /**
     * Gets the time at which Earthquake occurred
     */
    public long getmTimeInMilSec() { return mTimeInMilSec;}

}

package com.example.android.quakereport;

/**
 * Created by Admin on 11/5/2017.
 */

public class Earthquake {
    /**
     * an {@link Earthquake} object contains informations related to a single earthquake.
     */

    //magnitude of the earthquake
        private String mMagnitude;

        //location of the earthquake
        private String mLocation;

        // date of the earthquake
        private Long mTimeInMilliseconds;

        /**
         * constructs a new {@link Earthquake} object.
         * @param magnitude is the magnitude of the earthquake
         * @param location is the location of the earthquake
         * @param TimeInMilliSeconds is the time in milliseconds of the earthquake
         */

        public Earthquake(String magnitude, String location, Long TimeInMilliSeconds ){


            mMagnitude = magnitude;
            mLocation = location;
            mTimeInMilliseconds = TimeInMilliSeconds;
        }
        /**
         * Returne the magnitude of the earthquake
         */
        public String getMagnitude(){
            return mMagnitude;
        }

        /**
         * Returns the location of the earthquake
         */
        public String getLocation(){
            return mLocation;
        }

        /**
         * Returns the date of the earthquake
         */
        public Long getTimeInMilliSeconds(){
            return mTimeInMilliseconds;
        }



}





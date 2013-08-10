package com.austindroids.npa.ui;

/**
 * Created by spawrks on 8/10/13.
 */
public class Route {

    public int mClientId;
    public int mRouteId;
    public String mFirstName;
    public String mLastName;
    public String mAddress;
    public String mCity;
    public String mState;
    public String mZip;

    public Route()
    {
        super();
    }

    public Route(String sFirstName, String sLastName,String sAddress, String sCity, String sState, String sZip)
    {
        super();
        mFirstName = sFirstName;
        mLastName = sLastName;
        mAddress = sAddress;
        mCity = sCity;
        mState = sState;
        mZip = sZip;
    }

    public String getGoogleMapsURI()
    {
        //geo:0,0?q=business+near+city
        String uri = "0,0?q="+mAddress+"+"+mCity+"+"+mState+"+"+mZip;
        return uri;
    }

}

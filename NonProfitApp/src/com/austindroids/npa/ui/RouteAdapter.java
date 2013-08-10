package com.austindroids.npa.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.austindroids.npa.R;

/**
 * Created by spawrks on 8/10/13.
 */
public class RouteAdapter extends ArrayAdapter<Route> {

    Context context;
    int layoutResourceId;
    Route data[] = null;

    public RouteAdapter(Context context, int layoutResourceId, Route[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RouteHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new RouteHolder();
            //holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.firstName = (TextView)row.findViewById(R.id.firstName);
            holder.lastName = (TextView)row.findViewById(R.id.lastName);
            holder.address = (TextView)row.findViewById(R.id.address);
            holder.city = (TextView)row.findViewById(R.id.city);
            holder.state  = (TextView)row.findViewById(R.id.state);
            holder.zip = (TextView)row.findViewById(R.id.zip);

            row.setTag(holder);
        }
        else
        {
            holder = (RouteHolder)row.getTag();
        }

        Route route = data[position];

        holder.firstName.setText(route.mFirstName);
        holder.lastName.setText(route.mLastName);
        holder.address.setText(route.mAddress);
        holder.city.setText(route.mCity);
        holder.state.setText(route.mState);
        holder.zip.setText(route.mZip);
        //holder.imgIcon.setImageResource(route.icon);

        return row;
    }

    static class RouteHolder
    {
        //ImageView imgIcon;
        TextView firstName;
        TextView lastName;
        TextView address;
        TextView city;
        TextView state;
        TextView zip;
    }
}


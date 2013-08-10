package com.austindroids.npa.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.austindroids.npa.R;

/**
 * Created by spawrks on 8/10/13.
 */
public class NavigationActivity extends Activity {

    protected Context mContext = null;
    private ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        mListView = (ListView) findViewById(R.id.route_listview);

        final Route[] myRouteArray = new Route[]
        {
            new Route("Adam","Schwem","2211 E. 2nd St","Austin","TX","78702"),
            new Route("Delta","Program","912 Congress","Austin","TX","78701")
        };


        RouteAdapter routeAdapter = new RouteAdapter(getApplicationContext(), R.layout.navigation_listrow, myRouteArray);
        if (mListView != null) {
            mListView.setAdapter(routeAdapter);
        }

//
//  Example of how to get to waze via intent:
//
//        View.OnClickListener buttonListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    String url = "waze://?q=Hawaii";
//                    Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse(url) );
//                    startActivity( intent );
//                } catch ( ActivityNotFoundException ex  )
//                {
//                    Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "market://details?id=com.waze" ) );
//                    startActivity(intent);
//                }
//            }
//        };
//
//        Button b = (Button) findViewById(R.id.mapButton);
//        b.setOnClickListener(buttonListener);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Route r = myRouteArray[position];

                String uri = r.getGoogleMapsURI();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);



                Toast.makeText(getBaseContext(),r.mAddress , Toast.LENGTH_LONG).show();

            }
        });



    }



}

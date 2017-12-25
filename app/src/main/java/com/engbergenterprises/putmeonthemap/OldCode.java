package com.engbergenterprises.putmeonthemap;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by rick on 12/24/17.
 */

public class OldCode {
    /*
package com.engbergenterprises.putmeonthemap;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationService locater;
    private boolean bound = false;
    private final int PERMISSION_REQUEST_CODE = 698;
    private final int NOTIFICATION_ID = 423;

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder binder) {
            LocationService.LocationBinder LocationBinder = (LocationService.LocationBinder) binder;
            locater = LocationBinder.getLocater();
            bound = true;
        }
        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            bound = false;
        }
    };

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE: {
                if (grantResults.length>0&grantResults[0]== PackageManager.PERMISSION_GRANTED) {
                    Intent intent = new Intent(this, LocationService.class);
                    bindService(intent, connection, Context.BIND_AUTO_CREATE);
                } else {
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                            .setSmallIcon(android.R.drawable.ic_menu_compass)
                            .setContentTitle("Put Me On the Map")
                            .setContentText("Location Permission Required. Program is not running.")
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .setVibrate(new long[]{0,1000})
                            .setAutoCancel(true);
                    Intent actionIntent = new Intent(this, MapsActivity.class);
                    PendingIntent actionPendingIntent = PendingIntent.getActivity(this,0,actionIntent,PendingIntent.FLAG_UPDATE_CURRENT);
                    builder.setContentIntent(actionPendingIntent);
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(NOTIFICATION_ID, builder.build());
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (ContextCompat.checkSelfPermission(this, LocationService.PERMISSION_STRING)!=PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{LocationService.PERMISSION_STRING},PERMISSION_REQUEST_CODE);
        } else {
            Intent intent = new Intent(this, LocationService.class);
            bindService(intent, connection, Context.BIND_AUTO_CREATE);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (bound) {
            unbindService(connection);
            bound = false;
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng latLng = new LatLng(-34, 151);
        if (bound && locater !=null) {
            latLng = locater.getLocation();
        }
        mMap.addMarker(new MarkerOptions().position(latLng).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}

     */


}

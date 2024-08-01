package com.upb.restaurant;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.restaurant.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng medellin = new LatLng(6.25184, -75.56359);

        LatLng sabaneta = new LatLng(6.25185, -75.56359);
        LatLng laureles = new LatLng(6.25186, -75.56359);
        LatLng centro = new LatLng(6.25187, -75.56359);
        LatLng bello = new LatLng(6.25188, -75.56359);


        mMap.addMarker(new MarkerOptions().position(medellin).title("Marker in Medellin"));
        mMap.addMarker(new MarkerOptions().position(sabaneta).title("Sede sur"));
        mMap.addMarker(new MarkerOptions().position(laureles).title("Sede principal"));
        mMap.addMarker(new MarkerOptions().position(centro).title("Sede la candelaria"));
        mMap.addMarker(new MarkerOptions().position(bello).title("Sede norte"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(medellin, 15));

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
}
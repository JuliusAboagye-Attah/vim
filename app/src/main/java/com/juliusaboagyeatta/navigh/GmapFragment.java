package com.juliusaboagyeatta.navigh;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;


/**
 * Created by Julius on 27-Feb-17.
 */


public class GmapFragment extends Fragment implements OnMapReadyCallback {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gmaps,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.maps);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}

package com.example.krrishdholakia.triallerx7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;
import com.google.android.gms.maps.model.LatLngBounds;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int PLACE_AUTOCOMPLETE_REQUEST_CODE = 1;

  public void findPlace(View view)
  {
      try {
          Intent intent =
                  new PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_FULLSCREEN)
                          .build(this);
          startActivityForResult(intent, PLACE_AUTOCOMPLETE_REQUEST_CODE);
      } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
          // TODO: Handle the error.
      }

  }
}

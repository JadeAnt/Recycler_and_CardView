package com.example.my_card_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bikeStationName;
    TextView bikeStationLocation;
    TextView bikeStationNumber;
    ImageView bikeStationPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bikeStationName = findViewById(R.id.card_name);
        bikeStationLocation = findViewById(R.id.card_location);
        bikeStationNumber = findViewById(R.id.card_location);
        bikeStationPhoto = findViewById(R.id.card_image);

        bikeStationName.setText("North");
        bikeStationLocation.setText("Quad");
        bikeStationNumber.setText("1");
        bikeStationPhoto.setImageResource(R.drawable.ic_launcher_background);
    }
}

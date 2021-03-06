package com.example.user.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {


    private Button History;
    private Button Hotel;
    private Button MAP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth2);

        History = (Button) findViewById(R.id.history3);
        Hotel = (Button) findViewById(R.id.location3);
        MAP = (Button) findViewById(R.id.map3);


        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Chittagong"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });


        MAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/chittagong/"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });


        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/chittagong+hotel+location"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });







    }
}

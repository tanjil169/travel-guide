package com.example.user.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NinthActivity extends AppCompatActivity {


    private Button History;
    private Button Hotel;
    private Button MAP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);


        History = (Button) findViewById(R.id.history6);
        Hotel = (Button) findViewById(R.id.location6);
        MAP = (Button) findViewById(R.id.map6);


        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/khulna"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });

        MAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/khulna/"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });


        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/khulna+hotel+location"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });




    }
}

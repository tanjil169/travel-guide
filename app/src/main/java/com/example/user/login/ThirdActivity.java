package com.example.user.login;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ThirdActivity extends AppCompatActivity {


   private Button History;
    private Button Hotel;
    private Button MAP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

       History = (Button) findViewById(R.id.history1);
        Hotel = (Button) findViewById(R.id.location1);
        MAP = (Button) findViewById(R.id.map1);






        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Dhaka"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });


        MAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Dhaka/"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });




        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/dhaka+hotel+location"));

                startActivity(intent);
                // clicked_btn("https://www.booking.com ");
            }
        });









    }

    public void clicked_btn(String url){
       Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);




    }


}

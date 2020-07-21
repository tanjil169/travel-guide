package com.example.user.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    private Button DHAKA;
    private Button RAJSHAHI;
    private Button CHITTAGONG;
    private Button RANGAMATI;
    private Button SYLET;
    private Button KHULNA;




    private Button Currency;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DHAKA = (Button) findViewById(R.id.button6);
        RAJSHAHI = (Button) findViewById(R.id.button7);
        CHITTAGONG = (Button) findViewById(R.id.button8);
        RANGAMATI = (Button) findViewById(R.id.button9);
        SYLET = (Button) findViewById(R.id.button10);
        KHULNA = (Button) findViewById(R.id.button11);



        Currency = (Button) findViewById(R.id.button12);




        DHAKA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            openThirdActivity();
            }
        });






        RAJSHAHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFifthActivity();
            }
        });



        CHITTAGONG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSixthActivity();
            }
        });


        RANGAMATI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSeventhActivity();
            }
        });

        SYLET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openEighthActivity();
            }
        });

        KHULNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNinthActivity();
            }
        });










        Currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFourthActivity();
            }
        });



        firebaseAuth = FirebaseAuth.getInstance();
    }



    public void openThirdActivity(){
   Intent intent =new Intent (this,ThirdActivity.class);

    startActivity(intent);

    }

    public void openFifthActivity(){
        Intent intent =new Intent (this,FifthActivity.class);

        startActivity(intent);

    }


    public void openSixthActivity(){
        Intent intent =new Intent (this,SixthActivity.class);

        startActivity(intent);

    }


    public void openSeventhActivity(){
        Intent intent =new Intent (this,SeventhActivity.class);

        startActivity(intent);

    }



    public void openEighthActivity(){
        Intent intent =new Intent (this,EighthActivity.class);

        startActivity(intent);

    }
    public void openNinthActivity(){
        Intent intent =new Intent (this,NinthActivity.class);

        startActivity(intent);

    }













    public void openFourthActivity(){
        Intent intent =new Intent (this,FourthActivity.class);

        startActivity(intent);

    }






    private void Logout(){
      firebaseAuth.signOut();
      finish();
        startActivity(new Intent(SecondActivity.this,MainActivity.class));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.logoutMenu :{
                Logout();

            }

        }

        return super.onOptionsItemSelected(item);
    }
}

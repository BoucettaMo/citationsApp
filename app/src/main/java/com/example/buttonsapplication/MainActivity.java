package com.example.buttonsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       actionButton();


    }

    public void back(View view) {

        setContentView(R.layout.activity_main);
        actionButton();


    }


    public void actionButton() {
        final Button red = findViewById(R.id.red);
        final Button blue = findViewById(R.id.blue);
        final Button green = findViewById(R.id.green);
        final Button neutral = findViewById(R.id.neutral);
        final Button fire = findViewById(R.id.fire);
        final Button air = findViewById(R.id.air);
        final Button nature = findViewById(R.id.nature);
        final LinearLayout myLayout = findViewById(R.id.mainLayout);



        View.OnClickListener myhandler = new View.OnClickListener() {
            public void onClick(View v) {



                if (v== red) {
                    myLayout.setBackgroundResource(R.drawable.sahara);
                }
                if (v== blue) {
                    myLayout.setBackgroundResource(R.drawable.blue);
                }

                if (v== green) {
                    myLayout.setBackgroundResource(R.drawable.green);
                }

                if (v== nature) {
                    myLayout.setBackgroundResource(R.drawable.nature);
                }

                if (v== fire) {
                    myLayout.setBackgroundResource(R.drawable.fire);
                }

                if (v== air) {
                    myLayout.setBackgroundResource(R.drawable.air);
                }

                if (v== neutral) {
                    setContentView(R.layout.second);
                }






            }
        };








        red.setOnClickListener(myhandler);
        blue.setOnClickListener(myhandler);
        green.setOnClickListener(myhandler);
        neutral.setOnClickListener(myhandler);
        fire.setOnClickListener(myhandler);
        air.setOnClickListener(myhandler);
        nature.setOnClickListener(myhandler);





    }

    public void changeActivity(View view) {
        Intent intent = new Intent(MainActivity.this,
                MainActivity2.class);
        startActivity(intent);

    }



}
































































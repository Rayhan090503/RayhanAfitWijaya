package com.example.rayhanafitwijaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView love, orang, sirup, gmbr_bsr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        love = findViewById(R.id.love);
        orang = findViewById(R.id.orang);
        sirup = findViewById(R.id.img_2);
        gmbr_bsr = findViewById(R.id.gambarbesar);

        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(itn);
                finish();
            }
        });

        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(itn);
                finish();
            }
        });

        sirup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(itn);
                finish();
            }
        });

        gmbr_bsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(itn);
                finish();
            }
        });

    }
}
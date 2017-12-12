package com.example.syxflorent.medecinprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TextView_VoirPatients = (TextView) findViewById(R.id.TextView_VoirPatients);

            TextView_VoirPatients.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentPatient = new Intent(MainActivity.this, PatientsActivity.class);
                startActivity(intentPatient);
            }
        });

        TextView TextView_CreePatients = (TextView) findViewById(R.id.TextView_CreePatients);

        TextView_CreePatients.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCree = new Intent(MainActivity.this, CreeActivity.class);
                startActivity(intentCree);
            }
        });

    }
}

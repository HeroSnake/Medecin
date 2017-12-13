package com.example.syxflorent.medecinprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

public class ModifierActivity extends AppCompatActivity {

    TextView leMotif;
    Patient unPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier);

        Intent intent = getIntent();
        unPatient = (Patient) intent.getSerializableExtra("Patient");


        leMotif = findViewById(R.id.editMotif);


        final Button buttonConf = findViewById(R.id.btnConfirmer);
        buttonConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String motif = leMotif.getText().toString();
                unPatient.setMotif(motif);
                unPatient.save();

                //Intent intentPatient = new Intent(ModifierActivity.this, PatientDetailActivity.class);
                //startActivity(intentPatient);
            }
        });

    }
}

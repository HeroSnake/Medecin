package com.example.syxflorent.medecinprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class PatientDetailActivity extends AppCompatActivity {

    Patient unPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detail);

        Intent intent = getIntent();
        unPatient = (Patient) intent.getSerializableExtra("Patient");

        TextView viewNom = findViewById(R.id.TextViewNom);
        viewNom.setText(unPatient.getNom());

        TextView viewPrenom = findViewById(R.id.TextViewPrenom);
        viewPrenom.setText(unPatient.getPrenom());

        TextView viewDateN = findViewById(R.id.TextViewDateN);
        viewDateN.setText(unPatient.getDateNaissance());

        TextView viewChambre = findViewById(R.id.TextViewChambre);
        viewChambre.setText(unPatient.getChambre());

        TextView viewMotif = findViewById(R.id.TextViewMotif);
        viewMotif.setText(unPatient.getMotif());

        final Button button = findViewById(R.id.btnSupprimer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unPatient.delete();
            }
        });
    }
}

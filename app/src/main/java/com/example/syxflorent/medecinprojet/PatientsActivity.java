package com.example.syxflorent.medecinprojet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class PatientsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);

        ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        Iterator<Patient> listePatients = Patient.findAll(Patient.class);
        while (listePatients.hasNext()) {
            Patient monPatient = listePatients.next();
            lesPatients.add(monPatient);
        }

        PatientAdapter adapterPatient = new PatientAdapter(this, lesPatients);
        ListView listViewPatients = findViewById(R.id.listView_patients);
        listViewPatients.setAdapter(adapterPatient);

        listViewPatients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Patient monPatient;
                monPatient = (Patient) parent.getItemAtPosition(position);
                Intent i = new Intent(PatientsActivity.this, PatientDetailActivity.class);
                i.putExtra("Patient" ,  monPatient);
                startActivity(i);
            }
        });
    }
}

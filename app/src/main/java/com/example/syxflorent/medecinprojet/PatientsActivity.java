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

public class PatientsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);

        ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        lesPatients.add(new Patient("Dupont", "Gilles", new Date(1997,5,23), "C01", "Maladie"));
        lesPatients.add(new Patient("Macron", "Maxime", new Date(1965,6,1), "B21", "Président"));
        lesPatients.add(new Patient("Satan", "Marcella", new Date(1950,8,5), "A12", "Vieux"));


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

package com.example.syxflorent.medecinprojet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class CreeActivity extends AppCompatActivity {
    TextView leNom;
    TextView lePrenom;
    TextView laChambre;
    TextView leMotif;
    DatePicker laDateNaiss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cree);

        leNom = findViewById(R.id.nom);
        lePrenom = findViewById(R.id.prenom);
        laChambre = findViewById(R.id.chambre);
        leMotif = findViewById(R.id.motif);
        laDateNaiss = findViewById(R.id.dateNaissance);

        final Button button = findViewById(R.id.btnInscrire);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = leNom.getText().toString();
                String prenom = lePrenom.getText().toString();
                String chambre = laChambre.getText().toString();
                String motif = leMotif.getText().toString();
                int jour = laDateNaiss.getDayOfMonth();
                int mois = laDateNaiss.getMonth();
                int annee =  laDateNaiss.getYear();
                Patient nouveauPatient = new Patient(nom, prenom, new Date(annee, mois, jour), chambre, motif);
                nouveauPatient.save();
            }
        });
    }

}



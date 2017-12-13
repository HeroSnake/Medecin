package com.example.syxflorent.medecinprojet;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by syx.florent on 12/12/2017.
 */

class PatientAdapter extends ArrayAdapter<Patient> {
    public PatientAdapter (Activity context, ArrayList<Patient> patient) {

        super(context, 0, patient);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.liste_patients, parent, false);
        }
        Patient patientSelectionne = getItem(position);

        TextView nomTextView = listItemView.findViewById(R.id.nomPatient);
        nomTextView.setText(patientSelectionne.getNom());

        TextView prenomTextView = listItemView.findViewById(R.id.prenomPatient);
        prenomTextView.setText(patientSelectionne.getPrenom());

        TextView chambreTextView = listItemView.findViewById(R.id.chambrePatient);
        chambreTextView.setText(patientSelectionne.getChambre());

        return listItemView;
    }
}

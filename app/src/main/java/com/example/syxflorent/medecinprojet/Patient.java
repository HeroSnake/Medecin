package com.example.syxflorent.medecinprojet;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by syx.florent on 06/12/2017.
 */

public class Patient extends SugarRecord{
    private String _nom;
    private String _prenom;
    private Date _dateNaissance;
    private String _chambre;
    private String _motif;

    public Patient(){
    }
    public Patient (String unNom, String unPrenom, Date uneDateNaissance, String uneChambre, String unMotif){
        this._nom = unNom;
        this._prenom = unPrenom;
        this._dateNaissance = uneDateNaissance;
        this._chambre = uneChambre;
        this._motif = unMotif;
    }
}

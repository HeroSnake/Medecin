package com.example.syxflorent.medecinprojet;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by syx.florent on 06/12/2017.
 */

public class Patient extends SugarRecord implements Serializable{

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
    public String getNom(){return _nom;}
    public String getPrenom(){return _prenom;}
    public String getChambre(){return _chambre;}
    public String getDateNaissance(){
        int annee = _dateNaissance.getYear();
        int mois = _dateNaissance.getMonth();
        int jour = _dateNaissance.getDay();
        return jour + "/" + mois + "/" + annee;
    }
    public String getMotif(){return _motif;}
}

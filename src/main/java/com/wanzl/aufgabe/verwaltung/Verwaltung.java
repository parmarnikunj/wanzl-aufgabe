package com.wanzl.aufgabe.verwaltung;

import com.wanzl.aufgabe.Benutzer;

public class Verwaltung implements IVerwaltung{
    @Override
    public Benutzer Aktueller_Benutzer(String token) {
        return null;
    }

    @Override
    public void Umbenennen(String benutzerId, String email, String nickname) {

    }

    @Override
    public void Passwort_ändern(String benutzerId, String passwort) {

    }

    @Override
    public void Löschen(String benutzerId, String passwort) {

    }
}

package com.wanzl.aufgabe.registration;

import com.wanzl.aufgabe.Benutzer;

import java.util.UUID;


public class Registration implements IRegistrierung {
    Benutzer benutzer = new Benutzer();
    String email;
    String nickname;

    @Override
    public void Registrieren(String email, String passwort, String nickname) {
        this.email = email;
        this.nickname = nickname;

        benutzer.setEmail(email);
        benutzer.setNickname(nickname);
    }

    public String createTocken() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        return null;
    }
}

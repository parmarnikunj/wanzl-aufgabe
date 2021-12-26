package com.wanzl.aufgabe.registration;

import com.wanzl.aufgabe.Benutzer;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
    public static class EmailValidator{
        private final Pattern pattern;

        private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        public EmailValidator()
        {
            pattern = Pattern.compile(EMAIL_REGEX);
        }
        public boolean validate(final String email)
        {
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
}

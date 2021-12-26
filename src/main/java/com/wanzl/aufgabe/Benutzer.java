package com.wanzl.aufgabe;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class Benutzer {

    String Id;
    String Email;
    String Nickname;
    Date Registrierungsdatum;
    Date LetzteAnmeldung;
    Date LetzteAktualisierung;
}

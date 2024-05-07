package com.carworkshop.carworkshopapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Clients {
    private int ID_klienta;
    private String Imie;
    private String Nazwisko;
    private int numer_telefonu;
    private String adres_email;
    private String haslo;

    public int getID_klienta() {
        return ID_klienta;
    }

    public void setID_klienta(int ID_klienta) {
        this.ID_klienta = ID_klienta;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(int numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getAdres_email() {
        return adres_email;
    }

    public void setAdres_email(String adres_email) {
        this.adres_email = adres_email;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}



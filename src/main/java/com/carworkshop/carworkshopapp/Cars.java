package com.carworkshop.carworkshopapp;

public class Cars {
    private int ID_samochodu;
    private int ID_klienta;
    private String marka;
    private String model;
    private String rok_produkcji;
    private String numer_rejestracyjny;

    public int getID_samochodu() {
        return ID_samochodu;
    }

    public void setID_samochodu(int ID_samochodu) {
        this.ID_samochodu = ID_samochodu;
    }

    public int getID_klienta() {
        return ID_klienta;
    }

    public void setID_klienta(int ID_klienta) {
        this.ID_klienta = ID_klienta;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(String rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public String getNumer_rejestracyjny() {
        return numer_rejestracyjny;
    }

    public void setNumer_rejestracyjny(String numer_rejestracyjny) {
        this.numer_rejestracyjny = numer_rejestracyjny;
    }
}

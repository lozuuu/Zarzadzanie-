package com.carworkshop.carworkshopapp;

public class Reservations {



    private int ID_rezerwacji;
    private int ID_samochodu;
    private String opis_problemu;
    private String data_rezerwacji;
    private String godzina_rezerwacji;
    private String status;
    private int ID_klienta;

    public int getID_rezerwacji() {
        return ID_rezerwacji;
    }

    public void setID_rezerwacji(int ID_rezerwacji) {
        this.ID_rezerwacji = ID_rezerwacji;
    }

    public int getID_samochodu() {
        return ID_samochodu;
    }

    public void setID_samochodu(int ID_samochodu) {
        this.ID_samochodu = ID_samochodu;
    }

    public String getOpis_problemu() {
        return opis_problemu;
    }

    public void setOpis_problemu(String opis_problemu) {
        this.opis_problemu = opis_problemu;
    }

    public String getData_rezerwacji() {
        return data_rezerwacji;
    }

    public void setData_rezerwacji(String data_rezerwacji) {
        this.data_rezerwacji = data_rezerwacji;
    }

    public String getGodzina_rezerwacji() {
        return godzina_rezerwacji;
    }

    public void setGodzina_rezerwacji(String godzina_rezerwacji) {
        this.godzina_rezerwacji = godzina_rezerwacji;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getID_klienta() {
        return ID_klienta;
    }

    public void setID_klienta(int ID_klienta) {
        this.ID_klienta = ID_klienta;
    }
}

package com.example.demo1;

public class DateRapoarte
{
    String nume, prenume, continut, raport;

    public DateRapoarte(String nume, String prenume, String continut, String raport) {
        this.nume = nume;
        this.prenume = prenume;
        this.continut = continut;
        this.raport = raport;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public void setRaport(String raport) {
        this.raport = raport;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getContinut() {
        return continut;
    }

    public String getRaport() {
        return raport;
    }
}
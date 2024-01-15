package com.example.demo1;

public class DateProgramari
{
    String nume, prenume, nrTelefon, medic, dataProgramarii, ora;

    public DateProgramari(String nume, String prenume, String nrTelefon, String medic, String dataProgramarii) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
        this.medic = medic;
        this.dataProgramarii = dataProgramarii;
        this.ora = ora;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public void setDataProgramarii(String dataProgramarii) {
        this.dataProgramarii = dataProgramarii;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getMedic() {
        return medic;
    }

    public String getDataProgramarii() {
        return dataProgramarii;
    }

    public String getOra() {
        return ora;
    }

}

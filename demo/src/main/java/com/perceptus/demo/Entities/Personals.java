package com.perceptus.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personaliaId;
    private String imie;
    private String nazwisko;
    private String telefon;
    private String pesel;
    private String dataUrodzenia;
    private char plec;

    protected Personals() {};
    
    public Personals(String imie, String nazwisko, String telefon, String pesel, String dataUrodzenia, char plec){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    @Override
    public String toString(){
        return String.format("Personalia [id = %d, imie = %s, nazwisko = %s, telefon = %s, pesel = %s, data urodzenia = %s, plec = %c]",
        this.personaliaId, this.imie, this.nazwisko, this.telefon, this.pesel, this.dataUrodzenia, this.plec);
    }

    //Settery i gettery
    public long getPersonaliaId(){
        return this.personaliaId;
    }

    public String getImie(){
        return this.imie;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public String getTelefon(){
        return this.telefon;
    }

    public String getPesel(){
        return this.pesel;
    }

    public String getDataUrodzenia(){
        return this.dataUrodzenia;
    }

    public char getPlec(){
        return this.plec;
    }


    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setTelefon(String telefon){
        this.telefon = telefon;
    }

    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public void setDataUrodzenia(String data){
        this.dataUrodzenia = data;
    }

    public void setPlec(char plec){
        this.plec = plec;
    }
}

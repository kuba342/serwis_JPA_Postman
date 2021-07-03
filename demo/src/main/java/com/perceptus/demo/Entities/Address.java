package com.perceptus.demo.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AdresId;
    private String kodPocztowy;
    private String miasto;
    private String ulica;
    private String numerDomu;
    private int numerMiekszania;

    protected Address(){};

    public Address(String kodP, String miasto, String ulica, String numerD, int numerM){
        this.kodPocztowy = kodP;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numerDomu = numerD;
        this.numerMiekszania = numerM;
    }

    @Override
    public String toString(){
        return String.format("Adres [id = %d, kod pocztowy = %s, miasto = %s, ulica = %s, numer domu = %s, numer mieszkania = %s]",
        this.AdresId, this.kodPocztowy, this.miasto, this.ulica, this.numerDomu, this.numerMiekszania
        );
    }

    //Settery i gettery
    public long getAdresId(){
        return this.AdresId;
    }

    public String getKodPocztowy(){
        return this.kodPocztowy;
    }

    public String getMiasto(){
        return this.miasto;
    }

    public String getUlica(){
        return this.ulica;
    }

    public String getNumerDomu(){
        return this.numerDomu;
    }

    public int getNumerMieszkania(){
        return this.numerMiekszania;
    }


    public void setKodPocztowy(String kod){
        this.kodPocztowy = kod;
    }

    public void setMiasto(String miasto){
        this.miasto = miasto;
    }

    public void setUlica(String ulica){
        this.ulica = ulica;
    }

    public void setNumerDomu(String numer){
        this.numerDomu = numer;
    }

    public void setNumerMieszkania(int numer){
        this.numerMiekszania = numer;
    }


}
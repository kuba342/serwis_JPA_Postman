package com.perceptus.demo.Entities;

//import javax.annotation.processing.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

enum TreatType{
    ICD9("ICD9"),
    ICD10("ICD10");

    String rodzaj;

    private TreatType(String str){
        this.rodzaj = str;
    }
}

@Entity
public class ElementsOfTreatment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kod;
    private TreatType rodzaj;
    private String opis;

    protected ElementsOfTreatment(){};

    public ElementsOfTreatment(TreatType rodzaj, String opis){
        this.rodzaj = rodzaj;
        this.opis = opis;
    }

    @Override
    public String toString(){
        return String.format("Element leczenia [id = %d, rodzaj = %s, opis = %s]", this.kod, rodzaj.toString(), this.opis);
    }

    //Settery i gettery
    public Long getKod(){
        return this.kod;
    }

    public TreatType getRodzaj(){
        return this.rodzaj;
    }

    public String getOpis(){
        return this.opis;
    }

    public void setRodzaj(TreatType type){
        this.rodzaj = type;
    }

    public void setOpis(String str){
        this.opis = str;
    }
}

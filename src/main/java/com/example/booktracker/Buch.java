package com.example.booktracker;


public class Buch {
    private String titel;
    private String autor;
    private int bewertung;

    public Buch(String titel, String autor, int bewertung){
        this.titel = titel;
        this.autor = autor;
        this.bewertung = bewertung;
    }

    public String getTitel(){
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public int getBewertung(){
        return bewertung;
    }
}

package sio.vfeldenring;

import java.util.ArrayList;

public class Classe {
    private String nom;
    private String imgFace;
    private String imgDos;
    private ArrayList<Arme> armes;
    private int pv;
    private int defense;
    private int force;
    private int chance;
    private int vitesse;

    public Classe(String nom, String imgFace, String imgDos,ArrayList<Arme> armes, int pv, int defense, int force, int chance, int vitesse) {
        this.nom = nom;
        this.imgFace = imgFace;
        this.imgDos = imgDos;
        this.pv = pv;
        this.defense = defense;
        this.force = force;
        this.chance = chance;
        this.vitesse = vitesse;
        this.armes = armes;
    }

    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void setArmes(ArrayList<Arme> armes) {
        this.armes = armes;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImgFace() {
        return imgFace;
    }

    public void setImgFace(String imgFace) {
        this.imgFace = imgFace;
    }

    public String getImgDos() {
        return imgDos;
    }

    public void setImgDos(String imgDos) {
        this.imgDos = imgDos;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}

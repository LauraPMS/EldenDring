package sio.vfeldenring;

import javafx.scene.control.SpinnerValueFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classe {
    private String nom;
    private String imgPerso;
    private ArrayList<Arme> armes;
    private ArrayList<Sort> sortsDispo;
    private int pv;
    private float pvMax;
    private int defense;
    private int force;
    private int chance;
    private int vitesse;
    private Arme main;
    private ArrayList<Sort> sortsN;
    private ArrayList<Sort> sortsS;
    private int nbSoin;

    public Classe(String nom, String imgPerso,
                  ArrayList<Arme> armes,
                  ArrayList<Sort> sorts,
                  ArrayList<Sort> sortsS, int pv,
                  int pvMax, int defense, int force,
                  int chance, int vitesse, Arme main,
                  int nbSoin) {
        this.nom = nom;
        this.pv = pv;
        this.defense = defense;
        this.force = force;
        this.chance = chance;
        this.vitesse = vitesse;
        this.armes = armes;
        this.sortsN = sorts;
        this.sortsS = sortsS;
        this.main = main;
        this.imgPerso = imgPerso;
        this.nbSoin=nbSoin;
        this.pvMax = pvMax;
    }

    public ArrayList<Sort> getSortsN() {
        return sortsN;
    }

    public ArrayList<Sort> getSortsS() {
        return sortsS;
    }

    public int getNbSoin() {
        return nbSoin;
    }

    public void setNbSoin(int nbSoin) {
        this.nbSoin = nbSoin;
    }

    public String getImgPerso() {
        return imgPerso;
    }

    public void setImgPerso(String imgPerso) {
        this.imgPerso = imgPerso;
    }

    public ArrayList<Sort> getSortsDispo() {
        return sortsDispo;
    }

    public void setSortsDispo(ArrayList<Sort> sortsDispo) {
        this.sortsDispo = sortsDispo;
    }

    public Arme getMain() {
        return main;
    }

    public void setMain(Arme main) {
        this.main = main;
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

    public float getPvMax() {
        return pvMax;
    }

    public void setPvMax(float pvMax) {
        this.pvMax = pvMax;
    }
    // Fonction de la classe autre que getter and setter

    public boolean testMort(){
        if(this.pv<=0){
            return true;
        }
        return false;
    }
    public void seSoigne(){
         this.pv+=20;
         if(this.pv>this.pvMax){
             this.fullPV();
         }
    }
    public void fullPV()
    {
        this.pv = (int) this.pvMax; // conversion de pvMAx(float) en int avec (int) devant. perte de précision (prend seulement l'entier.)
    }

    public int degatTotal(Sort s, Arme a){
        int degatArme = a.getPuissance();
        int degatSort = s.getPuissance();
        return degatArme + degatSort;
    }

    public boolean touche(Arme a, Sort s){
        int nbAlea = alea();
        if (nbAlea>10){
            return true;
        }
        return false;
    }
    public boolean touche(){
        return alea()<=95;
    }

    public void attaque(Arme a,Boss b){
        int degat = this.getForce() + a.getPuissance();
        if (this.touche()){
            b.setPv(b.getPv()-degat);
        }

    }
    public void attaqueSort( Arme a, Sort s, Boss b) {
        int degat = degatTotal(s, a)+this.getForce();
        if(this.touche(a,s)){
            b.setPv(b.getPv()-degat);
        }
    }



    public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100


    public void augmenterStat(int stat){
        this.pv += stat;
        this.force += stat;
    }
}

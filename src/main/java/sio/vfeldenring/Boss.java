package sio.vfeldenring;

public class Boss {
    private String nom;
    private String imgDos;
    private int force;
    private int pv;
    private int vitesse;

    public Boss(String nom, String imgDos, int force, int pv, int vitesse) {
        this.nom = nom;
        this.imgDos = imgDos;
        this.force = force;
        this.pv = pv;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImgDos() {
        return imgDos;
    }

    public void setImgDos(String imgDos) {
        this.imgDos = imgDos;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}

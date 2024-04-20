package sio.vfeldenring;

public class Boss {
    private String nom;
    private String imgFace;
    private int force;
    private int pv;
    private float pvMax;
    // + la vitesse est basse et plus vite il lance le gros coup critique mortel de la mort qui tue
    private int vitesse;
    private String arene;

    public Boss(String nom, String imgDos, int force, int pv, int pvMax, int vitesse, String arene){
        this.nom = nom;
        this.imgFace = imgDos;
        this.force = force;
        this.pv = pv;
        this.pvMax=pvMax;
        this.vitesse = vitesse;
        this.arene = arene;
    }

    public String getArene() {
        return arene;
    }

    public void setArene(String arene) {
        this.arene = arene;
    }

    public String getImgFace() {
        return imgFace;
    }

    public void setImgFace(String imgFace) {
        this.imgFace = imgFace;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public float getPvMax() {
        return pvMax;
    }

    public boolean testMort(){
        if (this.pv<=0){
            return true;
        }
        return false;
    }
    public void randomAttaque(Classe c){
        c.setPv(c.getPv()-alea());
    }

    public int alea() { return (int)(Math.random() * this.force ); } // 0 to la force du boss

}

package sio.vfeldenring;

public class Arme {
    private String nom;
    private String Description;
    private String icon;
    private String imgEntier;
    private int puissance ;
    private Sort s1;
    private Sort s2;

    public Arme(String nom, String description, String icon, String imgEntier, int puissance, Sort s1, Sort s2) {
        this.nom = nom;
        Description = description;
        this.icon = icon;
        this.imgEntier = imgEntier;
        this.puissance = puissance;
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImgEntier() {
        return imgEntier;
    }

    public void setImgEntier(String imgEntier) {
        this.imgEntier = imgEntier;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public Sort getS1() {
        return s1;
    }

    public void setS1(Sort s1) {
        this.s1 = s1;
    }

    public Sort getS2() {
        return s2;
    }

    public void setS2(Sort s2) {
        this.s2 = s2;
    }
}

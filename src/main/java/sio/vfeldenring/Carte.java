package sio.vfeldenring;

public class Carte {
    private String nom;
    private String effet;
    private int pv;
    private int atq;
    private String type;
    private String img;
    private String fond;
    private String animation;
    private String description;
    private int rarete;
    private boolean disponible;

    public Carte(String type, String nom, String effet, String img, String fond, String animation, int rarete,boolean disponible, int pv, int atq, String description) {
        this.nom = nom;
        this.type = type;
        this.effet = effet;
        this.img = img;
        this.fond = fond;
        this.animation = animation;
        this.rarete = rarete;
        this.disponible = disponible;
        this.pv = pv;
        this.atq = atq;
    }

    public Carte(String type, String nom,
                 String img, String fond,
                 String animation,
                 int rarete,
                 boolean disponible, int pv, int atq, String description) {
        this.nom = nom;
        this.type = type;
        this.img = img;
        this.fond = fond;
        this.animation = animation;
        this.rarete = rarete;
        this.disponible = disponible;
        this.pv = pv;
        this.atq = atq;
        this.description = description;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAtq() {
        return atq;
    }

    public void setAtq(int atq) {
        this.atq = atq;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEffet() {
        return effet;
    }

    public void setEffet(String effet) {
        this.effet = effet;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFond() {
        return fond;
    }

    public void setFond(String fond) {
        this.fond = fond;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public int getRarete() {
        return rarete;
    }

    public void setRarete(int rarete) {
        this.rarete = rarete;
    }

}


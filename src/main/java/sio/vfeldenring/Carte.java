package sio.vfeldenring;

public class Carte {
    private String nom;
    private String effet;
    private String type;
    private String img;
    private String fond;
    private String animation;
    private int rarete;
    private boolean disponible;

    public Carte(String type, String nom, String effet, String img, String fond, String animation, int rarete,boolean disponible) {
        this.nom = nom;
        this.type = type;
        this.effet = effet;
        this.img = img;
        this.fond = fond;
        this.animation = animation;
        this.rarete = rarete;
        this.disponible = disponible;
    }

    public Carte(String type, String nom,
                 String img, String fond,
                 String animation,
                 int rarete,
                 boolean disponible) {
        this.nom = nom;
        this.type = type;
        this.img = img;
        this.fond = fond;
        this.animation = animation;
        this.rarete = rarete;
        this.disponible = disponible;
    }

    public String getType() {
        return type;
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


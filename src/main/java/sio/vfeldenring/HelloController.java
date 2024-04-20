package sio.vfeldenring;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private AnchorPane apClasse;
    @FXML
    private Label lblChance;
    @FXML
    private Label lblForce;
    @FXML
    private AnchorPane ap;
    @FXML
    private Label lblVitesse;
    @FXML
    private Label lblDefense;
    @FXML
    private AnchorPane apInventaire;
    @FXML
    private ImageView persoView;
    @FXML
    private Label lblPv;
    @FXML
    private ImageView siteMorgot;
    @FXML
    private ImageView siteMalenia;
    @FXML
    private Label lblNom;
    @FXML
    private ImageView siteMaliketh;
    @FXML
    private AnchorPane apBastion;
    @FXML
    private AnchorPane apMap;
    @FXML
    private ImageView siteRadahn;
    @FXML
    private ImageView siteGodrick;
    @FXML
    private ImageView siteRenalla;
    @FXML
    private ImageView siteFinal;
    @FXML
    private ImageView icons1;
    @FXML
    private ImageView icons2;
    @FXML
    private AnchorPane apEnia;
    @FXML
    private ImageView imgArme;
    @FXML
    private AnchorPane apMiriel;
    @FXML
    private ImageView sortArme1;
    @FXML
    private ImageView sortArme2;
    @FXML
    private ImageView arme5;
    @FXML
    private ImageView arme6;
    @FXML
    private ImageView arme1;
    @FXML
    private ImageView arme2;
    @FXML
    private ImageView arme3;
    @FXML
    private ImageView arme4;
    @FXML
    private Label lblNomS1;
    @FXML
    private Label lblNomS2;
    @FXML
    private Label lblArme;
    @FXML
    private Label lblPuiS2;
    @FXML
    private Label lblPuiS1;
    @FXML
    private Label lblPuiArme;
    @FXML
    private ImageView imgArene;
    @FXML
    private ImageView imgBoss;
    @FXML
    private AnchorPane apCombat;
    @FXML
    private ImageView imgPersoCombat;
    @FXML
    private ImageView iconSoin;
    @FXML
    private Label lblNomBoss;
    @FXML
    private ImageView imgArmeRonin;
    @FXML
    private ProgressBar pvBoss;
    @FXML
    private ImageView iconSort1;
    @FXML
    private ImageView iconSort2;
    @FXML
    private ProgressBar pouvoir;
    @FXML
    private ProgressBar pvMoi;
    @FXML
    private Pane dialogue;
    @FXML
    private ImageView imgArmeLoup;


    public String contenuIcon1;
    public String contenuIcon2;
    public String contenuIcon3;
    public String contenuIcon4;
    public String contenuIcon5;
    public String contenuIcon6;

    public Classe moi;
    public int soin;

    public Boss bossActuel;
// Création des sorts
    private Sort pirouette = new Sort("Pirouette", "Sort/pirouette.png", "vitesse", 10);
    private Sort griffe = new Sort("Griffe", "Sort/doubleLame.png", "force", 10);
    private Sort cailloux = new Sort("Pluie de grelons", "Sort/pioupiou.png", "magique",15);
    private Sort gravitation = new Sort("Gravitation", "Sort/gravitation.png", "force", 15);
    private Sort cri = new Sort("Cri de Troll", "Sort/cri.png", "force", 15);
    private Sort ombre = new Sort("Ombre", "Sort/ombre.png", "vitesse", 20);
    private Sort lameFeu = new Sort("LameFeu", "Sort/lameFeu.png", "feu", 20);
    private Sort lameGlace = new Sort("Lame de glace", "Sort/lameGlace.png", "glace", 25);
    private Sort riverBlood = new Sort("BloodRiver", "Sort/riverBlood.png", "sang", 25);
    private Sort doubleLame = new Sort("Lame Double", "Sort/lameDouble.png", "force",20);
    private Sort soleil = new Sort("Soleil", "Sort/soleil.png", "feu", 30);
    private Sort lune = new Sort("Lune Noire", "Sort/lune.png", "glace",30);
    private Sort petSacre = new Sort("Pet Sacré", "Sort/goldenProut.png", "sacre", 50);

// Création des armes
    public Arme katana = new Arme("Katana", "", "Arme/ronin/katana.png", "", 15, griffe, pirouette, false);
    public Arme epee = new Arme("Épée de Chevalier","","Arme/loup/epee.png", "", 15, cri, ombre, false);
    public Arme baguette = new Arme("Baguette", "", "Arme/mage/baguette.png", "", 10, cailloux,gravitation, false);
    public Arme bloodRiver = new Arme("Blood River", "", "Arme/ronin/riverBlood.png", "", 25, lameFeu, riverBlood, false);
    public Arme grandEspadon = new Arme("Guts", "", "Arme/loup/ guts.png", "", 30, griffe, doubleLame,false);
    public Arme sceptre = new Arme("Sceptre Royal", "", "Arme/sceptre.png", "", 20, soleil, lune,false);

    private ArrayList<Arme> armes = new ArrayList<Arme>();
    private ArrayList<Sort> sortsDispo = new ArrayList<>();

// Création des classes de personnage
    public Classe loup = new Classe("Loup", "Armure/luiLoup.png", armes,50,200,12, 16,6, 12, katana, sortsDispo,5);
    public Classe ronin = new Classe("Ronin","Armure/luiRonin.png", armes, 40, 150,13, 12, 8, 13, katana, sortsDispo,5);
    public Classe mage = new Classe("Mage", "Armure/luiMage.png", armes, 30,100, 7, 8, 10, 15,baguette, sortsDispo,5);

    // Création des Boss

    public Boss godrick = new Boss("Godrick le Greffé", "Boss/goofy_godrick.png", 10, 100,100, 3, "Background/Arene/arene_godrick.jpg");
    public Boss rennala = new Boss("Rennala", "Boss/goofy_renalla.png", 15, 150,150,2, "Background/Arene/arene_rennala.jpg");
    public Boss radahn = new Boss("Général Radahn", "Boss/goofy_radahn.png", 20,200,200,3, "Background/Arene/arene_radahn.jpg");
    public Boss morgot = new Boss("Morgot le Roi Déchu","Boss/goofy_morgot.png",25,250,250,2,"Background/Arene/arene_morgot.jpg");
    public Boss maliketh = new Boss("La lame d'ébène", "Boss/maliketh.png", 35, 300,300, 2, "Background/Arene/arene_maliketh.png");
    public Boss malenia = new Boss("Malenia", "Boss/goofy_malenia.png", 35,300,300,1,"Background/Arene/arene_malenia.jpg");
    @FXML
    private ImageView imgArmeMage;
    @FXML
    private ImageView imgArmeMageInventaire;
    @FXML
    private ImageView imgArmeLoupInventaire;
    @FXML
    private ImageView imgArmeRoninInventaire;
    @FXML
    private Label lblResteSoin;
    @FXML
    private ImageView iconAttaque;
    @FXML
    private ImageView imgGG;
    @FXML
    private ImageView imgPerdu;
    @FXML
    private Pane paneGG;

    // Fonction du debut rempli les listes d'armes et de sort
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        imgArmeRonin.setVisible(false);
        imgArmeLoup.setVisible(false);
        imgArmeMage.setVisible(false);
        imgArmeMageInventaire.setVisible(false);
        imgArmeLoupInventaire.setVisible(false);
        imgArmeRoninInventaire.setVisible(false);

        changeAp(apClasse);
        ArrayList<Arme> lesArmes = new ArrayList<Arme>();
        lesArmes.add(katana);
        lesArmes.add(epee);
        lesArmes.add(baguette);
        lesArmes.add(bloodRiver);
        lesArmes.add(grandEspadon);
        lesArmes.add(sceptre);

        ArrayList<Sort> lesSorts = new ArrayList<Sort>();
        lesSorts.add(pirouette);
        lesSorts.add(griffe);
        lesSorts.add(cailloux);
        lesSorts.add(cri);
        lesSorts.add(soleil);
        lesSorts.add(lune);
        lesSorts.add(ombre);
        lesSorts.add(lameFeu);
        lesSorts.add(doubleLame);
        lesSorts.add(riverBlood);
        lesSorts.add(gravitation);
        lesSorts.add(lameGlace);
        lesSorts.add(petSacre);

        // Changer la couleur de la barre de vie
        String progressBarStyle = "-fx-background-color: white; " + // Couleur de fond
                "-fx-accent: red;";          // Couleur de la barre de progression
        // Appliquer le style à la barre de progression
        pvBoss.setStyle(progressBarStyle);
        pvMoi.setStyle(progressBarStyle);
    }

    // Choix de la classe du personnage + attrobution des stats

    public void maj(Classe c){
        lblNom.setText(c.getNom());
        writeRapideInt(lblPv, c.getPv());
        writeRapideInt(lblChance, c.getChance());
        writeRapideInt(lblDefense, c.getDefense());
        writeRapideInt(lblForce, c.getForce());
        writeRapideInt(lblVitesse, c.getVitesse());
        changeImageViewImg(persoView, c.getImgPerso());
        moi = c;
        soin = moi.getNbSoin();
        writeRapideInt(lblResteSoin, soin);

        writeRapideInt(lblResteSoin, moi.getNbSoin());

        arme1.setImage(null);
        arme2.setImage(null);
        arme3.setImage(null);
        arme4.setImage(null);
        arme5.setImage(null);
        arme6.setImage(null);

        // Afficher les armes disponibles
        int index = 1;
        for(Arme arme : c.getArmes()) {
            if(arme.isDispo() && index <= 6) {
                switch(index) {
                    case 1:
                        changeImageViewImg(arme1, arme.getIcon());
                        contenuIcon1 = arme.getNom();
                        break;
                    case 2:
                        changeImageViewImg(arme2, arme.getIcon());
                        contenuIcon2 = arme.getNom();
                        break;
                    case 3:
                        changeImageViewImg(arme3, arme.getIcon());
                        contenuIcon3 = arme.getNom();
                        break;
                    case 4:
                        changeImageViewImg(arme4, arme.getIcon());
                        contenuIcon4 = arme.getNom();
                        break;
                    case 5:
                        changeImageViewImg(arme5, arme.getIcon());
                        contenuIcon5 = arme.getNom();
                        break;
                    case 6:
                        changeImageViewImg(arme6, arme.getIcon());
                        contenuIcon6 = arme.getNom();
                        break;
                }
                index++;
            }
        }
        changerDescEtSortArmes(contenuIcon1);
    }



    @FXML
    public void changeLoup(Event event) {
        changeAp(apInventaire);
        epee.setDispo(true);
        katana.setDispo(true);
        armes.add(epee);
        armes.add(katana);
        imgArmeLoup.setVisible(true);
        imgArmeLoupInventaire.setVisible(true);
        maj(loup);
    }
    @FXML
    public void changeSamurai(Event event) {
        changeAp(apInventaire);
        katana.setDispo(true);
        bloodRiver.setDispo(true);
        armes.add(katana);
        armes.add(bloodRiver);
        imgArmeRonin.setVisible(true);
        imgArmeRoninInventaire.setVisible(true);
        maj(ronin);
    }

    @FXML
    public void changeAstrologue(Event event) {
        changeAp(apInventaire);
        baguette.setDispo(true);
        sceptre.setDispo(true);
        armes.add(baguette);
        armes.add(sceptre);
        imgArmeMage.setVisible(true);
        imgArmeMageInventaire.setVisible(true);
        maj(mage);
    }

    // Fonction permettant de changer les AnchorPane

    @FXML
    public void changeApMap(Event event) {
        changeAp(apMap);
    }
    @FXML
    public void changeApMiriel(Event event) {
        changeAp(apMiriel);
    }

    @FXML
    public void changeApBastion(Event event) {
        changeAp(apBastion);
    }

    @FXML
    public void changeApInventaire(Event event) {
        changeAp(apInventaire);
        maj(moi);
    }

    @FXML
    public void changeApEnia(Event event) {
        changeAp(apEnia);
    }

    // ------------------------------------------------------------------------------//
    // attribuer l'arme choisi en tant qu'arme principal


    public Arme getArme(String nom){
        for (int i=0; i<armes.size(); i++){
            if(armes.get(i).getNom()==nom){
                return armes.get(i);
            }
        }
        System.out.println("Arme non trouvé");
        return null;
    }

    public Arme getSort(String nom){
        for (int i=0; i<armes.size(); i++){
            if(armes.get(i).getNom()==nom){
                return armes.get(i);
            }
        }
        System.out.println("Arme non trouvé");
        return null;
    }

    public void changerDescEtSortArmes(String contenu){
        Arme arme = getArme(contenu);
        moi.setMain(getArme(contenu));
        System.out.println(arme);
        changeImageViewImg(icons1, arme.getS1().getImg());
        changeImageViewImg(icons2, arme.getS2().getImg());
        lblArme.setText(arme.getNom());
        lblNomS1.setText(arme.getS1().getNom());
        lblNomS2.setText(arme.getS2().getNom());
        writeRapideInt(lblPuiArme, arme.getPuissance());
        writeRapideInt(lblPuiS1, arme.getS1().getPuissance());
        writeRapideInt(lblPuiS2, arme.getS2().getPuissance());
        if(moi==loup){
            changeImageViewImg(imgArmeLoupInventaire, moi.getMain().getIcon());
        } else if (moi==mage) {
            changeImageViewImg(imgArmeMageInventaire, moi.getMain().getIcon());
        }
        else{
            changeImageViewImg(imgArmeRoninInventaire, moi.getMain().getIcon());
        }
    }

    @FXML
    public void changeArme1(Event event) {
        changerDescEtSortArmes(contenuIcon1);
    }
    @FXML
    public void changeArme2(Event event) {
        changerDescEtSortArmes(contenuIcon2);
    }

    @FXML
    public void changeArmes3(Event event) {
        changerDescEtSortArmes(contenuIcon3);
    }
    @FXML
    public void changeArme4(Event event) {
        changerDescEtSortArmes(contenuIcon4);
    }
    @FXML
    public void changeArme5(Event event) {
        changerDescEtSortArmes(contenuIcon5);
    }
    @FXML
    public void changeArme6(Event event) {
        changerDescEtSortArmes(contenuIcon6);
    }





    // ---------------------------------------------------------------------------------------------------------------
    // Lance le combat du site selectionné ---------------------------------------------------------------------------

    public void majCombat(Boss boss, Classe classe){
        changeAp(apCombat);
        changeImageViewImg(imgArene, boss.getArene());
        changeImageViewImg(imgBoss, boss.getImgFace());
        changeImageViewImg(imgArmeLoup, moi.getMain().getIcon());
        changeImageViewImg(imgPersoCombat, moi.getImgPerso());
        changeImageViewImg(iconSort1, moi.getMain().getS1().getImg());
        changeImageViewImg(iconSort2, moi.getMain().getS2().getImg());
        changeImageViewImg(iconAttaque, moi.getMain().getIcon());
        changeImageViewImg(iconSoin, "Item/estus.png");
        lblNomBoss.setText(boss.getNom());
        soin = 5;
        writeRapideInt(lblResteSoin,soin);
        pvMoi.setProgress(1);
        pvBoss.setProgress(1);
        bossActuel = boss;

    }
    public void majPV(Boss b, Classe c){
        double nvPvBoos = b.getPv()/b.getPvMax();
        pvBoss.setProgress(nvPvBoos);
        double nvPvMoi = c.getPv()/c.getPvMax();
        pvMoi.setProgress(nvPvMoi);
        if(bossActuel.testMort()){
            paneGG.setVisible(true);
            imgGG.setVisible((true));
        } else if(moi.testMort()) {
            paneGG.setVisible(true);
            imgPerdu.setVisible(true);
        }
    }
    @FXML
    public void lanceMorgot(Event event) {
        majCombat(morgot, moi);
    }

    @FXML
    public void lanceFinal(Event event) {
    }

    @FXML
    public void lanceMalenia(Event event) {
        majCombat(malenia, moi);
    }

    @FXML
    public void lanceMaliketh(Event event) {
        majCombat(maliketh, moi);
    }

    @FXML
    public void lanceRenalla(Event event) {
        majCombat(rennala,moi);
    }

    @FXML
    public void lanceGodrick(Event event) {
        majCombat(godrick, moi);
    }

    @FXML
    public void lanceRadahn(Event event) {
        majCombat(radahn, moi);
    }


//------------------------------------------Fonction utile--------------------------------------------------------------
// Genere un nombre aleatoire entre 0 et 100. ------------------------------------------------------------------- //
public int alea() { return (int)(Math.random() * 101 ); } // 0 to 100

    // Prend un entier qui ira remplir le label. -------------------------------------------------------------------- //
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
        return;
    }

    // Prend une image qui ira remplacer l'image view --------------------------------------------------------------- //
    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/images/"+linkImage
                        ).toExternalForm()
                )
        );
    }

    public String getImageUrl(ImageView imageView){
        Image image = imageView.getImage();
        if (image != null) {
            String ch =  image.getUrl();
            ch = ch.substring(74);
            return ch;
        } else {
            return null; // L'ImageView n'affiche aucune image
        }
    }

    public void visible (AnchorPane ap){ap.setVisible(true);}
    public void invisible(AnchorPane ap){ap.setVisible(false);}
    public void clearAll(){
        invisible(apClasse);
        invisible(apInventaire);
        invisible(apMap);
        invisible(apBastion);
        invisible(apEnia);
        invisible(apMiriel);
        invisible(apCombat);
        imgGG.setVisible(false);
        imgPerdu.setVisible(false);
        paneGG.setVisible(false);
    }
    public void changeAp(AnchorPane ap){
        clearAll();
        visible(ap);
    }

    @FXML
    public void lanceSort2(Event event) {
        moi.attaqueSort(moi.getMain(), moi.getMain().getS2(), bossActuel);
        System.out.println(bossActuel.getPv());
        bossActuel.randomAttaque(moi);
        majPV(bossActuel, moi);
    }

    @FXML
    public void lanceAttaque(Event event) {
        moi.attaque(moi.getMain(), bossActuel);
        System.out.println(bossActuel.getPv());
        bossActuel.randomAttaque(moi);
        majPV(bossActuel,moi);
    }

    @FXML
    public void lanceSort1(Event event) {
        moi.attaqueSort(moi.getMain(), moi.getMain().getS1(), bossActuel);
        System.out.println(bossActuel.getPv());
        bossActuel.randomAttaque(moi);
        majPV(bossActuel, moi);
    }

    @FXML
    public void soigne(Event event) {
        soin--;
        if(soin<=0){
            writeRapideInt(lblResteSoin,0);
            changeImageViewImg(iconSoin, "Item/soinVide.png");
        }
        else{
            moi.setPv(moi.getPv()+25);
            writeRapideInt(lblResteSoin, soin);
        }
        bossActuel.randomAttaque(moi);
        majPV(bossActuel,moi);

    }


    public int nbRetourMap;
    @FXML
    public void retourMap(Event event) {
        nbRetourMap+=1;
        if(nbRetourMap==2){
            changeAp(apMap);
            nbRetourMap = 0;
        }
    }
}
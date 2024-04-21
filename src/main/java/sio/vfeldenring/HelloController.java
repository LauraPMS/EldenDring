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


    // Contenu des armes de l'inventaire. Contient le nom de chanque arme pour ensuite retrouvé leur objet correspondant et équipe le perso avec
    public String contenuIcon1;
    public String contenuIcon2;
    public String contenuIcon3;
    public String contenuIcon4;
    public String contenuIcon5;
    public String contenuIcon6;

    // Contenu des Sorts Normaux (S1) et spéciaux (S2)
    // Les normaux utilise la moitié de la barre d'exp tandis que les spéciaux font plus mal mais utlilise tout les barre d'xp
    public String contenuSortNorm1;
    public String contenuSortNorm2;
    public String contenuSortNorm3;
    public String contenuSortNorm4;
    public String contenuSortNorm5;
    public String contenuSortNorm6;
    public String contenuSortSpec1;
    public String contenuSortSpec2;
    public String contenuSortSpec3;
    public String contenuSortSpec4;
    public String contenuSortSpec5;
    public String contenuSortSpec6;


    // moi, nombre de soin, boss, argent
    public Classe moi;
    public int soin;
    public Boss bossActuel;
    public int monnaie;



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

    // Samurai
    public Arme katana = new Arme("Katana", "", "Arme/ronin/katana.png", "", 15, griffe, pirouette, false);
    public Arme bloodRiver = new Arme("Blood River", "", "Arme/ronin/riverBlood.png", "", 25, lameFeu, riverBlood, false);

    // Magie
    public Arme baguette = new Arme("Baguette", "", "Arme/mage/baguette.png", "", 10, cailloux,gravitation, false);
    public Arme sceptre = new Arme("Sceptre Royal", "", "Arme/sceptre.png", "", 20, soleil, lune,false);

    // Chevalier
    public Arme epee = new Arme("Épée de Chevalier","","Arme/loup/epee.png", "", 15, cri, ombre, false);
    public Arme grandEspadon = new Arme("Guts", "", "Arme/loup/guts.png", "", 30, griffe, doubleLame,false);

    // Liste de sort et d'armes initialement vide
    private ArrayList<Arme> armes = new ArrayList<Arme>();
    private ArrayList<Sort> sortsN = new ArrayList<Sort>();
    private ArrayList<Sort> sortsS = new ArrayList<Sort>();



// Création des classes de personnage

    public Classe loup = new Classe("Loup", "Armure/luiLoup.png", armes, sortsN,sortsS, 200,200,12, 16,6, 12, katana,5);
    public Classe ronin = new Classe("Ronin","Armure/luiRonin.png", armes, sortsN,sortsS,  150, 150,13, 12, 8, 13, katana,5);
    public Classe mage = new Classe("Mage", "Armure/luiMage.png", armes, sortsN,sortsS, 100,100, 7, 8, 10, 15,baguette,5);


// Création des Boss

    public Boss godrick = new Boss("Godrick le Greffé", "Boss/goofy_godrick.png", 10, 100,100, 3, "Background/Arene/arene_godrick.jpg");
    public Boss rennala = new Boss("Rennala", "Boss/goofy_renalla.png", 15, 150,150,2, "Background/Arene/arene_rennala.jpg");
    public Boss radahn = new Boss("Général Radahn", "Boss/goofy_radahn.png", 20,200,200,3, "Background/Arene/arene_radahn.jpg");
    public Boss morgot = new Boss("Morgot le Roi Déchu","Boss/goofy_morgot.png",25,250,250,2,"Background/Arene/arene_morgot.jpg");
    public Boss maliketh = new Boss("La lame d'ébène", "Boss/maliketh.png", 35, 300,300, 2, "Background/Arene/arene_maliketh.png");
    public Boss malenia = new Boss("Malenia", "Boss/goofy_malenia.png", 35,300,300,1,"Background/Arene/arene_malenia.jpg");
    public Boss godfrey = new Boss("Godfrey", "Boss/goofy_godfrey.png", 50,400,400,1,"Backgroud/Arene/arene_morgot.jpg");


// Création des cartes
        // Personnage
    public Carte astrologue = new Carte("Personnage", "Astrologue","Carte/Joueur/astrolog.png", "Carte/Fond/manuscrit.png","Animation/projecteur.gif",80, false);
    public Carte bandit = new Carte("Personnage", "Bandit", "Carte/Joueur/bandit.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte confessor = new Carte("Personnage", "Confessor", "Carte/Joueur/confessor.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte hero = new Carte("Personnage", "Hero", "Carte/Joueur/hero.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte prisonnier = new Carte("Personnage", "Prisonnier", "Carte/Joueur/prisonner.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte prophet = new Carte("Personnage", "Prophete", "Carte/Joueur/prophet.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte samurai = new Carte("Personnage", "Samurai", "Carte/Joueur/samurai.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte vagabond = new Carte("Personnage", "Vagabond", "Carte/Joueur/vagabond.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte warrior = new Carte("Personnage", "Warrior", "Carte/Joueur/warrior.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte wretch = new Carte("Personnage", "Wretch", "Carte/Joueur/wretch.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);

        // Bestiaire
    public Carte albinauric = new Carte("Bestiaire", "Albinauric", "Carte/Bestiaire/albinoric.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte ancetre = new Carte("Bestiaire", "Ancetre", "Carte/Bestiaire/ancetre.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte cauchemard = new Carte("Bestiaire", "CauchemarDs3", "Carte/Bestiaire/cauchemarDS3.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte crabe = new Carte("Bestiaire", "Crabe", "Carte/Bestiaire/crab.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte crystalBleu = new Carte("Bestiaire", "Bleu", "Carte/Bestiaire/CrystalBleu.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte lion = new Carte("Bestiaire", "Lion", "Carte/Bestiaire/lion.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte chat = new Carte("Bestiaire", "Chat", "Carte/Bestiaire/chat.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte mobHache = new Carte("Bestiaire", "Mob Hache", "Carte/Bestiaire/mobHache.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);
    public Carte mobFeu = new Carte("Bestiaire", "Mob Feu", "Carte/Bestiaire/mobFeu.png", "Carte/Fond/manuscrit.png", "Animation/projecteur.gif", 80, false);

        // Sort
    //...
    public ArrayList mesCartes = new ArrayList<>();
    @FXML
    private Label lblPuissanceSort1;
    @FXML
    private Label lblPuissanceSort2;
    @FXML
    private AnchorPane ap;
    @FXML
    private ImageView empSortSpecial1;
    @FXML
    private ImageView empSortSpecial2;
    @FXML
    private ImageView empSortNormal6;
    @FXML
    private ImageView empSortNormal5;
    @FXML
    private ImageView empSortSpecial3;
    @FXML
    private ImageView empSortSpecial4;
    @FXML
    private ImageView empSortSpecial5;
    @FXML
    private ImageView empSortSpecial6;
    @FXML
    private ImageView empSortNormal4;
    @FXML
    private ImageView empSortNormal3;
    @FXML
    private ImageView empSortNormal2;
    @FXML
    private ImageView empSortNormal1;
    @FXML
    private ImageView iconEffetS2;
    @FXML
    private Label lblMirielNomS2;
    @FXML
    private ImageView iconEffetS1;
    @FXML
    private Label lblMirielNomS1;
    @FXML
    private ImageView selectionSort1;
    @FXML
    private ImageView selectionSort2;

    // Fonction du debut rend tout invisible met a jour l'ap visible et rempli la liste des cartes disponible pour le tirage
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();

        siteFinal.setVisible(false);
        siteMaliketh.setVisible(false);
        siteMalenia.setVisible(false);
        siteMorgot.setVisible(false);
        siteRadahn.setVisible(false);
        siteRenalla.setVisible(false);

        imgArmeRonin.setVisible(false);
        imgArmeLoup.setVisible(false);
        imgArmeMage.setVisible(false);
        imgArmeMageInventaire.setVisible(false);
        imgArmeLoupInventaire.setVisible(false);
        imgArmeRoninInventaire.setVisible(false);

        changeAp(apClasse);

        // Changer la couleur de la barre de vie
        String progressBarStyle = "-fx-background-color: white; " + // Couleur de fond
                "-fx-accent: red;";          // Couleur de la barre de progression
        // Appliquer le style à la barre de progression
        pvBoss.setStyle(progressBarStyle);
        pvMoi.setStyle(progressBarStyle);

        ArrayList<Carte> toutesCartes = new ArrayList<Carte>();
        toutesCartes.add(astrologue);
        toutesCartes.add(bandit);
        toutesCartes.add(confessor);
        toutesCartes.add(hero);
        toutesCartes.add(prisonnier);
        toutesCartes.add(prophet);
        toutesCartes.add(samurai);
        toutesCartes.add(vagabond);
        toutesCartes.add(warrior);
        toutesCartes.add(wretch);
        toutesCartes.add(albinauric);
        toutesCartes.add(ancetre);
        toutesCartes.add(cauchemard);
        toutesCartes.add(chat);
        toutesCartes.add(crabe);
        toutesCartes.add(crystalBleu);
        toutesCartes.add(lion);
        toutesCartes.add(mobFeu);
        toutesCartes.add(mobHache);
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
        sortsN.add(epee.getS1());
        sortsN.add(katana.getS1());
        sortsS.add(epee.getS2());
        sortsS.add(katana.getS2());

        // Mettre a jour les cartes armes et sort pour chaque perso en fonction de sa main

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

        // Same

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

        // Same

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
        majMiriel();
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
        bossActuel = boss;
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
        moi.fullPV();
        bossActuel.fullPv();
        pvMoi.setProgress(1);
        pvBoss.setProgress(1);

    }
    public void majPV(Boss b, Classe c){
        double nvPvBoos = b.getPv()/b.getPvMax();
        pvBoss.setProgress(nvPvBoos);
        double nvPvMoi = c.getPv()/c.getPvMax();
        pvMoi.setProgress(nvPvMoi);
        if(bossActuel.testMort()){
            paneGG.setVisible(true);
            imgGG.setVisible((true));
            String boss = bossActuel.getNom();
            // affiche les site de grace suivant si l'on gagne en fonction des boss tués et attribut des nouvelle stats ainsi qu'une nouvelle arme
            switch(boss){
                case "Godrick le Greffé" :
                    // affiche les site de grace suivant
                    siteRenalla.setVisible(true);
                    siteRadahn.setVisible(true);
                    // ajoute une nouvelle arme dans l'inventaire
                    grandEspadon.setDispo(true);
                    armes.add(grandEspadon);
                    // augmentation des stats
                    moi.setPv(moi.getPv()+10);
                    moi.setForce(moi.getForce()+10);
                    siteGodrick.setDisable(true);
                    break;

                case "Rennala":
                    // pour faire apparaitre le boss suivant il faut battre les 2 boss on met donc en place un compteur.
                    niveauSuffisant+=1;
                    if (niveauSuffisant == 2){
                        siteMorgot.setVisible(true);
                    }
                    siteRenalla.setDisable(true);
                    break;
                case "Général Radahn":
                    niveauSuffisant+=1;
                    if(niveauSuffisant==2){
                        siteMorgot.setVisible(true);
                    }
                    siteRadahn.setDisable(true);
                    break;
                case "Morgot le Roi Déchu":
                    siteMalenia.setVisible(true);
                    siteMaliketh.setVisible(true);
                    siteMorgot.setDisable(true);
                    break;
                case "Malenia":
                    niveauSuffisant+=1;
                    if (niveauSuffisant == 4){
                        siteFinal.setVisible(true);
                    }
                    siteMalenia.setDisable(true);
                    break;
                case "La lame d'ébène":
                    niveauSuffisant+=1;
                    if (niveauSuffisant == 4){
                        siteFinal.setVisible(true);
                    }
                    siteMaliketh.setDisable(true);
                    break;
            }
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
        bossActuel.randomAttaque(moi);
        majPV(bossActuel, moi);
    }

    @FXML
    public void lanceAttaque(Event event) {
        moi.attaque(moi.getMain(), bossActuel);
        bossActuel.randomAttaque(moi);
        majPV(bossActuel,moi);
    }

    @FXML
    public void lanceSort1(Event event) {
        moi.attaqueSort(moi.getMain(), moi.getMain().getS1(), bossActuel);
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
    public int niveauSuffisant=0;
    @FXML
    public void retourMap(Event event) {
        // Fonction permettant de revenir sur la map apres un double clique sur l'image gagné/ perdu
        nbRetourMap+=1;
        if(nbRetourMap==2){
            changeAp(apMap);
            nbRetourMap = 0;
        }
    }


// AP Miriel Changement de sort pour une arme

    public Sort getSort1(String nom){
        for (int i=0; i<sortsN.size(); i++){
            if(sortsN.get(i).getNom()==nom){
                return sortsN.get(i);
            }
        }
        System.out.println("Sort non trouvé");
        return null;
    }
    public Sort getSort2(String nom){
        for (int i=0; i<sortsS.size(); i++){
            if(sortsS.get(i).getNom()==nom){
                return sortsS.get(i);
            }
        }
        System.out.println("Sort non trouvé");
        return null;
    }

    // Fonction pour afficher les sorts dont on dispose
    public void majMiriel(){
        changeImageViewImg(imgArme, moi.getMain().getIcon());
        changeImageViewImg(sortArme1, moi.getMain().getS1().getImg());
        changeImageViewImg(sortArme2, moi.getMain().getS2().getImg());
        lblMirielNomS1.setText(moi.getMain().getS1().getNom());
        lblMirielNomS2.setText(moi.getMain().getS2().getNom());
        writeRapideInt(lblPuissanceSort1, moi.getMain().getS1().getPuissance());
        writeRapideInt(lblPuissanceSort2, moi.getMain().getS2().getPuissance());

        // Afficher les sort Normaux dispo
        int index = 1;
        for(Sort sort : moi.getSortsN()) {
            if(index<=6){
                switch(index){
                    case 1 :
                        changeImageViewImg(empSortNormal1, sort.getImg());
                        contenuSortNorm1 = sort.getNom();
                        break;
                    case 2 :
                        changeImageViewImg(empSortNormal2, sort.getImg());
                        contenuSortNorm2 = sort.getNom();
                        break;
                    case 3 :
                        changeImageViewImg(empSortNormal3, sort.getImg());
                        contenuSortNorm3 = sort.getNom();
                        break;
                    case 4 :
                        changeImageViewImg(empSortNormal4, sort.getImg());
                        contenuSortNorm4 = sort.getNom();
                        break;
                    case 5 :
                        changeImageViewImg(empSortNormal5, sort.getImg());
                        contenuSortNorm5 = sort.getNom();
                        break;
                    case 6 :
                        changeImageViewImg(empSortNormal6, sort.getImg());
                        contenuSortNorm6 = sort.getNom();
                        break;
                }
                index++;
            }
        }

        // Afficher les sort Speciaux dispo
        int indexspe = 1;
        for(Sort sort : moi.getSortsS()) {
            if(indexspe<=6){
                switch(indexspe){
                    case 1 :
                        changeImageViewImg(empSortSpecial1, sort.getImg());
                        contenuSortSpec1 = sort.getNom();
                        break;
                    case 2 :
                        changeImageViewImg(empSortSpecial2, sort.getImg());
                        contenuSortSpec2 = sort.getNom();
                        break;
                    case 3 :
                        changeImageViewImg(empSortSpecial3, sort.getImg());
                        contenuSortSpec3 = sort.getNom();
                        break;
                    case 4 :
                        changeImageViewImg(empSortSpecial4, sort.getImg());
                        contenuSortSpec4 = sort.getNom();
                        break;
                    case 5 :
                        changeImageViewImg(empSortSpecial5, sort.getImg());
                        contenuSortSpec5 = sort.getNom();
                        break;
                    case 6 :
                        changeImageViewImg(empSortSpecial6, sort.getImg());
                        contenuSortSpec6 = sort.getNom();
                        break;
                }
                indexspe++;
            }
        }
    }

    public Sort selectionS1;
    public Sort selectionS2;

    public void changerSelectionSort1(String contenu){
        Sort sort = getSort1(contenu);
        changeImageViewImg(selectionSort1, sort.getImg());
        selectionS1 = sort;
    }
    public void changerSelectionSort2(String contenu){
        Sort sort = getSort2(contenu);
        changeImageViewImg(selectionSort2, sort.getImg());
        selectionS2 = sort;
    }
    @FXML
    public void changerSort2(Event event) {
        moi.getMain().setS2(selectionS2);
        majMiriel();
    }

    @FXML
    public void changerSort1(Event event) {
        moi.getMain().setS1(selectionS1);
        majMiriel();
    }

    @FXML
    public void selectionSort2emp3(Event event) {
        changerSelectionSort2(contenuSortSpec3);
    }

    @FXML
    public void selectionSort2emp2(Event event) {
        changerSelectionSort2(contenuSortSpec2);
    }

    @FXML
    public void selectionSort2emp1(Event event) {
        changerSelectionSort2(contenuSortSpec1);
    }

    @FXML
    public void selectionSort2emp6(Event event) {
        changerSelectionSort2(contenuSortSpec6);
    }

    @FXML
    public void selectionSort2emp5(Event event) {
        changerSelectionSort2(contenuSortSpec5);
    }

    @FXML
    public void selectionSort2emp4(Event event) {
        changerSelectionSort2(contenuSortSpec4);
    }

    @FXML
    public void selectionSort1emp6(Event event) {
        changerSelectionSort1(contenuSortNorm6);
    }

    @FXML
    public void selectionSort1emp5(Event event) {
        changerSelectionSort1(contenuSortNorm5);
    }

    @FXML
    public void selectionSort1emp2(Event event) {
        changerSelectionSort1(contenuSortNorm2);
    }

    @FXML
    public void selectionSort1emp1(Event event) {
        changerSelectionSort1(contenuSortNorm1);
    }

    @FXML
    public void selectionSort1emp4(Event event) {
        changerSelectionSort1(contenuSortNorm4);
    }

    @FXML
    public void selectionSort1emp3(Event event) {
        changerSelectionSort1(contenuSortNorm3);
    }
}
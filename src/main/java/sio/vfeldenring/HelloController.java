package sio.vfeldenring;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

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
    private ListView listeArmes;
    @FXML
    private ImageView icons2;
    @FXML
    private Label descArmes;
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
    public Classe moi;

    private Sort pirouette = new Sort("Pirouette", "", "vitesse", 10);
    private Sort griffe = new Sort("Griffe", "", "force", 10);
    private Sort cailloux = new Sort("Pluie de grelons", "", "magique",15);
    private Sort gravitation = new Sort("Gravitation", "", "force", 15);
    private Sort cri = new Sort("Cri de Troll", "", "force", 15);
    private Sort ombre = new Sort("Ombre", "", "vitesse", 20);
    private Sort lameFeu = new Sort("LameFeu", "", "feu", 20);
    private Sort riverBlood = new Sort("BloodRiver", "", "sang", 20);
    private Sort doubleLame = new Sort("Lame Double", "", "force",20);
    private Sort soleil = new Sort("Soleil", "", "feu", 30);
    private Sort lune = new Sort("Lune Noire", "", "glace",30);

    public Arme katana = new Arme("Katana", "", "", "", 15, griffe, pirouette);
    public Arme epee = new Arme("Épée de Chevalier","","", "", 15, cri, ombre);
    public Arme baguette = new Arme("Baguette", "", "", "", 10, cailloux,gravitation);
    public Arme bloodRiver = new Arme("Blood River", "", "", "", 25, lameFeu, riverBlood);
    public Arme grandEspadon = new Arme("Guts", "", "", "", 30, griffe, doubleLame);
    public Arme sceptre = new Arme("Sceptre Royal", "", "", "", 20, soleil, lune);

    private ArrayList armes = new ArrayList<Arme>();

    public Classe chevalier = new Classe("Chevalier", "Armure/Berserker/armor_loup.png", "Armure/Berserker/loup_dos.png", armes,14,12, 16,6, 12);
    public Classe ronin = new Classe("Ronin","Armure/Samourai/armor_samurai.png", "Armure/Samourai/samurai_dos.png", armes, 12, 13, 12, 8, 13);
    public Classe astrologue = new Classe("Astrologue", "Armure/Mage/armor_astrologue.png", "Armure/Mage/astrologue_dos.png", armes, 9, 7, 8, 10, 15);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        changeAp(apClasse);
    }


    @FXML
    public void changeLoup(Event event) {
        changeAp(apInventaire);
        armes.add(epee);
        maj(chevalier);
    }
    @FXML
    public void changeSamurai(Event event) {
        changeAp(apInventaire);
        armes.add(katana);
        maj(ronin);
    }

    @FXML
    public void changeAstrologue(Event event) {
        changeAp(apInventaire);
        armes.add(baguette);
        maj(astrologue);
    }

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
    }

    @FXML
    public void changeApEnia(Event event) {
        changeAp(apEnia);
    }

    @FXML
    public void lanceMorgot(Event event) {
    }

    @FXML
    public void lanceFinal(Event event) {
    }

    @FXML
    public void lanceMalenia(Event event) {
    }

    @FXML
    public void lanceMaliketh(Event event) {
    }

    @FXML
    public void lanceRenalla(Event event) {
    }

    @FXML
    public void lanceGodrick(Event event) {
    }

    @FXML
    public void lanceRadahn(Event event) {
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
    public void visible (AnchorPane ap){ap.setVisible(true);}
    public void invisible(AnchorPane ap){ap.setVisible(false);}
    public void clearAll(){
        invisible(apClasse);
        invisible(apInventaire);
        invisible(apMap);
        invisible(apBastion);
        invisible(apEnia);
        invisible(apMiriel);
    }
    public void changeAp(AnchorPane ap){
        clearAll();
        visible(ap);
    }

    public void maj(Classe c){
        lblNom.setText(c.getNom());
        lblPv.setText(Integer.toString(c.getPv()));
        lblChance.setText(Integer.toString(c.getChance()));
        lblForce.setText(Integer.toString(c.getForce()));
        lblVitesse.setText(Integer.toString(c.getVitesse()));
        lblDefense.setText(Integer.toString(c.getDefense()));
        changeImageViewImg(persoView, c.getImgFace());
        moi = c;
        System.out.println(c.getArmes().getFirst().getNom());

        for(int i = 0; i<armes.size();i++){

            listeArmes.getItems().add(armes.get(i));
        }
    }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Agent {

    private String pseudo, nom, prenom, metier, passwd;
    private int id;

    private ArrayList<String> listeMateriel;
    final String path = "/home/jeanjean/Documents/Epsi_3_emes/mspr/resources";

    public ArrayList<String> getListeMateriel() {
        return listeMateriel;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMetier() {
        return metier;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getId() {
        return id;
    }


    public Agent(int id) {
        this.id = id;
        this.listeMateriel = new ArrayList<String>();
    }

    public Agent(String pseudo, String nom, String prenom, String metier, String passwd, int id) {
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.passwd = passwd;
        this.id = id;
    }

    public Agent(String pseudo, String nom, String prenom, String metier, String passwd, int id, ArrayList listeMateriel) {
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.passwd = passwd;
        this.id = id;
        this.listeMateriel = listeMateriel;
    }

    public Agent(String fileName, int id){
        File file = new File(path, fileName + ".txt");
        try(
                var reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            Agent agent = new Agent(id);
            int countLine= 0;
            this.listeMateriel = new ArrayList<String>();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                countLine++;
                if (countLine >= 5){ this.listeMateriel.add(line); break; };
                if (countLine == 1) this.setNom(line);
                if (countLine == 2) this.setPrenom(line);
                if (countLine == 3) this.setMetier(line);
                if (countLine == 4) this.setPasswd(line);

            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    @Override
    public String toString() {
        return "Agent{" +
                "pseudo='" + pseudo + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", metier='" + metier + '\'' +
                ", passwd='" + passwd + '\'' +
                ", id=" + id +
                ", listeMateriel=" + listeMateriel +
                ", path='" + path + '\'' +
                '}';
    }
}

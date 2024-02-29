package entities;
import java.util.Date;

public class Article {
    private int id;
    private String titre;
    private String contenu;
    private Date dateCreation;
    private int etat;
    

    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getContenu() {
        return contenu;
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}




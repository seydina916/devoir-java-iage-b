package entities;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int id;
    private String nomCat;
    List<Article> Article=new ArrayList<>();
      
    public List<Article> getArticles() {
        return Article;
    }
    public void setArticle(List<Article> Article) {
        this.Article = Article;
    }
    public Categorie() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomCat() {
        return nomCat;
    }
    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
}


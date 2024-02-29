package repositories;

import entities.Article;
import entities.Categorie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository extends Database {
    private final String SQL_INSERT = "INSERT INTO article (titre, contenu, dateCreation, etat, categorie_id) VALUES (?, ?, ?, ?, ?)";
    private final String SQL_SELECT_ALL = "SELECT a.id, a.titre, a.contenu, a.dateCreation, a.etat, c.id AS categorie_id, c.nomCat AS categorie_nom FROM article a JOIN categorie c ON a.categorie_id = c.id";

    public void ajouterArticle(Article article) {
        openConnexion();
        try {
            initPreparedStatement(SQL_INSERT);
            statement.setString(1, article.getTitre());
            statement.setString(2, article.getContenu());
            statement.setDate(3, new java.sql.Date(article.getDateCreation().getTime()));
            statement.setInt(4, article.getEtat());
            executeUpdate();
            closeConnexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Article> listerArticles() {
        List<Article> articles = new ArrayList<>();
        try {
            openConnexion();
            initPreparedStatement(SQL_SELECT_ALL);
            ResultSet rs = executeSelect();
            while (rs.next()) {
                @SuppressWarnings("unused")
                Categorie categorie= new Categorie();
                Article article=new Article();
                     article.setId(rs.getInt("id_article"));
                     article.setTitre(rs.getString("titre"));
                     article.setContenu(rs.getString("contenu"));
                     article.setDateCreation(rs.getDate("datecreation"));
                     article.setEtat(rs.getInt("etat")
                );
                articles.add(article);
            }
            rs.close();
            closeConnexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }
}

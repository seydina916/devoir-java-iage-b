package repositories;

import entities.Categorie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategorieRepository extends Database {
    private final String SQL_INSERT = "INSERT INTO categorie (nomCat) VALUES (?)";
    private final String SQL_SELECT_ALL = "SELECT * FROM categorie";

    public void creerCategorie(Categorie categorie) {
        openConnexion();
        try {
            initPreparedStatement(SQL_INSERT);
            statement.setString(1, categorie.getNomCat());
            executeUpdate();
            closeConnexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Categorie> listerCategories() {
        List<Categorie> categories = new ArrayList<>();
        try {
            openConnexion();
            initPreparedStatement(SQL_SELECT_ALL);
            ResultSet rs = executeSelect();
            while (rs.next()) {
               Categorie categorie=new Categorie();
               categorie.setId(rs.getInt("id_categorie"));
               categorie.setNomCat(rs.getString("nomCat"));
                categories.add(categorie);
            }
            rs.close();
            closeConnexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
}

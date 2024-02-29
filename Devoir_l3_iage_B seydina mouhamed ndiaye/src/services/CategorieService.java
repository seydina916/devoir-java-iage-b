package services;

import entities.Categorie;
import repositories.CategorieRepository;

import java.util.List;

public class CategorieService {
    private CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public void creerCategorie(Categorie categorie) {
        categorieRepository.creerCategorie(categorie);
    }

    public List<Categorie> listerCategories() {
        return categorieRepository.listerCategories();
    }
}




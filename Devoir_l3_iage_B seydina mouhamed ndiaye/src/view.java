
import entities.Article;
import entities.Categorie;
import services.ArticleService;
import services.CategorieService;

import java.util.List;
import java.util.Scanner;

public class view {
    private ArticleService articleService;
    private CategorieService categorieService;
    private Scanner scanner;

    public view(ArticleService articleService, CategorieService categorieService) {
        this.articleService = articleService;
        this.categorieService = categorieService;
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenuPrincipal() {
        int choix;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Gérer les Articles");
            System.out.println("2. Gérer les Catégories");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour vider le buffer après avoir lu l'entier

            switch (choix) {
                case 1:
                    afficherMenuGestionArticles();
                    break;
                case 2:
                    afficherMenuGestionCategories();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 3);
    }

    private void afficherMenuGestionArticles() {
        int choix;
        do {
            System.out.println("Menu Gestion des Articles:");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Lister les articles");
            System.out.println("3. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterArticle();
                    break;
                case 2:
                    listerArticles();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 3);
    }

    private void afficherMenuGestionCategories() {
        int choix;
        do {
            System.out.println("Menu Gestion des Catégories:");
            System.out.println("1. Créer une catégorie");
            System.out.println("2. Lister les catégories");
            System.out.println("3. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); 
            switch (choix) {
                case 1:
                    creerCategorie();
                    break;
                case 2:
                    listerCategories();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 3);
    }

    private void ajouterArticle() {
        
    }

    private void listerArticles() {
        List<Article> articles = articleService.listerArticles();
        System.out.println("Liste des articles :");
        for (@SuppressWarnings("unused") Article article : articles) {
            
        }
    }

    private void creerCategorie() {
        
    }

    private void listerCategories() {
        List<Categorie> categories = categorieService.listerCategories();
        System.out.println("Liste des catégories :");
        for (@SuppressWarnings("unused") Categorie categorie : categories) {
            
        }
    }
}

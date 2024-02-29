package services;

import entities.Article;
import repositories.ArticleRepository;

import java.util.List;

public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void ajouterArticle(Article article) {
        articleRepository.ajouterArticle(article);
    }

    public List<Article> listerArticles() {
        return articleRepository.listerArticles();
    }
}

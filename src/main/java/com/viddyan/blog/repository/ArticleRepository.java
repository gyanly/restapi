package com.viddyan.blog.repository;

import com.viddyan.blog.model.Article;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;
@Repository
@Component
public class ArticleRepository {
    private List<Article> articles = new ArrayList<>();
    public List<Article> findAll() {
        return articles;
    }
    public Article findById(@PathVariable Integer id) {
        return articles.stream().filter(a -> a.id().equals(id)).findFirst().orElse(null);
    }
    @PostConstruct
    public void dataPoint(){
        Article c = new Article(1,"one","Hi welcome","23-2-20");
        articles.add(c);
    }

    public void save(Article article){
        articles.add(article);
    }

}

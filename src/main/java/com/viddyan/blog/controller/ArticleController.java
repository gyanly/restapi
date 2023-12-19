//package com.viddyan.blog.controller;
//
//import com.viddyan.blog.model.Article;
//import com.viddyan.blog.repository.ArticleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/posts")
//public class ArticleController {
//    private final ArticleRepository articles;
//    @Autowired
//    public ArticleController(ArticleRepository articleRepository) {
//        this.articles = articleRepository;
//    }
//    @GetMapping("")
//    public List<Article> findAll(){
//        return articles.findAll();
//    }
////    @GetMapping("/{id}")
////    public Article findById(@PathVariable Integer id){
////        return articles.findById(id);
////    }
//    @GetMapping("/{author}")
//    public Article findByAuthor(@PathVariable String author){
//        return articles.findByAuthor(author);
//    }
////    @PostMapping("")
////    public void create(@RequestBody Article content){
////        articles.save(content);
////    }
//}

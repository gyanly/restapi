package com.viddyan.blog.services;

import com.viddyan.blog.entitiy.Blog;

import java.util.List;
public interface BlogService {
    List<Blog> findAll();
    Blog findById(int theId);

    List<Blog> findByAuthor(String author);

    Blog createBlog(Blog theBlog);
    Blog updateBlog(Blog theBlog);

    void deletBlogById(int theId);
}


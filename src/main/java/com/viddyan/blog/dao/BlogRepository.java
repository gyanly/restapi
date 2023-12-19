package com.viddyan.blog.dao;

import com.viddyan.blog.entitiy.Blog;
import org.aspectj.weaver.Lint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    List<Blog> findByAuthor(String author);
}

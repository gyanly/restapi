package com.viddyan.blog.services;

import com.viddyan.blog.dao.BlogRepository;
import com.viddyan.blog.entitiy.Blog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BlogServiceImplTest {

    @Mock
    private BlogRepository blogRepository;
    private BlogService blogService;
    AutoCloseable autoCloseable;
    Blog theBlog;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        blogService = new BlogServiceImpl(blogRepository);
        theBlog = new Blog("this is new post","Gyan","4-2-23");
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByAuthorTest() {
        mock(Blog.class);
        mock(BlogRepository.class);

        when(blogRepository.findByAuthor("Gyan")).thenReturn(new ArrayList<Blog>(Collections.singleton(theBlog)));

        assertThat(blogService.findByAuthor("Gyan").get(0).getId()).isEqualTo(theBlog.getId());

    }

    @Test
    void createBlogTest() {
        mock(Blog.class);
        mock(BlogRepository.class);

        when(blogRepository.save(theBlog)).thenReturn(theBlog);

        assertThat(blogService.createBlog(theBlog)).isEqualTo(theBlog);
    }

    @Test
    void updateBlogTest() {
        mock(Blog.class);
        mock(BlogRepository.class);

        when(blogRepository.save(theBlog)).thenReturn(theBlog);

        assertThat(blogService.createBlog(theBlog)).isEqualTo(theBlog);
    }

    @Test
    void deletBlogById() {
    }
}
package com.viddyan.blog.dao;

import com.viddyan.blog.entitiy.Blog;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BlogRepositoryTest {
    @Autowired
    public BlogRepository blogRepository;
    Blog theblog;

    @BeforeEach
    void setUp(){
        theblog = new Blog("Hi for testing","Gyan","2-4-23");
        blogRepository.save(theblog);
    }

    @AfterEach
    void tearDown(){
        theblog = null;
        blogRepository.deleteAll();
    }

    @Test
    void FindByAuthorTest(){
        List <Blog> theBLogList = blogRepository.findByAuthor("abc");
        assertThat(theBLogList.isEmpty()).isFalse();
    }

//    @Test
//    void testFindByAuthor() {
//        List <Blog> theBLogList = blogRepository.findByAuthor("Mary");
//        assertThat(theBLogList.get(0).getId()).isEqualTo(theblog.getId());
//        assertThat(theBLogList.get(0).getContent()).isEqualTo(theblog.getContent());
//    }
}

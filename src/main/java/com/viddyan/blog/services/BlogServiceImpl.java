package com.viddyan.blog.services;

import com.viddyan.blog.dao.BlogRepository;
import com.viddyan.blog.entitiy.Blog;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;
    public BlogServiceImpl(BlogRepository theBlogRepository){
        blogRepository = theBlogRepository;
    }
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
    @Override
    public Blog findById(int theId) {
        Optional<Blog> result = blogRepository.findById(theId);
        Blog theBlog = null;
        if(result.isPresent()){
            theBlog = result.get();
        }
        return theBlog;
    }
    @Override
    public List<Blog> findByAuthor(String author) {
        List<Blog> result = blogRepository.findByAuthor(author);
        return result;
    }
    @Override
    public Blog createBlog(Blog theBlog) {
        return blogRepository.save(theBlog);
    }

    @Override
    public Blog updateBlog(Blog theBlog) {
        return blogRepository.save(theBlog);
    }
    @Override
    public void deletBlogById(int theId) {
        blogRepository.deleteById(theId);
    }
}

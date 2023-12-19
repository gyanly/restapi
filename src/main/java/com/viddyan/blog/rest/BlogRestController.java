package com.viddyan.blog.rest;

import com.viddyan.blog.entitiy.Blog;
import com.viddyan.blog.services.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BlogRestController {
//    private BlogDAO blogDAO;
    private BlogService blogService;
    public BlogRestController(BlogService theBlogService){
        blogService = theBlogService;
    }
//
//    @GetMapping("/blogs")
//    public List<Blog> findAll(){
//        return blogService.findAll();
//    }

//    @GetMapping("/blogs/{blogId}")
//    public Blog getBlog(@PathVariable int blogId){
//        Blog theBlog = blogService.findById(blogId);
//        if(theBlog == null){
//           throw new RuntimeException("Blog id not Found--"+ blogId);
//        }
//        return theBlog;
//    }

    @GetMapping("/blogs/{author}")
    public List<Blog> getBlogByAuthor(@PathVariable String author){
        List<Blog> theBlog = blogService.findByAuthor(author);
        if(theBlog == null){
            throw new RuntimeException("Blog id not Found--"+ author);
        }
        return theBlog;
    }

//
//    @PostMapping("/blogs")
//    public Blog addBlog(@RequestBody Blog theBlog){
//        theBlog.setId(0);
//        Blog dbBlog = blogService.save(theBlog);
//        return dbBlog;
//    }

//    @PutMapping("/blogs")
//    public Blog updateBlog(@RequestBody Blog theBlog){
//        Blog dbBlog = blogService.save(theBlog);
//        return dbBlog;
//    }

//    @DeleteMapping("blogs/{blogId}")
//    public String deleteBlog(@PathVariable int blogId){
//        Blog tempBlog = blogService.findById(blogId);
//        if(tempBlog == null){
//            throw new RuntimeException("Blog Id did not Found"+blogId);
//        }
//        blogService.deeletById(blogId);
//        return "Deleted blog ID" + blogId;
//    }

}

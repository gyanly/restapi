//package com.viddyan.blog.dao;
//
//import com.viddyan.blog.entitiy.Blog;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class BlogDAOImpl implements BlogDAO{
//
//    private EntityManager entityManager;
//
//    public BlogDAOImpl(EntityManager theEntityManager){
//        entityManager = theEntityManager;
//    }
//
//
//    @Override
//    public List<Blog> findAll() {
//        TypedQuery<Blog> theQuery = entityManager.createQuery("from Blog", Blog.class);
//
//        List<Blog> blogs = theQuery.getResultList();
//
//        return blogs;
//
//    }
//
//    @Override
//    public Blog findById(int theId) {
//        Blog theBlog = entityManager.find(Blog.class,theId);
//        return theBlog;
//    }
//
//    @Override
//    public Blog save(Blog theBlog) {
//        Blog dbBlog = entityManager.merge(theBlog);
//        return dbBlog;
//    }
//
//    @Override
//    public void deeletById(int theId) {
//        Blog theBlog = entityManager.find(Blog.class, theId);
//        entityManager.remove(theBlog);
//    }
//}

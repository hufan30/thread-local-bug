package com.github.hcsp.service;

import com.github.hcsp.dao.BlogDao;
import com.github.hcsp.entity.Blog;
import com.github.hcsp.entity.BlogListResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;


class BlogServiceTest {
    BlogDao mockDao = Mockito.mock(BlogDao.class);
    BlogService blogService = new BlogService(mockDao);

    @BeforeEach
    void setUp(){
        System.out.println(123);
    }

    @Test
     void testGetBlogs(){
        List<Blog> blogs = Arrays.asList(Mockito.mock(Blog.class), Mockito.mock(Blog.class), Mockito.mock(Blog.class));
        Mockito.when(mockDao.getBlogs(2,3,1)).thenReturn(blogs);
        Mockito.when(mockDao.count(1)).thenReturn(10);

        BlogListResult blogListResult = blogService.getBlogs(2, 3, 1);
        Assertions.assertEquals(10,blogListResult.getTotal());
    }

    @Test
    void test(){

    }

}
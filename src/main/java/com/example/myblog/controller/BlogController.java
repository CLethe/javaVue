package com.example.myblog.controller;


import com.example.myblog.common.lang.Result;
import com.example.myblog.entity.Blog;
import com.example.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lethe
 * @since 2020-11-13
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @RequestMapping({"/",""})
    public Result findAll(){
        List<Blog> list = blogService.list();
        return Result.success(list);
    }
    @RequestMapping("{id}")
    public Blog getById(@PathVariable("id") int id){
        return blogService.getById(id);
    }
}

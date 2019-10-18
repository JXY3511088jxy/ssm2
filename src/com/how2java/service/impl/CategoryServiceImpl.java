package com.how2java.service.impl;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {//实现接口CategoryService

    @Autowired
    CategoryMapper categoryMapper;//接口可以被实例化吗？

    public List<Category> list(){
        return categoryMapper.list();//可以直接实例化接口，并调用接口的方法吗？
    }

}

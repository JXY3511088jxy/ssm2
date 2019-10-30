package com.how2java.service.impl;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {//实现接口CategoryService

    @Autowired
    CategoryMapper categoryMapper;//接口可以被实例化吗？

    public List<Category> list(){
        return categoryMapper.list();//可以直接实例化接口，并调用接口的方法吗？
    }

//    @Override
//    public List<Category> list(Page page) {
//        // TODO Auto-generated method stub
//        return categoryMapper.list(page);
//    }
//
//    @Override
//    public int total() {
//        return categoryMapper.total();
//    }
    public void deleteAll(){
        List<Category> cs = list();
        for (Category c:cs){
            categoryMapper.delete(c.getId());
        }

    }

    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public void addTwo(){
        Category c1 = new Category();
        c1.setName("短的名字");
        categoryMapper.add(c1);

        Category c2 = new Category();
        c2.setName("名字长对应字段放不下");
        categoryMapper.add(c2);
    }

}

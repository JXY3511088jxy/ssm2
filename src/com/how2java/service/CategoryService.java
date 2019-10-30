package com.how2java.service;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

public interface CategoryService {

    List<Category> list();
//    int total();
//    List<Category> list(Page page);
    void addTwo();
    void deleteAll();
}

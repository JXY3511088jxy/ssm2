package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

public interface CategoryMapper {
    //新增
    public int add(Category category);
    //删除
    public void delete(int id);
    //查询
    public Category get(int id);
    //修改
    public int update(Category category);

    public List<Category> list();

    public int count();

    public List<Category> list(Page page);

    public int total();
}

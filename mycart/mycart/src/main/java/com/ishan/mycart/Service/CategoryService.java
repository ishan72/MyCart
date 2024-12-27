package com.ishan.mycart.Service;

import com.ishan.mycart.Models.Category;
import com.ishan.mycart.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepo categoryRepo;

    @Autowired
    public CategoryService(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }

    public Category addCategoryItem(Category category){
        return categoryRepo.save(category);
    }
}

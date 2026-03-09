package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private List<Category> list = List.of(
            new Category(1, "Laptop"),
            new Category(2, "Phone"),
            new Category(3, "Accessory")
    );

    public List<Category> getAll() {
        return list;
    }

    public Category get(int id) {
        return list.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

package com.inventory_pilot.inventory_pilot_project.service;

import com.inventory_pilot.inventory_pilot_project.entities.Category;

import java.util.List;

/* Service interface for Category*/

public interface CategoryService {
    List<Category> fetchCategoryList();
}

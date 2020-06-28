package com.smartfoodhcmut.service;

import java.util.List;

import com.smartfoodhcmut.model.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> findAll();
}
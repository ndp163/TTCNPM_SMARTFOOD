package com.smartfoodhcmut.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.smartfoodhcmut.dao.ICategoryDAO;
import com.smartfoodhcmut.model.CategoryModel;
import com.smartfoodhcmut.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}

package com.smartfoodhcmut.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.smartfoodhcmut.dao.ICategoryDAO;
import com.smartfoodhcmut.dao.IFoodsDAO;
import com.smartfoodhcmut.model.CategoryModel;
import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.paging.Pageble;
import com.smartfoodhcmut.service.IFoodsService;

public class FoodsService implements IFoodsService {

	@Inject
	private IFoodsDAO foodsDao;
	
	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<FoodsModel> findByCategoryId(Long categoryId) {
		return foodsDao.findByCategoryId(categoryId);
	}

	@Override
	public FoodsModel save(FoodsModel foodsModel) {
		foodsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModel category = categoryDAO.findOneByCode(foodsModel.getCategoryCode());
		foodsModel.setCategoryId(category.getId());
		Long foodId = foodsDao.save(foodsModel);
		return foodsDao.findOne(foodId);
	}

	@Override
	public FoodsModel update(FoodsModel updateFoods) {
		FoodsModel oldFood = foodsDao.findOne(updateFoods.getId());
		updateFoods.setCreatedDate(oldFood.getCreatedDate());
		updateFoods.setCreatedBy(oldFood.getCreatedBy());
		updateFoods.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModel category = categoryDAO.findOneByCode(updateFoods.getCategoryCode());
		updateFoods.setCategoryId(category.getId());
		foodsDao.update(updateFoods);
		return foodsDao.findOne(updateFoods.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (long id : ids) {
			//1. delete comment(foreign key food_id)
			//2. delete foods
			foodsDao.delete(id);
		}
	}

	@Override
	public List<FoodsModel> findAll(Pageble pageble) {
		return foodsDao.findAll(pageble);
	}

	@Override
	public List<FoodsModel> findBySearch(String search) {
		return foodsDao.findBySearch(search);
	}
	
	
	@Override
	public int getTotalItem() {
		return foodsDao.getTotalItem();
	}

	@Override
	public FoodsModel findOne(long id) {
		FoodsModel foodsModel = foodsDao.findOne(id);
		CategoryModel categoryModel = categoryDAO.findOne(foodsModel.getCategoryId());
		foodsModel.setCategoryCode(categoryModel.getCode());
		return foodsModel;
	}
}

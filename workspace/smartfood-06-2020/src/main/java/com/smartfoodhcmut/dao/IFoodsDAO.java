package com.smartfoodhcmut.dao;

import java.util.List;

import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.paging.Pageble;

public interface IFoodsDAO extends GenericDAO<FoodsModel> {
	FoodsModel findOne(Long id);
	List<FoodsModel> findByCategoryId(Long categoryId);
	Long save(FoodsModel foodsModel);
	void update(FoodsModel updateFoods);
	void delete(long id);
	List<FoodsModel> findAll(Pageble pageble);
	List<FoodsModel> findBySearch(String search);
	int getTotalItem();
}

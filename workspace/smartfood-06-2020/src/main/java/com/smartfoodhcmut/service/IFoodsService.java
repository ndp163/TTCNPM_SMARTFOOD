package com.smartfoodhcmut.service;

import java.util.List;

import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.paging.Pageble;

public interface IFoodsService {
	List<FoodsModel> findByCategoryId(Long categoryId);
	FoodsModel save(FoodsModel foodsModel);
	FoodsModel update(FoodsModel updateFoods);
	void delete(long[] ids);
	List<FoodsModel> findAll(Pageble pageble);
	List<FoodsModel> findBySearch(String search);
	int getTotalItem();
	FoodsModel findOne(long id);
}

package com.smartfoodhcmut.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.smartfoodhcmut.model.FoodsModel;

public class FoodsMapper implements RowMapper<FoodsModel> {

	@Override
	public FoodsModel mapRow(ResultSet resultSet) {
		try {
			FoodsModel foods = new FoodsModel();
			foods.setId(resultSet.getLong("id"));
			foods.setTitle(resultSet.getString("title"));
			foods.setContent(resultSet.getString("content"));
			foods.setCategoryId(resultSet.getLong("categoryid"));
			foods.setThumbnail(resultSet.getString("thumbnail"));
			foods.setShortDescription(resultSet.getString("shortdescription"));
			foods.setCreatedDate(resultSet.getTimestamp("createddate"));
			foods.setCreatedBy(resultSet.getString("createdby"));
			foods.setPrice(resultSet.getInt("price"));
			if (resultSet.getTimestamp("modifieddate") != null) {
				foods.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if (resultSet.getString("modifiedby") != null) {
				foods.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return foods;
		} catch (SQLException e) {
			return null;
		}
	}
}

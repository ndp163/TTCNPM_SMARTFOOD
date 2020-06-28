package com.smartfoodhcmut.model;

public class CommentModel extends AbstractModel<CommentModel> {
	
	private String content;
	private Long userId;
	private Long foodId;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}

}

package com.shopping.cosmos.user.vo;

public class UserSearchVO_jo extends UserVO_jo {
	private String searchType;
	private String keyword;
	private String message;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserSearchVO [searchType=" + searchType + ", keyword=" + keyword + ", message=" + message + "]";
	}

	

}

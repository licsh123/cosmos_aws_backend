package com.shopping.cosmos.user.vo;



public class UserVO_jo {
	private String user_email;
	private String user_password;
	private String user_name;
	private String user_birthday;
	private String user_phone;
	private String user_gender;
	private String user_regdate;
	private String address;
	private String user_role;
    private String user_bank;
    private String user_account;
    private int post_code;
    private String detail_address;
    //페이지 몇개인지
  	private int pageNum;
  	//글 처음
  	private int startRow;
  	//글 마지막
  	private int endRow;
  	
  	
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getPost_code() {
		return post_code;
	}
	public void setPost_code(int post_code) {
		this.post_code = post_code;
	}
	public String getDetail_address() {
		return detail_address;
	}
	public void setDetail_address(String detail_address) {
		this.detail_address = detail_address;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getUser_bank() {
		return user_bank;
	}
	public void setUser_bank(String user_bank) {
		this.user_bank = user_bank;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUser_email() {
		
		return user_email;
	}
	public void setUser_email(String user_email) {
		System.out.println("setUser_email : "+user_email);
		this.user_email = user_email;
	}
	public String getUser_password() {
		System.out.println("getUser_email : "+user_email);
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(String user_regdate) {
		this.user_regdate = user_regdate;
	}
	
	@Override
	public String toString() {
		return "UserVO [user_email=" + user_email + ", user_password=" + user_password + ", user_name=" + user_name
				+ ", user_birthday=" + user_birthday + ", user_phone=" + user_phone + ", user_gender=" + user_gender
				+ ", user_regdate=" + user_regdate + ", address=" + address + ", user_role=" + user_role
				+ ", user_bank=" + user_bank + ", user_account=" + user_account + ", post_code=" + post_code
				+ ", detail_address=" + detail_address + ", pageNum=" + pageNum + ", startRow=" + startRow + ", endRow="
				+ endRow + "]";
	}
	
	
	
	
}

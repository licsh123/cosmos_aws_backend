package com.shopping.cosmos.manager.vo;


public class ManagerItemsVO_jo {
	
	private int user_cnt;
	private int product_cnt;
	private int order_cnt;
	private int cancel_order_cnt;
	
	
	public int getCancel_order_cnt() {
		return cancel_order_cnt;
	}
	public void setCancel_order_cnt(int cancel_order_cnt) {
		this.cancel_order_cnt = cancel_order_cnt;
	}
	public int getOrder_cnt() {
		return order_cnt;
	}
	public void setOrder_cnt(int order_cnt) {
		this.order_cnt = order_cnt;
	}
	public int getUser_cnt() {
		System.out.println(user_cnt);
		return user_cnt;
	}
	public void setUser_cnt(int user_cnt) {
		this.user_cnt = user_cnt;
	}
	public int getProduct_cnt() {
		System.out.println(product_cnt);
		return product_cnt;
	}
	public void setProduct_cnt(int product_cnt) {
		this.product_cnt = product_cnt;
	}
	
	@Override
	public String toString() {
		return "ManagerItemsVO [user_cnt=" + user_cnt + ", product_cnt=" + product_cnt + "]";
	}
	
	
	
	
}

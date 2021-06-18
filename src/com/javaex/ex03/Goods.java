package com.javaex.ex03;

public class Goods {
//field
	private String name;
	private int price;
	private int count;
	private static int allCount;
	
//constructor
	public Goods() {
	}
	
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		allCount += count;
	}

//mehtod- g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public static int getAllCount() {
		return allCount ;
	}
	
	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}
//method - generic	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public String GoodsInfo() {
		return name+"(가격:"+price+"원)이 " + count + " 개 입고 되었습니다.";
		
	}
	
	
}

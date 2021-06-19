package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
//field   
	private double width;
	private double height;

//constructor
	public Rectangle(double width, double height) {
		super(0); // 부모에 기본 생성자 없어서 오류 발생. 
		this.width = width;
		this.height = height;
	}

//method - g/s
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

//method-generic	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}

	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

}
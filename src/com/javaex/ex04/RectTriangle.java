package com.javaex.ex04;

public class RectTriangle extends Shape {
//field
	private double width;
    private double height;

 //constructor
    
    public RectTriangle( double width, double height ) {
    	super(0);
        this.width = width;
        this.height = height;
    }
    
//method-g/s
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
  	
    public double getArea() {
        return width*height*0.5;
    }

    public double getPerimeter() {
        double result = width + height + Math.sqrt( width*width + height*height );
        return result;
            
    }

}
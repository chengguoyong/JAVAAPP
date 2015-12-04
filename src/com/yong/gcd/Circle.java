package com.yong.circle;

import com.yong.circle.Point;

public class Circle {
	Point point1;
	double radius;
	public Circle(Point p1, double radius){
		this.point1 = new Point(p1.getX(),p1.getY());
		this.radius = radius;
	}
	public double getCircumference(){
		return 2* Math.PI * radius;
	}
	public double getDiameter(){
		return 2 * radius;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}
	public double getSquare(double number){
		return number * number;
	}
	public double getDistance(Point p1,Point p2){
		return Math.sqrt(this.getSquare(Math.abs(p1.getX()-p2.getX())) + this.getSquare(Math.abs(p1.getY()-p2.getY())));
	}
	
	public boolean isInner(Point p){
		if (Math.sqrt(this.getSquare(Math.abs(p.getX()-point1.getX())) + this.getSquare(Math.abs(p.getY()-point1.getY()))) > this.radius)
		return false;
		else
			return true;
		
	}
}

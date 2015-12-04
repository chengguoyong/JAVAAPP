package com.yong.circle;

public class Point {
	double x,y;
	public Point(double x,double y){this.x=x;this.y=y;}
	public static Point Origin = new Point(0,0);
	@Override
	public String toString(){return ("(" + x + "," + y +")");}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
}

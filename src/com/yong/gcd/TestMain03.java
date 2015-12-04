package com.yong.gcd;

import com.yong.gcd.Point;
import com.yong.gcd.Circle;
import javax.swing.JOptionPane;
public class TestMain03 {
	public static void main(String[] args){
		String message = "Please input the center position ";
		String st_p1 = JOptionPane.showInputDialog(message + "1:");
		double po1 = Double.parseDouble(st_p1);
		String st_p2 = JOptionPane.showInputDialog(message + "2:");
		double po2 = Double.parseDouble(st_p2);
		
		Point p1 = new Point(po1,po2);
		String st_ra = JOptionPane.showInputDialog("Please input the radius:");
		double radius = Double.parseDouble(st_ra);
		
		System.out.println("p1 position is " + p1.toString());
		System.out.println("Circle radius is " + radius);
		Circle c = new Circle(p1,radius);
		System.out.println("Circle's Circumference is " + c.getCircumference());
		System.out.println("Circle's Area is " + c.getArea());
		System.out.println("Circle's Diameter is " + c.getDiameter());
		if (c.isInner(Point.Origin))
			System.out.println("Inside");

		message = "Please input the point position ";
		st_p1 = JOptionPane.showInputDialog(message + "1:");
		po1 = Double.parseDouble(st_p1);
		st_p2 = JOptionPane.showInputDialog(message + "2:");
		po2 = Double.parseDouble(st_p2);
		
		Point p3 = new Point(po1,po2);
		System.out.println("Distance is " + c.getDistance(p3,p1));
		if (c.isInner(p3))
			System.out.println(p3.toString() + " is inside.");
		else
			System.out.println(p3.toString() + " is outside.");	}
}

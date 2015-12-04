package com.yong.circlebox;

import javax.swing.JOptionPane;
public class Circlearea {
	public static void main(String[] args){
		String radiusString = JOptionPane.showInputDialog("Please input Radius");
		if (radiusString.trim().length() == 0)
			JOptionPane.showMessageDialog(null, "Input length is 0","Input data error",JOptionPane.ERROR_MESSAGE);
		else{
			double radius = Double.parseDouble(radiusString);
			double perimeter = 2 * Math.PI * radius;
			double area = Math.PI * radius * radius;
			String result = "Perimeter is " + Double.toString(perimeter) + "\nArea is " + Double.toString(area);
			JOptionPane.showMessageDialog(null,result,"Result",JOptionPane.INFORMATION_MESSAGE);
		}
			
	}

}

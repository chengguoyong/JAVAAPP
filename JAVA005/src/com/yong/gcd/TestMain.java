package com.yong.gcd;

import javax.swing.JOptionPane;
import com.yong.gcd.coreCount;

public class TestMain {
	public static void main(String[] args){
		Object obj1[] = {"GCD","LCM","Fraction","E","All"};
		String st = (String) JOptionPane.showInputDialog(null, "Please select the Result", "Select",JOptionPane.PLAIN_MESSAGE, null , obj1, "All");
		String st1 = JOptionPane.showInputDialog("Please input the First Number:");
		String st2 = JOptionPane.showInputDialog("Please input the Second Number:");
		int i1 = Integer.parseInt(st1);
		int i2 = Integer.parseInt(st2);
		coreCount c = new coreCount();
		String str ="";
		if (st == "GCD"){
			int i3 = c.getGcd(i1, i2);			
			str = "The GCD is " + String.valueOf(i3);
		}else if (st == "LCM"){
			int i4 = c.getLcm(i1, i2);
			str = "The LCM is " + String.valueOf(i4);
		}else if (st == "Fraction"){
			str = "The Fraction is " + c.getFraction(i1, i2);
		}else if (st == "E"){
			double number = c.getE(i1);
			str = ("The E is " + String.valueOf(number));
		}else if (st == "All"){
			int i3 = c.getGcd(i1, i2);			
			int i4 = c.getLcm(i1, i2);
			str = c.getFraction(i1, i2);
			str = "The GCD is " + String.valueOf(i3) +"\nThe LCM is " + String.valueOf(i4) +"\nThe Fraction is "+ str;
		}
		System.out.println(str.toString());
		/*JOptionPane.showMessageDialog(null, st3);*/
	}

}

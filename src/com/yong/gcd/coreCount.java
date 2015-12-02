package com.yong.gcd;

public class coreCount {
	public int getGcd(int i1,int i2 ){
		int i3 = 0;
		do {
			i3 = i1 % i2 ;
			i1 = i2;
			i2 = i3;
		}while (i2 != 0);
		return i1;
	}
	public int getLcm(int i1,int i2){
		return i1 * i2 / getGcd(i1,i2);
	}
	public String getFraction(int i1, int i2){
		int i3 = getGcd(i1,i2);
		i1 = i1 / i3;
		i2 = i2 / i3;
		return String.valueOf(i1) +"/" + String.valueOf(i2);
	}
	public double getE(int i1){
		int i,j;
		double n1 = 1,n2 =0, n3;
		for (i=1;i<=i1;i++) {
			n3 = 1;
			for (j=1;j<=i;j++){
				n3 = j * n3;
			}
		n2 = 1/n3;
		n1 = n1 + n2;
		}
		return n1;
	}
	
}
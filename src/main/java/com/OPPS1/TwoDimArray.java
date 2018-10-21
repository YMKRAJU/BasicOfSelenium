package com.OPPS1;

public class TwoDimArray {

	public static void main(String[] args) {
		Object obj[][]= new Object[2][3];
		System.out.println("!st row");
		obj[0][0]="MKR";
		obj[0][1]=77;
		obj[0][2]='Y';
		
		System.out.println("2nd row");
		obj[1][0]="Raju";
		obj[1][1]=6;
		obj[1][2]="Yarragudi";
		
		System.out.println(obj[1][2]);
		System.out.println("Number of rows are: "+obj.length);
		System.out.println("Number of columns are: "+obj[1].length);
	}

}

package com.bk.poc;

public class IntegerDate {

	public static void main(String[] args) {
		 int x = 100;

		    String x_str = Integer.toString(x);

		    int new_x = Integer.parseInt(x_str.substring(0, x_str.length()-2));

		    System.out.println(new_x);
	}
}

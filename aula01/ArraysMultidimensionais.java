package com.junio.aulaXTI;

public class ArraysMultidimensionais {

	public static void main(String[] args) {

		String[] uma = { "Francisco", "Sandra" };
		String[][] duas = { { "Francisco", "M", "SE" }, { "Sandra", "F", "BH" } };
		
		String[][][] tres = new String[10][10][10];
		
		System.out.println(duas[0][0]);
		System.out.println(duas[1][0]);
		System.out.println(duas.length);

	}

}

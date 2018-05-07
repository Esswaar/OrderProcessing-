package com.java.oopsconcepts;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the productID :");
		int productID = sc.nextInt();
		System.out.println("Enter quantity required of the product");
		int quantity = sc.nextInt();
		OrderClass object = new OrderClass();
		object.order(productID, quantity);
			
	}

}

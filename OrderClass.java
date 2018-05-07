package com.java.oopsconcepts;

public class OrderClass extends ProductClass {
	int quantityNeed;
	public void order(int productID, int quantityNeed) {
	switch(productID) {
		case 101:
			productOne(101,120,quantityNeed);
			break;
		case 102:
			productTwo(102,200,quantityNeed);
			break;
		case 103:
			productThree(103, 300, quantityNeed);
			break;
		default:
			System.out.println(" enter valid details of product");
			break;
			
			
		}
//		if(productID == 101) {
//			obj.productOne(101,120,quantityNeed);
//		}
//		else if (productID == 102) {
//			obj.productTwo(102,200,quantityNeed);
//		}
		
	}
	
}

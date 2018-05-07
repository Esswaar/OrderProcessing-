package com.java.oopsconcepts;

public class ProductClass {
public int productId;
public int quantity;
public void quantityValidation(int quantity, int quantityNeed) {
	if(quantityNeed <= quantity && quantityNeed >= 0) {
		System.out.println("the quantity of the given product is approved");
		quantity = quantity - quantityNeed;
		System.out.println("The remaining quantity of the given product is " + quantity);
		
	}
	else if(quantityNeed > quantity ) {
		System.out.println("the quantity is out of stock");
	}
	else if(quantityNeed < 0){
		System.out.println("enetered stock is negative ");
	}
	
}
public void productOne(int productId, int quantity, int quantityNeed) {
	quantityValidation(quantity, quantityNeed);

}
public void productTwo(int productId, int quantity, int quantityNeed) {

	quantityValidation(quantity, quantityNeed);
}
public void productThree(int i, int j, int quantityNeed) {
	// TODO Auto-generated method stub
	quantityValidation(quantity, quantityNeed);
	
}

}

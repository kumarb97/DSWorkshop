/**
 * Super class car and we have declared variable speed, regularPrice and color
 * We have created a parameterized constructor with these inputs
 * We have also created a method getSalePrice
 * @author Kumar Bamankar
 *
 */
package autoshop;

public class Car {
	protected int speed;
	protected double regularPrice;
	protected String color;
	protected double salePrice;
	
	/**
	 * Parameterized constructor with input speed, price and color
	 * @param speed  - we pass the speed of the car
	 * @param regularPrice - we pass the price of the car
	 * @param color -  to pass the color of the car
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
    
	/**
	 * In this method we return the sale price of the car
	 * @return
	 */
	double getSalePrice() {
		salePrice = regularPrice;
		return salePrice;
	}

}


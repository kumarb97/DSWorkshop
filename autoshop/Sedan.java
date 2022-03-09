/**
 * Class sedan than extends car
 * We have created variable length and amount here
 * @author Kumar Bamankar
 *
 */
package autoshop;

public class Sedan extends Car {
	
	/**
	 *  Parameterized constructor
	 * @param speed  - we pass the speed of the sedan
	 * @param regularPrice - we pass the price of the sedan
	 * @param color -  to pass the color of the sedan
	 * @param length - to pass the length to calculate the price
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
	    this.length = length;
	}
	
	int length;
	
	/**
	 * We have created this method to calculate the discount price of the sedan.
	 * //If length is >20 feet,then 5% discount. 
	 * Otherwise, 10% discount.
	 * And return saleprice
	 */
	double getSalePrice(int length) {
		this.length = length;
		if(length > 20) {
			System.out.println("Hurray !! You got 5% discount");
			salePrice = regularPrice - (0.05 * regularPrice);
		}
		else {
			System.out.println("Hurray !! You got 10% discount");
			salePrice = regularPrice - (regularPrice/10);
		}
		return salePrice;
	}

}

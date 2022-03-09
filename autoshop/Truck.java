/**
 *  We have created the class Truck that extends the car class.
 *  In this class we have used inheritance and method overriding
 *  We have taken extra variable weight & amount 
 * @author Kumar Bamankar
 *
 */
package autoshop;

public class Truck extends Car {
	int weight;
    
	/**
	 * We have created a constructor with variables of the class and parent class
	 * @param speed - To assign the speed of the truck
	 * @param regularPrice -  To assign the price of the truck 
	 * @param color - to assign the color of the truck
	 * @param weight - to pass the weight of the truck
	 */
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	/**
	 * We have created this method to check the discount price of the truck.
	 *  If weight>2000,10%discount. Otherwise, 20% discount.
	 *  1. If the weight is more than 2000 then we calculate 10% discount
	 *  2  1. If the weight is less than 2000 then we calculate 20% discount
	 */
	double getSaleprice(int weight) {
		this.weight = weight;
		if(weight> 2000) {
			System.out.println("Vehicle weighs more 2000kg so, you got the discount of 10%");
			salePrice = regularPrice - (regularPrice/10);
		}
		else {
			System.out.println("Hurray !!! You got 20% discount");
			salePrice = regularPrice - (regularPrice/10 * 2);
		}
		return salePrice;
			
	}
}

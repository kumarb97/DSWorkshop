/**
 * created a class Ford that extends the car class
 * We have created year & manufacturerDiscount in this class
 * @author Kumar Bamankar
 *
 */
package autoshop;

public class Ford extends Car {
    
	/**
	 * Parameterized constructor
	 * @param speed - To assign the speed of the ford
	 * @param regularPrice -  To assign the price of the ford 
	 * @param color - to assign the color of the ford
	 * @param year -  to pass the year of manufacturing of ford
	 * @param manufacturerDiscount - We pass the manufacturerDiscount to the price of regular price
	 */
	public Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.manufacturerDiscount= manufacturerDiscount;
		this.year = year;
	}
	
	int year;
	double manufacturerDiscount;
	
	/**
	 * We return the Selling price after subtracting the manufacturerDiscount
	 */
	double getSalePrice(double manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
		salePrice = regularPrice - (manufacturerDiscount/100 * regularPrice);
		return salePrice;
	}

}

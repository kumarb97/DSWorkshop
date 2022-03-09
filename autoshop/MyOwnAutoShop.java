/**
 * Main method to implement the methods.
 * @author Kumar Bamankar
 *
 */
package autoshop;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		System.out.println("_____________________________");
		System.out.println("MY OWN AUTOSHOP");
		System.out.println("_____________________________");
		
		//If length>20 feet, 5% discount, Otherwise, 10% discount.
		System.out.println("\n -----SEDAN----- \n");
		Sedan sedan1 = new Sedan(220,100000,"Black", 12);
		System.out.println("Selling Price of sedan1 is " +sedan1.getSalePrice(12) +" Rupees");
		
		//From the sale price computed from Car class,subtract the manufacturer Discount
		System.out.println("\n -----FORD----- \n");
		Ford ford1 = new Ford(120,800000, "white", 1999, 10);
		System.out.println("Selling Price of ford1 is " +ford1.getSalePrice(10) +" Rupees");
		System.out.println("\n");
		Ford ford2 = new Ford(150,900000, "Maroon",2005,15);
		System.out.println("Selling Price of ford2 is " +ford2.getSalePrice(15) +" Rupees");
		
		System.out.println("\n -----TRUCK-----\n");
		//If weight>2000,10%discount. Otherwise, 20% discount.

		Truck truck = new Truck(100, 400000, "black", 4000);
		System.out.println(" Selling price of truck is " + truck.getSaleprice(4000) +" Rupees \n");

		Truck truck1 = new Truck(100, 600000, "blue", 3000);
		System.out.println(" Selling price of truck1 is " + truck1.getSaleprice(3000) +" Rupees");
		
		System.out.println("\n -----CAR----- \n");
		Car newcar = new Car(100, 500000, "Grey");
		System.out.println("Selling Price of newcar is " +newcar.getSalePrice() +" Rupees");
		
		
		

	}

}

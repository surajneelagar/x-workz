package com.xworks;

public class Battery {
	String  name;
	String color;
	BatteryType type;
	double price;


	public static void main(String[] args) {
		
		Battery ref1 = new Battery("Duracel" , "Black");
		Battery ref2 = new Battery("EverReady" , "Gray");
		
		ref1.setprice(15.2);
		ref2.setprice(11.3);
		
		ref1.display(BatteryType.CHARGEABLE);
		System.out.println("");
		ref2.display(BatteryType.LITHIUM);

	}

	Battery(String name , String color){
		this.name = name;
		this.color = color;
		}
		
		void setprice(double price) {
			this.price = price;
			}
		
		void display(BatteryType type) {
			this.type = type;
			System.out.println("Battery name is : " + this.name);
			System.out.println("Battery color is : " + this.color);
			System.out.println("Battery type is : " + this.type);
			System.out.println("Battery price is : " + this.price);

			
		}
}			
		
		
		
class Money{
	String country = "INDIA";
	String type;
	String currency;
	long denomination = 2000;
	
	Money(){
		System.out.println("Constructor 1");
	}
	Money(String country , String type){
		System.out.println("Constructor 2");
		this.country = country;
		this.type = type;
	}
	Money(String country , String type , String currency){
		this(country,type);
		System.out.println("Constructor 3");
		this.currency = currency;
	}
	Money(String country , String type , String currency , long denomination){
		this(country,type,currency);
		System.out.println("Constructor 4 ");
		this.denomination = denomination;
	}
	
}
	





class Metro{
	 String line = "green";
	double distance;
	String departure;
	String destination;
	long capacity = 5000l;
	
	Metro(){
		System.out.println("Constructor 1");
	}
	Metro(String line , double distance){
		System.out.println("Constructor 2");
		this.line = line;
		this.distance = distance;
	}
	Metro(String line , double distance , String departure){
		this(line,distance);
		System.out.println("Constructor 3");
		this.departure = departure;
	}
	Metro(String line , double distance , String departure , 
	      String destination){
		this(line,distance,departure);
		System.out.println("Constructor 4");
		this.destination = destination;
	}
	Metro(String line , double distance , String departure , 
	      String destination, long capacity){
		this(line,distance,departure,destination);
        System.out.println("Constructor 5");
		this.capacity = capacity;
	}
}
	
	



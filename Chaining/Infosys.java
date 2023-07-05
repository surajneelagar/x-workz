class Infosys{
	String founderName = "Narayana Murthy";
	String founderWifeName = "Sudha Murthy";
	String foundedIn;
	long totalEmployees;
	
	Infosys(){
		System.out.println("Constructor 1");
	}
	Infosys(String founderName , String founderWifeName){
		System.out.println("Constructor 2");
		this.founderName = founderName;
		this.founderWifeName = founderWifeName;
	}
	Infosys(String founderName , String founderWifeName , String foundedIn){
		this(founderName,founderWifeName);
		System.out.println("Constructor 3");
		this.foundedIn = foundedIn;
	}
	Infosys(String founderName , String founderWifeName , String foundedIn , long totalEmployees){
		this(founderName,founderWifeName,foundedIn);
		System.out.println("Constructor 4");
		this.totalEmployees = totalEmployees;
	}
	
}
	





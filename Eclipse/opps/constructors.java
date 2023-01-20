package oops;
 
	class constructors {
	    int num;
	    String name;
	 
	    // this would be invoked while an object
	    // of that class is created.
	    constructors() { 
	    	num = 1;
	    	name = "darshi";
	    	System.out.println("Constructor called"); }
	}
	 
	class GFG {
	    public static void main(String[] args)
	    {
	        // this would invoke default constructor.
	    	constructors geek1 = new constructors();
	 
	        // Default constructor provides the default
	        // values to the object like 0, null
	        System.out.println(geek1.name);
	        System.out.println(geek1.num);
	    }
	
}


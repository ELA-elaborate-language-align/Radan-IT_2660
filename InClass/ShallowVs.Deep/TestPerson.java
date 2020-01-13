
public class TestPerson
{
	
	public static void main(String[] args)
	{
	  Person tom;                    //allocates a referece variable named tom
	  tom = new Person(25, 187.6);   //creates an object of type Person and places its
	                                 //address into the reference variable tom
	  
	  Person mary = new Person(21, 127.3); //declares reference variable and creates
	                                       //object in one statement
	                                       
	  // Show the contents of the two objects
	  System.out.println("Show the contents of the original two objects.");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  
	  // Make a "shallow copy" 
	  tom = mary; //shallow copy of mary into tom
	  
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after the shallow copy is made");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary should have same contents.");
	  
	  //Change the contents of mary using a mutator method
	  mary.set(22, 128.2);
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after a change made to mary.");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary still have same contents\n"
	  	                 + "even though we only changed mary!!");
	  	                 
	  //Change the contents of tom using a mutator method
	  tom.set(25, 187.6);
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after a change made to tom.");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary still have same contents\n"
	  	                 + "even though we only changed tom!!");
	  System.out.println("Conclusion is that the shallow copy resulted in both");
	  System.out.println("reference variables pointing at same object!");
	  
	  //Change mary back to original value and make a "deep copy"
	  mary.set(21, 127.3);
	  tom = mary.deepCopy(); //deep copy of mary into tom
	  
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after the deep copy is made");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary should have same contents.");
	  
	  //Change the contents of tom using a mutator method
	  tom.set(25, 187.6);
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after a change made to tom.");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary now have different contents\n"
	  	                 + "and the change to tom did not affect mary");
      
      //Change the contents of mary using a mutator method
	  mary.set(22, 128.2);
	  //Show the contents of the two objects again
	  System.out.println("\nShow contents after a change made to mary.");
	  System.out.println("tom: " + tom);
	  System.out.println("mary: " + mary);
	  System.out.println("tom and mary still have different contents\n"
	                 	+ "and the change to mary did not affect tom");
      
	  System.out.println("Conclusion is that the deep copy resulted in each");
	  System.out.println("reference variable pointing at different objects!");
	  
	  
	  
	  
	  
	  
	}	
}

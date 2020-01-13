
public class Person
{ // definition of the data members
   private int age;
   private double weight;

  // definition of constructors
   public Person(int a, double w ) // the constructor
   {  age = a;
      weight = w;
   } // end of constructor
   
   public Person( )  //default constructor
   {
   	  age = 0;
   	  weight = 0.0;
   }
   
   // accessor methods
   public int getAge()
   {
   	  return age;
   }
   
   public double getWeight()
   {
   	  return weight;
   }
   
   // mutator methods
   public void setAge(int a)
   {
   	  age = a;
   }
   
   public void setWeight(double w)
   {
   	  weight = w;
   }
   
   public void set(int a, double w)
   {
   	  age = a;
   	  weight = w;
   }
   
   public String toString( )  // returns annotated value of data members
   {  return( "this person’s age is: " + age +
                "\nand their weight is: " + weight);
   } // end of toString method
   
   public Person deepCopy()  //simplified deep copy method, ignores case of null object to copy
   {
   	  Person p = new Person(age, weight);
   	  return p;
   }
      
} // end of Person class


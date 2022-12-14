
package practical1.payment;

public interface Payable  {
    int increase_cap = 15;
    boolean increasePay(int percent);
}

public class Person {
   private String name;
   
   public Person(String name) {
     this.name = name;
   }
   
   public String getName() {
     return "Person's name is " + name;
   }
}



public class Employee extends Person implements Payable {
   public boolean increasePay(int percent) {
     
   }
}



public class Contractor extends Person implements Payable {
    public boolean increasePay(int percent) {
     
   }
}
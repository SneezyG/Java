
/*
 supplying variables value to class instance and method through constructors.
*/

class TestTax{
  
  /*
  this create an instance of a worker, output both the taxed income and federal-taxed income for the worker.
  */
  
  public static void main(String[] args) {
     FederalWorker workerA = new FederalWorker(40000, "Nigeria");
     FederalWorker workerB = new FederalWorker(150000, "Canada");
     
     double taxedIncomeA = workerA.incomeCalculator();
     double fedTaxedIncomeA = workerA.incomeCalculator(taxedIncomeA);
     
     double taxedIncomeB = workerB.incomeCalculator();
     double fedTaxedIncomeB = workerB.incomeCalculator(taxedIncomeB);
     
     System.out.println("workerA taxed-income is : " + taxedIncomeA);
     System.out.println("workerA federal-taxed-income is : " + fedTaxedIncomeA);
     
     System.out.println("workerB taxed-income is : " + taxedIncomeB);
     System.out.println("workerB federal-taxed-income is : " + fedTaxedIncomeB);
     
  }
}




class Worker{
  
  /* 
  this Worker class calculates the taxed-income for an average worker based on their gross income.
  */
  
  double grossIncome;
  String nationality;
  
  Worker(double income, String origin) {
     grossIncome = income; //variable initialisation
     nationality = origin;
  }
 
  
  public double incomeCalculator() {
    // this return the taxedincome.
    
    if (grossIncome <= 30000) {
      return grossIncome;
    }
    else if (grossIncome > 30000 && grossIncome <= 60000) {
      double tax = grossIncome * 0.05;
      return grossIncome - tax;
    }
    else if (grossIncome > 60000 && grossIncome <= 100000) {
      double tax = grossIncome * 0.07;
      return grossIncome - tax;
    }
    else if (grossIncome > 100000 && grossIncome <= 500000) {
      double tax = grossIncome * 0.09;
      return grossIncome - tax;
    }
    else{
      double tax = grossIncome * 0.15;
      return grossIncome - tax;
    }
   
  }
  
}




class FederalWorker extends Worker{
  
  /* 
  this FederalWorker class is a subclass of Worker class, have an additional method that calculates the federal-Taxed-Income for a federal worker from the taxed-income.
  */
  
  FederalWorker(double income, String origin) {
     // calling super for variable initialisation.
     super(income, origin);
  }
  
  public double incomeCalculator(double taxedIncome) {
    // this return the fedTaxedIncome.
    
    if (grossIncome > 100000) {
      double tax = taxedIncome * 0.05;
      return taxedIncome - tax;
    }
    else{
      return taxedIncome;
    }
  
  }
  
}
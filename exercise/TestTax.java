

class TestTax{
  
  /*
  this create an instance of a Nigerian worker, output both the taxed income and federal taxed income for the worker.
  */
  
  public static void main(String[] args) {
   FederalWorker workerA = new FederalWorker();
   workerA.grossIncome = 500000;
   
   double taxedIncome = workerA.incomeCalculator();
   double fedTaxedIncome = workerA.incomeCalculator(taxedIncome);
   
   System.out.println("workerA taxed-income is : " + taxedIncome);
   System.out.println("workerA federal-taxed-income is : " + fedTaxedIncome);
   
  }
}




class Worker{
  
  /* 
  this Worker class calculates the taxed-income for an average Nigerian worker based on their gross income.
  */
  
  double grossIncome;
  final String nationality = "Nigeria";
  
  public double incomeCalculator() {
    // this return the taxedincome
    if (grossIncome <= 30000) {
      return grossIncome;
    }
    else if (grossIncome > 30000 && grossIncome <= 60000) {
      return grossIncome - (grossIncome * (5/100));
    }
    else if (grossIncome > 60000 && grossIncome <= 100000) {
      return grossIncome - (grossIncome * (7/100));
    }
    else if (grossIncome > 100000 && grossIncome <= 500000) {
      return grossIncome - (grossIncome * (9/100));
    }
    else{
      return grossIncome - (grossIncome * (15/100));
    }
   
  } 
  
}




class FederalWorker extends Worker{
  
  /* 
  this FederalWorker class is a subclass of Worker class, have an additional method that calculates the federal-Taxed-Income for a Nigerian federal worker from the taxed-income
  */
  
  public double incomeCalculator(double taxedIncome) {
    // this return the fedTaxedIncome.
    if (grossIncome > 100000) {
      return taxedIncome - (taxedIncome * (5/100));
    }
    else{
      return taxedIncome;
    }
  
  }
  
}
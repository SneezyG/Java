

class TestTax{
  
  /*
  this create an instance of a Nigerian worker, output both the taxed income and federal taxed income for the worker.
  */
  
  public static void main(String[] args) {
   FederalWorker workerA = new FederalWorker();
   workerA.grossIncome = 70000;
   
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
  this FederalWorker class is a subclass of Worker class, have an additional method that calculates the federal-Taxed-Income for a Nigerian federal worker from the taxed-income
  */
  
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
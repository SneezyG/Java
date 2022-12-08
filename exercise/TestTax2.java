

/*
 supply variable value to program during runtime.
*/


class TestTax{
  
  /*
  this create an instance of a worker, output both the taxed income and federal-taxed income for the worker.
  */
  
  public static void main(String[] args) {
     FederalWorker worker = new FederalWorker(Double.parseDouble(args[0]), args[1]);
     
     double taxedIncome = worker.incomeCalculator();
     double fedTaxedIncome = worker.incomeCalculator(taxedIncome);
     
     System.out.println("worker taxed-income is : " + taxedIncome);
     System.out.println("worker federal-taxed-income is : " + fedTaxedIncome);
     
  }
}




class Worker{
  
  /* 
  this Worker class calculates the taxed-income for an average worker based on their region.
  */
  
  double grossIncome;
  String continent;
  
  Worker(double income, String region) {
     grossIncome = income; //variable initialisation
     continent = region;
  }
 
  
  public double incomeCalculator() {
    // this return the taxedincome.
    // worker income is taxed based on region.
    double tax;
    
    switch (continent) {
      case "africa":
        return grossIncome;
      case "asia":
        tax = grossIncome * 0.05;
        return grossIncome - tax;
      case "australia":
        tax = grossIncome * 0.07;
        return grossIncome - tax;
      case "america":
        tax = grossIncome * 0.09;
        return grossIncome - tax;
      default:
        tax = grossIncome * 0.15;
        return grossIncome - tax;
    }
    
  }
}




class FederalWorker extends Worker{
  
  /* 
  this FederalWorker class is a subclass of Worker class, have an additional method that calculates the federal-Taxed-Income for a federal worker from the taxed-income based on gross-income.
  */
  
  FederalWorker(double income, String region) {
     // calling super for variable initialisation.
     super(income, region);
  }
  
  public double incomeCalculator(double taxedIncome) {
    // this return the fedTaxedIncome.
    // worker income is taxed based on gross-income.
    if (grossIncome > 100000) {
      double tax = taxedIncome * 0.05;
      return taxedIncome - tax;
    }
    else{
      return taxedIncome;
    }
  }
  
}
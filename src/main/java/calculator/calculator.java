package calculator;

public class calculator {
	public double addition (double a,double b){
		   return a+b;
	}
	
	public double substaction (double a, double b){
		   return a-b;
	}
	
	public double multiplikation (double a, double b){
		   return a*b;
	}
	
	public double division (double a,double b){
		   if (b>0){
		      return a/b;
		   } else {
			   System.out.println("Division with zero error");
			  return 0;
		   }
	}

}

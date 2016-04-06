package calculator;
import java.util.Scanner;

public class main {

	public main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		int r;
		calculator cl = new calculator();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Använd punkt som decimal\n");
		System.out.println("Ange första talet: ");
		a=sc.nextDouble();
		System.out.println("Ange andra talet: ");
		b=sc.nextDouble();
		System.out.println("Ange räknesätt: ");
		System.out.println("1=Addition");
		System.out.println("2=Substraktion");
		System.out.println("3=Multiplikation");
		System.out.println("4=Division");
		r=sc.nextInt();
		
		switch (r){
		case 1: System.out.println("Resultat addition :"+cl.addition(a, b));
		        break;
		case 2: System.out.println("Resultat subtraktion: "+cl.substaction(a, b));
		        break;
		case 3: System.out.println("Resultat multiplikation: "+cl.multiplikation(a, b));
		        break;
		case 4: System.out.println("Resultat division: "+cl.division(a, b));
		        break;
		default: System.out.println("Felaktigt val");
		
		sc.close();
				
		}
		
		
	}

}

package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

	
	@Test
	public void testaddition1() {
		   double a=31.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Addition 1:"+ cl.addition(a, b));
		   assertEquals("Felaktig addition",a+b,cl.addition(a, b),d);
	}
	@Test
	public void testaddition2() {
		   double a=32992331.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Addition 2:"+ cl.addition(a, b));
		   assertEquals("Felaktig addition",a+b,cl.addition(a, b),d);
	}
	@Test
	public void testaddition3() {
		   double a=-32931.23;
		   double b=-24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Addition 1:"+ cl.addition(a, b));
		   assertEquals("Felaktig addition",a+b,cl.addition(a, b),d);
	}
	@Test
	public void subtraction1() {
		   double a=31.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Subtraction 1:"+ cl.substaction(a, b));
		   assertEquals("Felaktig subtraktion",a-b,cl.substaction(a, b),d);
	}
	@Test
	public void subtraction2() {
		   double a=31329976.23;
		   double b=24992173.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Subtraction 2:"+ cl.substaction(a, b));
		   assertEquals("Felaktig subtraktion",a-b,cl.substaction(a, b),d);
	}
	@Test
	public void subtraction3() {
		   double a=-31.23;
		   double b=-24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Subtraction 3:"+ cl.substaction(a, b));
		   assertEquals("Felaktig subtraktion",a-b,cl.substaction(a, b),d);
	}
	@Test
	public void multiplikation1() {
		   double a=31.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Multiplikation 1:"+ cl.multiplikation(a, b));
		   assertEquals("Felaktig subtraktion",a*b,cl.multiplikation(a, b),d);
	}
	@Test
	public void multiplikation2() {
		   double a=31329976.23;
		   double b=24992173.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Multiplikation 2:"+ cl.multiplikation(a, b));
		   assertEquals("Felaktig subtraktion",a*b,cl.multiplikation(a, b),d);
	}
	@Test
	public void multiplikation3() {
		   double a=-31.23;
		   double b=-24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Multiplikation 3:"+ cl.multiplikation(a, b));
		   assertEquals("Felaktig subtraktion",a*b,cl.multiplikation(a, b),d);
	}
	@Test
	public void division1() {
		   double a=31.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Division 1:"+ cl.division(a, b));
		   assertEquals("Felaktig division",a/b,cl.division(a, b),d);
	}
	@Test
	public void division2() {
		   double a=31329976.23;
		   double b=24992173.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Division 2:"+ cl.division(a, b));
		   assertEquals("Felaktig division",a/b,cl.division(a, b),d);
	}
	@Test
	public void division3() {
		   double a=31.23;
		   double b=24.32;
		   double d=0.01;
		   calculator cl = new calculator();
		   System.out.println("Division 3:"+ cl.division(a, b));
		   assertEquals("Felaktig division",a/b,cl.division(a, b),d);
	}

}

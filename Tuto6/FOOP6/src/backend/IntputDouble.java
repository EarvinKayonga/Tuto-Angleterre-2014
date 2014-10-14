package backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntputDouble {

	 public static int inputInt() {
		 int res;
		 Scanner s;
		 while (true) {
			 s = new Scanner(System.in);
			 try {
				 res=s.nextInt();
				 return res;
			 } catch (InputMismatchException e) {
				 System.err.println("Wrong input, plz insert int");
			 }
		 }		 
	 }

	 public static double inputDouble() {
		 double res;
		 Scanner s;
		 while (true) {
			 try {
				 s = new Scanner(System.in);
				 res=s.nextDouble();
				 return res;
			 } catch (InputMismatchException e) {
				 System.err.println("Wrong input, plz insert double");
			 }
		 }		 
	 } 

	 public static void main(String [] args) {
		 System.out.println(inputInt());
		 System.out.println(inputDouble());
	 }
}

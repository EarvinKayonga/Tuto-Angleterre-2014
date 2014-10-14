package part1;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {

	public static int inputInt() {
		Scanner scan;
		boolean saisieCorrecte=false;
		int res=0;
		while (!saisieCorrecte) {
			try {
				scan = new Scanner(System.in);
				System.out.println("Entrez un entier:");
				res=scan.nextInt();
				saisieCorrecte=true;
				scan.close();
			} catch (InputMismatchException e) {
				System.err.println("ERREUR: Entrez un entier.");
				saisieCorrecte=false;
			}
		}
		return res;
	}
	
	public static double inputDouble() {
		Scanner scan;
		boolean saisieCorrecte=false;
		double res=0;
		while (!saisieCorrecte) {
			try {
				scan = new Scanner(System.in);
				System.out.println("Entrez un double:");
				res=scan.nextDouble();
				saisieCorrecte=true;
				scan.close();
			} catch (InputMismatchException e) {
				System.err.println("ERREUR: Entrez un double.");
				saisieCorrecte=false;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(UserInput.inputInt());
		System.exit(1);
	}

}

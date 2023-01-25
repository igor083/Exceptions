package questoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) throws Exception {
		  Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite o dividendo: ");
			Double a = sc.nextDouble();
			System.out.println("Digite o divisor: ");
			Double b = sc.nextDouble();
			sc.close();
			if(b==0)throw new ArithmeticException();
			System.out.println(a/b);
		} 
		catch (ArithmeticException e) {
			System.out.println("Divisao por 0.0 nao e possivel.");
		} 
		catch (InputMismatchException e) {
			System.out.println("O valor informado nao e numerico.");

		}

	}

}

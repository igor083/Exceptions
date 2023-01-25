package questoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int[] vetor = new int[10];
			int i = 0;
			while (i > -1) {
				int j = sc.nextInt();
				vetor[i] = j;
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Impossivel adicionar mais valores memoria cheia.");

		} catch (InputMismatchException e) {
			System.out.println("Valor informado nao e numerico.");

		}

	}
}

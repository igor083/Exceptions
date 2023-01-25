package questao3;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome de usuario: ");
		String usuario= sc.nextLine();
		System.out.println("Digite senha: ");
		String senha= sc.nextLine();
		
		Login login = new Login(usuario,senha);
		
		System.out.println("Digite seu usuario: ");
		String usu= sc.nextLine();
		System.out.println("Digite sua senha: ");
		String sen= sc.nextLine();
		
		login.fazerLogin(usu, sen);
		

		
	}

}

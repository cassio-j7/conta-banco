package Application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe o número da sua conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Informe o numero da sua agência: (Ex: xxx-x) ");
		String agencia = scanner.next();
		
		System.out.println("Informe seu nome completo: ");
		String nomeCompleto = scanner.next();
		scanner.nextLine();
		
		
		System.out.println("Informe o saldo atual da sua conta: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("----------------------------");
		System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + 
				", conta " + numeroConta + ", e seu saldo é de " + saldo + ", já disponível para saque.") ;
		

	}

}

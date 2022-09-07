package projeto;

import java.util.Scanner;

public class ProjetoNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um n�mero: ");
		int n = sc.nextInt();
		System.out.println("Sequencia dos n�meros: ");
		for(int i=0;i<n;i++) {
			System.out.print(i + 1 + " ");
		}
		
		
		int pares = 0;
		System.out.println();
		System.out.println("N�meros pares: ");
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				System.out.print (i + " ");
				pares++;
			}
		}
			System.out.println();
			System.out.println("Quantidade de n�meros pares: " + pares);
	
			
		int impares = 0;
		System.out.println();
		System.out.println("N�meros impares: ");
		for(int i=0;i<n;i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
				impares++;
			}
		}
			System.out.println();
			System.out.println("Quantidade de n�meros impares: " + impares);
			
		
		int primos = 0;
		System.out.println();
		System.out.println("N�meros primos: ");
		for(int i=1;i<=n;i++) {
			boolean primo = true;
			
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.print(i + " ");
				primos++;
			}
		}
			System.out.println();
			System.out.println("Quantidade de n�meros primos: " + primos);
			
		sc.close();
	}

}

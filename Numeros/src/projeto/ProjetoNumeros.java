package projeto;

import java.util.Scanner;

public class ProjetoNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um número: ");
		int n = sc.nextInt();
		System.out.println("Sequencia dos números: ");
		for(int i=0;i<n;i++) {
			System.out.print(i + 1 + " ");
		}
		
		
		int pares = 0;
		System.out.println();
		System.out.println("Números pares: ");
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				System.out.print (i + " ");
				pares++;
			}
		}
			System.out.println();
			System.out.println("Quantidade de números pares: " + pares);
	
			
		int impares = 0;
		System.out.println();
		System.out.println("Números impares: ");
		for(int i=0;i<n;i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
				impares++;
			}
		}
			System.out.println();
			System.out.println("Quantidade de números impares: " + impares);
			
		
		int primos = 0;
		System.out.println();
		System.out.println("Números primos: ");
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
			System.out.println("Quantidade de números primos: " + primos);
			
		sc.close();
	}

}

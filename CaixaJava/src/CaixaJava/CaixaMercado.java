
package CaixaJava;

import java.util.Scanner;

public class CaixaMercado {
	public static void main(String[] args) {
		
		int pao = 0;
		int carne = 0;
		int arroz = 0;
		int feijao = 0;
		int ovo = 0;
		
		for (int n = 0; n < 1000000; n++)
        {
		
	System.out.println("\nDigite qual desses vai levar: ");
	System.out.println("1 = pao \n 2 = carne \n 3 = arroz \n 4 = feijao \n 5 = ovo"); 
	Scanner	escolha = new Scanner(System.in);
	int valor = escolha.nextInt();
		if(valor == 1) {
			System.out.println("\nQual a quantidade: ");
			 pao = escolha.nextInt();
			 escolha.nextLine();
		}
		if(valor == 2) {
			System.out.println("\nQual a quantidade: ");
			 carne = escolha.nextInt();
			 escolha.nextLine();
		}
		if(valor == 3) {
			System.out.println("\nQual a quantidade: ");
			 arroz = escolha.nextInt();
			 escolha.nextLine();
		}
		if(valor == 4) {
			System.out.println("\nQual a quantidade: ");
			 feijao = escolha.nextInt();
			 escolha.nextLine();
		}
		if(valor == 5) {
			System.out.println("\nQual a quantidade: ");
			 ovo = escolha.nextInt();
			 escolha.nextLine();
		}
		if(valor > 5 && valor < 1) {
			System.out.println("\nErro, digite de novo ");
		}
	
		System.out.println("\nDeseja continuar?, digite \"sim\" ou \"nao\" : ");
		
		String decisao = escolha.nextLine();
		if ("nao".equals(decisao) ) 
        {
		System.out.printf("\nItens\n pao %d\n carne %d \n arroz %d \n feijao %d \n ovo %d",
				 pao, carne ,arroz, feijao, ovo);
		escolha.close();
		break;
        }
		
		
        }
		
	}
}
